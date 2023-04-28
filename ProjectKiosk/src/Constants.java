import java.util.Locale;
import java.util.ResourceBundle;

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
	public static final int NO = 2, NEW_ORDER = 1;
	public static final int RUNORDER = 1, DATA_ANALYZE_AND_SAVE = 2, EXIT_MACHINE = 3;
	// Messages for program
	public static String PROGRAM_MESSAGE = "";
	public static String CHOSING_PROGRAM_MESSAGE = "";
	public static String CHOSING_PROGRAM_MESSAGE_RUN = "";
	public static String CHOSING_PROGRAM_MESSAGE_DATA = "";
	public static String CHOSING_PROGRAM_MESSAGE_OFF = "";
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
	public static String HEAD_OF_TOTAL = "";
	public static String HEAD_OF_TOTAL_CSV = "";
	public static String HEAD_OF_TOTAL_NOTICE = "";
	public static String DATE_OF_TOTAL = "";
	
	// Language setup
	void languageSelect() {
		Locale currentLocale = Locale.getDefault();
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		PROGRAM_MESSAGE = messages.getString("PROGRAM_MESSAGE");
		CHOSING_PROGRAM_MESSAGE = messages.getString("CHOSING_PROGRAM_MESSAGE");
		CHOSING_PROGRAM_MESSAGE_RUN = messages.getString("CHOSING_PROGRAM_MESSAGE_RUN");
		CHOSING_PROGRAM_MESSAGE_DATA = messages.getString("CHOSING_PROGRAM_MESSAGE_DATA");
		CHOSING_PROGRAM_MESSAGE_OFF = messages.getString("CHOSING_PROGRAM_MESSAGE_OFF");
		WELLCOME_MESSAGE = messages.getString("WELLCOME_MESSAGE");
		CHOSING_TICKET_MESSAGE = messages.getString("CHOSING_TICKET_MESSAGE");
		CHOSING_TICKET_MESSAGE_DAY = messages.getString("CHOSING_TICKET_MESSAGE_DAY");
		CHOSING_TICKET_MESSAGE_NIGHT = messages.getString("CHOSING_TICKET_MESSAGE_NIGHT");
		PERSONNUMBER_MESSAGE = messages.getString("PERSONNUMBER_MESSAGE");
		PERSONNUMBER_MESSAGE_NOTICE = messages.getString("PERSONNUMBER_MESSAGE_NOTICE");
		COUNTS_MESSAGE = messages.getString("COUNTS_MESSAGE");
		COUNTS_MESSAGE_NOTICE = messages.getString("COUNTS_MESSAGE_NOTICE");
		SPECIALORDERS_MESSAGE = messages.getString("SPECIALORDERS_MESSAGE");
		SPECIALORDERS_MESSAGE_NONE = messages.getString("SPECIALORDERS_MESSAGE_NONE");
		SPECIALORDERS_MESSAGE_DIFFICULTY = messages.getString("SPECIALORDERS_MESSAGE_DIFFICULTY");
		SPECIALORDERS_MESSAGE_MERIT = messages.getString("SPECIALORDERS_MESSAGE_MERIT");
		SPECIALORDERS_MESSAGE_MULTIKIDS = messages.getString("SPECIALORDERS_MESSAGE_MULTIKIDS");
		SPECIALORDERS_MESSAGE_PREGNANT = messages.getString("SPECIALORDERS_MESSAGE_PREGNANT");
		BUYING_MESSAGE = messages.getString("BUYING_MESSAGE");
		BUYING_MESSAGE_TICKET = messages.getString("BUYING_MESSAGE_TICKET");
		BUYING_MESSAGE_EXIT = messages.getString("BUYING_MESSAGE_EXIT");
		CONTINUE_MESSAGE = messages.getString("CONTINUE_MESSAGE");
		END_MESSAGE = messages.getString("END_MESSAGE");
		UNIT_MESSAGE = messages.getString("UNIT_MESSAGE");
		PRICE_MESSAGE = messages.getString("PRICE_MESSAGE");
		TOTAL_MESSAGE = messages.getString("TOTAL_MESSAGE");
		PROFIT_MESSAGE = messages.getString("PROFIT_MESSAGE");
		BABY_MESSAGE = messages.getString("BABY_MESSAGE");
		CHILD_MESSAGE = messages.getString("CHILD_MESSAGE");
		TEEN_MESSAGE = messages.getString("TEEN_MESSAGE");
		ADULT_MESSAGE = messages.getString("ADULT_MESSAGE");
		OLD_MESSAGE = messages.getString("OLD_MESSAGE");
		REPORT_MESSAGE = messages.getString("REPORT_MESSAGE");
		RESULT_MESSAGE_CHOICES = messages.getString("RESULT_MESSAGE_CHOICES");
		RESULT_MESSAGE_SPECIALORDERS = messages.getString("RESULT_MESSAGE_SPECIALORDERS");
		HEAD_OF_TOTAL = messages.getString("HEAD_OF_TOTAL");
		HEAD_OF_TOTAL_CSV = messages.getString("HEAD_OF_TOTAL_CSV");
		HEAD_OF_TOTAL_NOTICE = messages.getString("HEAD_OF_TOTAL_NOTICE");
		DATE_OF_TOTAL = messages.getString("DATE_OF_TOTAL");

	}
}
