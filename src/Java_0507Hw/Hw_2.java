package Java_0507Hw;
import java.util.Scanner;

//2018213043 안세라

class Driver {
	public void driver() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 손님의 이름과 성을 입력해주세요. 성과 이름은 띄어쓰기로 구별해주세요.");
		
		String oneSung = sc.next();
		String oneIrum = sc.next();
		
		System.out.println("두번째 손님의 이름과 성을 입력해주세요. 성과 이름은 띄어쓰기로 구별해주세요.");
		
		String twoSung = sc.next();
		String twoIrum = sc.next();
		
		Name nm1 = new Name();
		Name nm2 = new Name();
		
		nm1.setSung(oneSung);
		nm1.setIrum(oneIrum);
		nm2.setSung(twoSung);
		nm2.setIrum(twoIrum);
		
		System.out.println("\n첫번째 손님의 성 : " + nm1.getSung());
		System.out.println("첫번째 손님의 이름 : " + nm1.getIrum());
		System.out.println("첫번째 손님의 성함 길이 : " + nm1.length() + "\n");
		System.out.println("두번째 손님의 성 : " + nm2.getSung());
		System.out.println("두번째 손님의 이름  : " + nm2.getIrum());
		System.out.println("두번째 손님의 성함 길이 : " + nm2.length());
		
		sc.close();
		
	}
}

public class Hw_2 {

	public static void main(String[] args) {

		Driver dr = new Driver();
		
		dr.driver();
		
	}

}
