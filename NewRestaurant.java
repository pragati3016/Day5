package day5;

public class NewRestaurant extends Restaurant{
	
	void open() {
		System.out.println("The Restaurant Is Open!");
	}
	
	void closed() {
		System.out.println("The Restaurant Is Closed!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant r = new NewRestaurant();
		r.open();
		r.closed();
	}

}
