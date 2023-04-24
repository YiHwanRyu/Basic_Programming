
public class Constants {
	public static final int BABY_PRICE = 0,
							ADULT_DAY_PRICE = 56000, ADULT_NIGHT_PRICE = 46000,
							TEEN_DAY_PRICE = 47000, TEEN_NIGHT_PRICE = 40000,
							CHILD_DAY_PRICE = 44000, CHILD_NIGHT_PRICE = 37000,
							OLD_DAY_PRICE = 44000, OLD_NIGHT_PRICE = 37000;
	public static final int MIN_BABY = 2, 
			 				MIN_CHILD = 3, MIN_TEEN = 13, MIN_ADULT = 19,
			 				MAX_CHILD = 12, MAX_TEEN = 18, MAX_ADULT = 64;
	public static final float DIFFICULTY_DISCOUNT_RATE = 0.6f, MERIT_DISCOUNT_RATE = 0.5f,
							  MULTIPLE_KIDS_DISCOUNT_RATE = 0.8f, PREGNANT_DISCOUNT_RATE = 0.85f;
	public static final int BABY = 0, CHILD = 1, TEEN = 2, ADULT = 3, OLD = 4;
	public static final int DAY = 1, NIGHT = 2;
	public static final int NONE = 1,  DIFFICULTY = 2, MERIT = 3, MULTIKIDS = 4, PREGNANT = 5;
	public static final int ENGLISH = 1, KOREAN = 2, JAPANESE = 3;
	// MESSAGE for program
	public static String WELLCOME_MESSAGE = "";
	public static String CHOSING_TICKET_MESSAGE = "";
	public static String CHOSING_TICKET_MESSAGE_DAY = "";
	public static String CHOSING_TICKET_MESSAGE_NIGHT = "";
	public static String PERSONNUMBER_MESSAGE = "";
	public static String PERSONNUMBER_MESSAGE_NOTICE = "";
	public static String COUNTS_MESSAGE = "";
	public static String COUNTS_MESSAGE_NOTICE = "";
	public static String SPECIALORDERS_MESSAGE = "";
	public static String SPECIALORDERS_MESSAGE_NONE = "";
	public static String SPECIALORDERS_MESSAGE_DIFFICULTY = "";
	public static String SPECIALORDERS_MESSAGE_MERIT = "";
	public static String SPECIALORDERS_MESSAGE_MULTIKIDS = "";
	public static String SPECIALORDERS_MESSAGE_PREGNANT = "";
	public static String BUYING_MESSAGE = "";
	public static String BUYING_MESSAGE_TICKET = "";
	public static String BUYING_MESSAGE_EXIT = "";
	public static String CONTINUE_MESSAGE = "";
	public static String END_MESSAGE = "";
	
