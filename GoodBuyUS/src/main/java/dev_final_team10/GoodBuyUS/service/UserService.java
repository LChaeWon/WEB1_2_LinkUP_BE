package dev_final_team10.GoodBuyUS.service;

import dev_final_team10.GoodBuyUS.domain.user.dto.UserSignUpDto;
import dev_final_team10.GoodBuyUS.domain.user.entity.Role;
import dev_final_team10.GoodBuyUS.domain.user.entity.User;
import dev_final_team10.GoodBuyUS.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Value("${file.upload-dir}")
    private String uploadDir;

    //자체 회원 가입 메소드
    public ResponseEntity<String> signUp(UserSignUpDto userSignUpDto, MultipartFile profile) throws Exception {

        if(userRepository.findByEmail(userSignUpDto.getEmail()).isPresent()){
            throw new Exception("이미 존재하는 이메일입니다.");
        }
        if(userRepository.findByNickname(userSignUpDto.getNickname()).isPresent()){
            throw new Exception("이미 존재하는 닉네임입니다.");
        }
        if(userRepository.findByPhone(userSignUpDto.getPhone()).isPresent()){
            throw new Exception("이미 존재하는 전화번호입니다.");
        }

        //프로필 이미지 저장
        String profileImagePath = saveProfileImage(profile);


        //User Entity 생성 후 DB저장
        User user = User.builder()
                .email(userSignUpDto.getEmail())
                .password(userSignUpDto.getPassword())
                .name(userSignUpDto.getName())
                .phone(userSignUpDto.getPhone())
                .nickname(userSignUpDto.getNickname())
                .profile(profileImagePath)
                .role(Role.USER)
                .refreshToken(null)
                .build();

        user.passwordEncode(passwordEncoder);
        userRepository.save(user);
        userRepository.flush();

        return ResponseEntity.ok("회원가입 완료");
    }

    // 프로필 이미지를 서버에 저장하는 메소드
    private String saveProfileImage(MultipartFile profile) throws IOException {
        if (profile == null || profile.isEmpty()) {
            throw new IOException("프로필 이미지를 선택해 주세요.");
        }

        // 파일 이름 추출
        String fileName = StringUtils.cleanPath(profile.getOriginalFilename());

        // 파일 저장 경로 설정
        Path targetLocation = Paths.get(uploadDir).resolve(fileName);

        // 디렉터리 생성 (경로가 없으면 생성)
        Files.createDirectories(targetLocation.getParent());

        // 파일 저장
        profile.transferTo(targetLocation);

        // 저장된 이미지 파일 경로 반환 (URL로 변경 가능)
        return targetLocation.toString();  // 또는 저장된 경로의 URL 반환 가능
    }
}
