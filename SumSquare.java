package chapter5;

public class SumSquare1 {
	public static void main(String[] args) {
		double count = 3;
		double y = 3;
		double z = 0;
		while(count <= 33) {
			y = count;
			z = Math.pow(y, 2);
			System.out.println("Cumulation result: " + z);
			count = count + 3;
			
		}
		
	}

}
