package chapter5;

public class SumSquare1 {
	public static void main(String[] args) {
		int count = 3;
		int y = 3;
		int z = 0;
		int result = 0;
		while (count <= 33) {
			
			y = count;
			z = y * y;
			int z1 = z + result;
			System.out.printf("Cumulation result: %-5d%-8s%-6d%-7s%-7d\n",z1, " : ", count, " * ",count);
			count = count + 3;

			result = z1;
			
			//result += count;
			
			

		}
		System.out.println("The SUM of Square of multiples of 3 is " + result);

	}

}
