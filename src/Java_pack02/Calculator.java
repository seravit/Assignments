package Java_pack02;


class Normal_Calculator {
	
	double a;
	double b;
	double result;
	
	void Add() { //����
		result = a + b;
	}
	
	void Sub() { //����
		result = a - b;
	}
	
	void Mul() { //����
		result = a * b;
	}
	
	void Div() { //������
		result = a / b;
		int i = (int) result;
	}
	
}

class Engineering_Calculator extends Normal_Calculator {
	
	void Div() { //�������̵��� ������
		result = a / b;
	}
	
	void Rem() { //����������
		result = a % b;
	}
	
	void pow() { //����
		result = Math.pow(a, b);
	}
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
