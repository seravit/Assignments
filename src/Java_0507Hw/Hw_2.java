package Java_0507Hw;
import java.util.Scanner;

//2018213043 �ȼ���

class Driver {
	public void driver() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° �մ��� �̸��� ���� �Է����ּ���. ���� �̸��� ����� �������ּ���.");
		
		String oneSung = sc.next();
		String oneIrum = sc.next();
		
		System.out.println("�ι�° �մ��� �̸��� ���� �Է����ּ���. ���� �̸��� ����� �������ּ���.");
		
		String twoSung = sc.next();
		String twoIrum = sc.next();
		
		Name nm1 = new Name();
		Name nm2 = new Name();
		
		nm1.setSung(oneSung);
		nm1.setIrum(oneIrum);
		nm2.setSung(twoSung);
		nm2.setIrum(twoIrum);
		
		System.out.println("\nù��° �մ��� �� : " + nm1.getSung());
		System.out.println("ù��° �մ��� �̸� : " + nm1.getIrum());
		System.out.println("ù��° �մ��� ���� ���� : " + nm1.length() + "\n");
		System.out.println("�ι�° �մ��� �� : " + nm2.getSung());
		System.out.println("�ι�° �մ��� �̸�  : " + nm2.getIrum());
		System.out.println("�ι�° �մ��� ���� ���� : " + nm2.length());
		
		sc.close();
		
	}
}

public class Hw_2 {

	public static void main(String[] args) {

		Driver dr = new Driver();
		
		dr.driver();
		
	}

}
