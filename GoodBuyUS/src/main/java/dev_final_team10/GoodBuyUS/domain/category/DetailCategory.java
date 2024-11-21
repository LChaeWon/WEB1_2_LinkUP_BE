package dev_final_team10.GoodBuyUS.domain.category;

public enum DetailCategory {
    FRESH_FOOD_FRUITS("과일"),
    FRESH_FOOD_VEGETABLES("채소"),
    FRESH_FOOD_MEAT("육류"),
    FRESH_FOOD_SEAFOOD("해산물"),
    FRESH_FOOD_DAIRY("유제품"),
    PROCESSED_FOOD_FROZEN("냉동식품"),
    PROCESSED_FOOD_SNACKS("스낵"),
    PROCESSED_FOOD_DRINKS("음료"),
    PROCESSED_FOOD_CANNED("통조림"),
    HEALTH_FOOD_VITAMINS("비타민"),
    HEALTH_FOOD_SUPPLEMENTS("영양제"),
    HEALTH_FOOD_SUPERFOODS("슈퍼푸드"),

    KITCHEN_TOOLS("냄비"),
    KITCHEN_TOOLS_FRYING_PAN("프라이팬"),
    KITCHEN_TOOLS_CUTTING_BOARD("도마"),
    KITCHEN_TOOLS_KNIFE("칼"),
    KITCHEN_TOOLS_APPLIANCES("주방가전"),

    BATHROOM_TOOLS("세면도구"),
    BATHROOM_TOOLS_TOWELS("수건"),
    BATHROOM_TOOLS_CLEANING("욕실 청소 도구"),

    CLEANING_SUPPLIES_DETERGENT("세제"),
    CLEANING_SUPPLIES_VACUUM("청소기"),
    CLEANING_SUPPLIES_TRASH_BAGS("쓰레기봉투"),
    CLEANING_SUPPLIES_MOP("걸레"),

    MEN_CLOTHING_TSHIRT("티셔츠"),
    MEN_CLOTHING_PANTS("바지"),
    MEN_CLOTHING_OUTER("아우터"),

    WOMEN_CLOTHING_DRESS("원피스"),
    WOMEN_CLOTHING_BLOUSE("블라우스"),
    WOMEN_CLOTHING_SKIRT("스커트"),

    ACCESSORIES_BAGS("가방"),
    ACCESSORIES_WALLETS("지갑"),
    ACCESSORIES_HATS("모자"),
    ACCESSORIES_SHOES("신발"),

    KIDS_CLOTHING_TSHIRT("아동 티셔츠"),
    KIDS_CLOTHING_PANTS("바지"),
    KIDS_CLOTHING_SHOES("신발"),

    HOME_APPLIANCES_FRIDGE("냉장고"),
    HOME_APPLIANCES_WASHER("세탁기"),
    HOME_APPLIANCES_AIR_PURIFIER("공기청정기"),

    IT_DEVICES_LAPTOP("노트북"),
    IT_DEVICES_TABLET("태블릿"),
    IT_DEVICES_SMARTPHONE("스마트폰"),

    SMALL_APPLIANCES_COFFEE_MACHINE("커피머신"),
    SMALL_APPLIANCES_ELECTRIC_KETTLE("전기포트"),
    SMALL_APPLIANCES_BLENDER("믹서기"),

    ACCESSORY_DEVICES_CHARGERS("충전기"),
    ACCESSORY_DEVICES_EARPHONES("이어폰"),
    ACCESSORY_DEVICES_CABLES("케이블"),

    FURNITURE_DESK("책상"),
    FURNITURE_CHAIR("의자"),
    FURNITURE_BED("침대"),
    FURNITURE_SOFA("소파"),

    INTERIOR_DECOR_LIGHTS("조명"),
    INTERIOR_DECOR_FRAMES("액자"),
    INTERIOR_DECOR_RUGS("러그"),
    INTERIOR_DECOR_CURTAINS("커튼"),

    STORAGE_BOXES("수납박스"),
    STORAGE_CABINETS("서랍장"),
    STORAGE_CLOTHES_RACK("옷걸이"),

