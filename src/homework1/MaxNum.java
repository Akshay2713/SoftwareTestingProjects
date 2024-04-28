package homework1;

//find the max number between three numbers using ternary operator

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 5;
		
		int max = (a > b) ? ((a > c) ?  a :c) : ((b > c) ? b : c);
		System.out.println("Max number is : " + max);
		

	}

}
