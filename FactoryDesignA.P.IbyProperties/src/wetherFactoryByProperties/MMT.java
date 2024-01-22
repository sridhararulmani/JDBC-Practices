package wetherFactoryByProperties;

public class MMT {
	public static void main(String[] args) {
		IWetherReport wetherReport=new WetherReport();
		
		String company=APIReader.readWetherAPI();
		String repot=wetherReport.getWether("Goa", company);
		System.out.println(repot);
	}
}