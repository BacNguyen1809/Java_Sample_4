/*
	* @author bacng
	* @ Date Jun 8, 2022
*/
package exercise;

public class ArithmeticDemo {
	public static void main(String[] args) {
		double result = 1 +2;
		System.out.println("1 +2 = "+result);
		int original_result = (int) result;
		String fistString = "this is";
		String secondString = " a concatenated string.";
		String thirdString = fistString+secondString;
		System.out.println(thirdString);
		
		result = result -1;
		
		System.out.println(original_result+" - 1 ="+result);
		original_result = (int) result;
		
		result = result *2;
		System.out.println(original_result + " * 2 = "+result);
		original_result =(int) result;
		
		result = result/2;
		System.out.println(original_result + " / 2 = "+result);
		
		original_result = (int) result;
		
		result =result%7;
		System.out.println(original_result+" % 7 = "+result);
	}

}
