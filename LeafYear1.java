package WheaterCheackPrograms;

public class LeafYear {

	public static void main(String[] args) {
		int year=8;
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			System.out.println("Leaf Year");
		}
		else {
			System.out.println("Not a Leaf Year");
		}

	}

}
