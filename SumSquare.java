package sumSquare;

public class SumSquare {
	public static void main(String[] args) {
		double x = 0;
		double y = 3;
		double z = 0;
		while(x <= 33) {
			z = Math.pow(y, 2);
			y += z;
			System.out.println(z);
			x++;
			
		}
		
	}

}
