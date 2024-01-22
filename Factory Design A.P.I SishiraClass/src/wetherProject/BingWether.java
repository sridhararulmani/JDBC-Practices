package wetherProject;

public class BingWether implements IWetherReport{
	@Override
	public String getWether(String place) {
		place="1 Deg in "+place+" By Bing Wether";
		return place;
	}
}