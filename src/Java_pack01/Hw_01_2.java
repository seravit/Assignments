package Java_pack01;

// 2018213043 ¾È¼¼¶ó

import java.util.Scanner;

class Calculator {
	int result;
	
	Calculator(int num1, int num2, char operator) {
		switch (operator) {
			case '+' :
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case '/' :
				result = num1 / num2;
				break;
			case '*' :
				result = num1 * num2;
				break;
		}
	}
	
	void showResult() {
		System.out.println(result);
	}
}

public class Hw_01_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		char operator = scan.next().charAt(0);
		
		Calculator calculator = new Calculator(num1, num2, operator);
		
		calculator.showResult();
		
		scan.close();
		
	}

}