    TOYS_BLOCKS("블록"),
    TOYS_PUZZLES("퍼즐"),
    TOYS_DOLLS("인형"),

    EDUCATIONAL_TOOLS_LEARNING("학습도구"),
    EDUCATIONAL_TOOLS_BOOKS("책"),
    EDUCATIONAL_TOOLS_FLASHCARDS("플래시 카드"),

    BABY_ITEMS_DIAPERS("기저귀"),
    BABY_ITEMS_STROLLER("유모차"),
    BABY_ITEMS_CRIB("아기 침대"),

    SPORTS_EQUIPMENT_BICYCLE("자전거"),
    SPORTS_EQUIPMENT_SOCCER_BALL("축구공"),
    SPORTS_EQUIPMENT_YOGA_MAT("요가 매트"),

    CAMPING_EQUIPMENT_TENT("텐트"),
    CAMPING_EQUIPMENT_SLEEPING_BAG("침낭"),
    CAMPING_EQUIPMENT_CAMP_CHAIR("캠핑 의자"),

    LEISURE_EQUIPMENT_DRONE("드론"),
    LEISURE_EQUIPMENT_FISHING_ROD("낚싯대"),
    LEISURE_EQUIPMENT_SCUBA("스쿠버 장비"),

    PET_FOOD_DOG("강아지 사료"),
    PET_FOOD_CAT("고양이 사료"),
    PET_FOOD_OTHER("기타 반려동물 사료"),

    PET_ACCESSORIES_TOYS("장난감"),
    PET_ACCESSORIES_COLLAR("목줄"),
    PET_ACCESSORIES_CARRIER("이동장"),

    PET_HEALTH_SHAMPOO("샴푸"),
    PET_HEALTH_VITAMINS("비타민"),
    PET_HEALTH_MEDICINE("치료제"),

    COSMETICS_SKINCARE("스킨케어"),
    COSMETICS_MAKEUP("메이크업"),
    COSMETICS_MEN("남성 화장품"),

    HEALTH_TOOLS_SCALES("체중계"),
    HEALTH_TOOLS_MASSAGER("마사지기"),
    HEALTH_TOOLS_REHAB("재활 기구"),

    HAIR_BODY_SHAMPOO("샴푸"),
    HAIR_BODY_HAIRDRYER("헤어드라이어"),
    HAIR_BODY_BODY_LOTION("바디로션"),

    SUMMER_ITEMS_FAN("선풍기"),
    SUMMER_ITEMS_AIRCON("에어컨"),
    SUMMER_ITEMS_CLOTHING("여름 의류"),

    WINTER_ITEMS_HEATER("히터"),
    WINTER_ITEMS_HEATING_MAT("온열매트"),
    WINTER_ITEMS_BLANKET("두꺼운 담요"),

    OUTDOOR_ITEMS_HAMMOCK("해먹"),
    OUTDOOR_ITEMS_UMBRELLA("파라솔"),
    OUTDOOR_ITEMS_ICEBOX("아이스박스"),

    PARTY_ITEMS_BALLOONS("풍선"),
    PARTY_ITEMS_TABLE_SETTING("테이블 세팅"),
    PARTY_ITEMS_DECORATIONS("장식품"),

    DIY_TOOLS_KITS("공예 키트"),
    DIY_TOOLS_PAINT("페인트"),
    DIY_TOOLS_TOOLS("공구 세트"),

    MUSIC_INSTRUMENTS_GUITAR("기타"),
    MUSIC_INSTRUMENTS_KEYBOARD("키보드"),
    MUSIC_INSTRUMENTS_SOUND_EQUIPMENT("음향 장비"),

    CAR_ACCESSORIES_VEHICLE("차량 관리 용품"),
    CAR_ACCESSORIES_NAVIGATION("네비게이션"),

    TOOLS_DRILL("드릴"),
    TOOLS_NUTS_BOLTS("나사"),
    TOOLS_WORK_CLOTHES("작업복");

    private final String description;

    DetailCategory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
