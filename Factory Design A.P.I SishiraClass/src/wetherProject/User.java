package wetherProject;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Place");
		String place=sc.next();
		IWetherReport iwr=WetherFactory.getInstance("bing Wether");
		String result=iwr.getWether(place);
		System.out.println(result);
	}
}