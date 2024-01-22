package wetherProject;

public class WetherFactory {
	public static IWetherReport getInstance(String type) {
		IWetherReport wetherReport=null;
		if(type.equalsIgnoreCase("Accur Wether")) {
			wetherReport=new AccurWether();
		}
		else if(type.equalsIgnoreCase("Bing Wether")) {
			wetherReport=new BingWether();
		}
		else {
			System.out.println("Invalid");
		}
		return wetherReport;
	}
}