	public static String UNIT_MESSAGE = "";
	public static String PRICE_MESSAGE = "";
	public static String TOTAL_MESSAGE = "";
	public static String PROFIT_MESSAGE = "";
	public static String BABY_MESSAGE = "";
	public static String CHILD_MESSAGE = "";
	public static String TEEN_MESSAGE = "";
	public static String ADULT_MESSAGE = "";
	public static String OLD_MESSAGE = "";
	public static String REPORT_MESSAGE = "";
	public static String RESULT_MESSAGE_CHOICES = "";
	public static String RESULT_MESSAGE_SPECIALORDERS = "";
	public static String HEADOFTOTAL = "";

	
	public static void languageSelect(int language) {
		if (language == ENGLISH) {
			Constants.WELLCOME_MESSAGE = "Welcome to PolyLand!!";
			Constants.CHOSING_TICKET_MESSAGE = "Choose your type of ticket!";
			Constants.CHOSING_TICKET_MESSAGE_DAY = "Daytime";
			Constants.CHOSING_TICKET_MESSAGE_NIGHT = "Nighttime";
			Constants.PERSONNUMBER_MESSAGE = "Please input your Resident Registration Number!";
			Constants.PERSONNUMBER_MESSAGE_NOTICE = "**Only input Numbers**";
			Constants.COUNTS_MESSAGE = "How many tickets do you want?";
			Constants.COUNTS_MESSAGE_NOTICE = "**Up to 10**";
			Constants.SPECIALORDERS_MESSAGE = "Choose your special offer!";
			Constants.SPECIALORDERS_MESSAGE_NONE = "None (Special offer for age is already applied)";
			Constants.SPECIALORDERS_MESSAGE_DIFFICULTY = "Person With Difficulty";
			Constants.SPECIALORDERS_MESSAGE_MERIT = "Men of national merit";
			Constants.SPECIALORDERS_MESSAGE_MULTIKIDS = "Multiple kids (More than two)";
			Constants.SPECIALORDERS_MESSAGE_PREGNANT = "Pregnant Woman";
			Constants.BUYING_MESSAGE = "Continue to buy tickets or Exit?";
			Constants.BUYING_MESSAGE_TICKET = "1. Buying ticket";
			Constants.BUYING_MESSAGE_EXIT = "2. Exit";
			Constants.CONTINUE_MESSAGE = "Continue? (1: New Order, 2: Exit Program)";
			Constants.END_MESSAGE = "End of order! Thank you!";
			Constants.UNIT_MESSAGE = "WON";
			Constants.PRICE_MESSAGE = "Price";
			Constants.TOTAL_MESSAGE = "Total";
			Constants.BABY_MESSAGE = "BABY";
			Constants.CHILD_MESSAGE = "CHILD";
			Constants.TEEN_MESSAGE = "TEEN";
			Constants.ADULT_MESSAGE = "ADULT";
			Constants.OLD_MESSAGE = "OLD";
			Constants.REPORT_MESSAGE = "REPORT";
			Constants.RESULT_MESSAGE_CHOICES = "RESULT OF CHOICES";
			Constants.RESULT_MESSAGE_SPECIALORDERS = "RESULT OF SPECIAL ORDERS";
			Constants.PROFIT_MESSAGE = "PROFIT";
			Constants.HEADOFTOTAL = "Date     Sort  Age  Amount      Price    SpecialOrder";
			
				
		} else if (language == KOREAN) {
			Constants.WELLCOME_MESSAGE = "환영해요! 폴리랜드입니다!";
			Constants.CHOSING_TICKET_MESSAGE = "티켓의 종류를 선택하세요";
			Constants.CHOSING_TICKET_MESSAGE_DAY = "주간권";
			Constants.CHOSING_TICKET_MESSAGE_NIGHT = "야간권";
			Constants.PERSONNUMBER_MESSAGE = "주민등록번호를 입력해주세요!";
			Constants.PERSONNUMBER_MESSAGE_NOTICE = "**숫자만 입력하세요**";
			Constants.COUNTS_MESSAGE = "몇 개를 주문하시겠어요?";
			Constants.COUNTS_MESSAGE_NOTICE = "**10개까지 가능합니다!**";
			Constants.SPECIALORDERS_MESSAGE = "우대사항을 선택하세요!";
			Constants.SPECIALORDERS_MESSAGE_NONE = "없음 (나이 우대는 자동처리)";
			Constants.SPECIALORDERS_MESSAGE_DIFFICULTY = "장애인";
			Constants.SPECIALORDERS_MESSAGE_MERIT = "국가유공자";
			Constants.SPECIALORDERS_MESSAGE_MULTIKIDS = "다자녀";
			Constants.SPECIALORDERS_MESSAGE_PREGNANT = "임산부";
			Constants.BUYING_MESSAGE = "더 주문하시겠어요?";
			Constants.BUYING_MESSAGE_TICKET = "1. 추가구매";
			Constants.BUYING_MESSAGE_EXIT = "2. 주문완료";
			Constants.CONTINUE_MESSAGE = "계속 이용하시겠어요? (1: 새로운 주문, 2: 이용완료)";
			Constants.END_MESSAGE = "프로그램이 종료되었습니다. 감사합니다!";
			Constants.UNIT_MESSAGE = "원";
			Constants.PRICE_MESSAGE = "가격";
			Constants.TOTAL_MESSAGE = "총계";
			Constants.BABY_MESSAGE = "유아";
			Constants.CHILD_MESSAGE = "어린이";
			Constants.TEEN_MESSAGE = "청소년";
			Constants.ADULT_MESSAGE = "어른";
			Constants.OLD_MESSAGE = "노인";
			Constants.REPORT_MESSAGE = "판매 결과";
			Constants.RESULT_MESSAGE_CHOICES = "권종 별 판매현황";
			Constants.RESULT_MESSAGE_SPECIALORDERS = "우대권 판매현황";
			Constants.PROFIT_MESSAGE = "수익";
			Constants.HEADOFTOTAL = "날짜      종류   연령    개수         가격      우대사항";
			
		}  else if (language == JAPANESE) {
			Constants.WELLCOME_MESSAGE = "ようこそ！ポーランド！";
			Constants.CHOSING_TICKET_MESSAGE = "チケットの種類を選択してください";
			Constants.CHOSING_TICKET_MESSAGE_DAY = "デイチケット";
			Constants.CHOSING_TICKET_MESSAGE_NIGHT = "ナイトチケット";
			Constants.PERSONNUMBER_MESSAGE = "住民登録番号を入力してください！";
			Constants.PERSONNUMBER_MESSAGE_NOTICE = "**数字のみ入力してください**";
			Constants.COUNTS_MESSAGE = "何枚ご注文いただけますか？";
			Constants.COUNTS_MESSAGE_NOTICE = "**10枚まで可能です！**";
			Constants.SPECIALORDERS_MESSAGE = "優待券を選択してください！";
			Constants.SPECIALORDERS_MESSAGE_NONE = "なし（年齢優待は自動適用）";
			Constants.SPECIALORDERS_MESSAGE_DIFFICULTY = "障がい者";
			Constants.SPECIALORDERS_MESSAGE_MERIT = "国家功労者";
			Constants.SPECIALORDERS_MESSAGE_MULTIKIDS = "多子";
			Constants.SPECIALORDERS_MESSAGE_PREGNANT = "妊婦";
			Constants.BUYING_MESSAGE = "追加注文しますか？";
			Constants.BUYING_MESSAGE_TICKET = "1. 追加購入";
			Constants.BUYING_MESSAGE_EXIT = "2. 注文完了";
			Constants.CONTINUE_MESSAGE = "続けますか？（1：新しい注文、2：終了）";
			Constants.END_MESSAGE = "プログラムが終了しました。ありがとうございました！";
			Constants.UNIT_MESSAGE = "ウォン";
			Constants.PRICE_MESSAGE = "価格";
			Constants.TOTAL_MESSAGE = "合計";
			Constants.BABY_MESSAGE = "乳児";
			Constants.CHILD_MESSAGE = "子供";
			Constants.TEEN_MESSAGE = "ティーンエイジャー";
			Constants.ADULT_MESSAGE = "大人";
			Constants.OLD_MESSAGE = "高齢者";
			Constants.REPORT_MESSAGE = "販売結果";
			Constants.RESULT_MESSAGE_CHOICES = "チケット種別別販売状況";
			Constants.RESULT_MESSAGE_SPECIALORDERS = "優待券販売状況";
			Constants.PROFIT_MESSAGE = "利益";
			Constants.HEADOFTOTAL = "日付      種別   年齢    枚数         価格      優待券";

		}
		
	}
}
