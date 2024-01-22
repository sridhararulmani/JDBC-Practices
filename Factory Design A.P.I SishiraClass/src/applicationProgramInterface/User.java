package applicationProgramInterface;

public class User{
	public static void display() {
		IOrderBy order=new Amazon();
		order.order();
	}
	public static void main(String[] args) {
		display();
	}
}