public class AmusementParkDemo{
	public static void main(String []args)
	{
		final int CLOSING_TIME = 18000;
		final int START_LEAVING_TIME = 900;
		final int STATUS_TIME = 600;
		AmusementPark park = new AmusementPark(CLOSING_TIME, START_LEAVING_TIME, STATUS_TIME);
			park.open();
			park.close();
			park.printDailyRecap();
	}
	}