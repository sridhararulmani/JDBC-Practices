package wetherProject;

public class AccurWether implements IWetherReport{
	@Override
	public String getWether(String place) {
		place="1 Deg in "+place+" By Accur Wether";
		return place;
	}
}