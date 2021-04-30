package Java_pack02;


class Normal_Calculator {
	
	double a;
	double b;
	double result;
	
	void Add() { //µ¡¼À
		result = a + b;
	}
	
	void Sub() { //»¬¼À
		result = a - b;
	}
	
	void Mul() { //°ö¼À
		result = a * b;
	}
	
	void Div() { //³ª´°¼À
		result = a / b;
		int i = (int) result;
	}
	
}

class Engineering_Calculator extends Normal_Calculator {
	
	void Div() { //¿À¹ö¶óÀÌµùµÈ ³ª´°¼À
		result = a / b;
	}
	
	void Rem() { //³ª¸ÓÁö¿¬»ê
		result = a % b;
	}
	
	void pow() { //Á¦°ö
		result = Math.pow(a, b);
	}
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
