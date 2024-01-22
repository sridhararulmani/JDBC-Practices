package wetherFactoryByProperties;

public class WetherReport extends APIReader implements IWetherReport{
	@Override
	public String getWether(String Place,String Comp) {
		String statement="Partily Clowdly in "+Place+" Report By "+Comp;
		return statement;
	}
}