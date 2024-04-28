package homework1;

public class ValueXYZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x= 10;
		double y = 12.4;
		double z= 56.78;
		
		double result =  Math.sqrt(3 * (Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z)));
        
        System.out.println("Result: " + result);

	}

}
