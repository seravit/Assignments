package Java_pack01;

// 2018213043 �ȼ���

import java.util.Scanner;

class Tv_Control {
	int channel = 1;
	int volume = 0;
	boolean mute = false;
	
	public void chanAdd() {
		channel++;
	}
	void chanSub() {
		channel--;
	}
	
	void volAdd() {
		volume++;
	}
	void volSub() {
		volume--;
	}
	
	void muteOn() {
		mute = true;
	}
	
	void muteOff() {
		mute = false;
	}
	
	void gui() {
		System.out.println("=======================");
		System.out.println("ä�� : " + channel);
		System.out.println("���� : " + volume);
		System.out.println("���Ұ� : " + mute);
		System.out.println("=======================");
		System.out.println("ä��+:7 ����+:8 ���Ұ�on:9");
        System.out.println("ä��-:1 ����-:2 ���Ұ�off:3");
        System.out.println("TV����:5\n");
	}
}

public class Hw_01_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tv�� �ѽðڽ��ϱ�? ��:1 �ƴϿ�:2");
		int tvOn = scan.nextInt();
		
		boolean tvPower = true;
		
		if (tvOn == 1) {
			Tv_Control control = new Tv_Control();
			
			while (tvPower) {
				control.gui();
				
				int select = scan.nextInt();
				
				switch(select) {
					case 1:
						if (control.channel == 0) {
							break;
						}
						else {
							control.chanSub();
							break;
						}
					case 2:
						if (control.volume == 0) {
						break;
						}
						else {
							control.volSub();
							break;
						}
					case 3:
						control.muteOff();
						break;
					case 5:
						tvPower = false;
						break;
					case 7:
						control.chanAdd();
						break;
					case 8:
						control.volAdd();
						break;
					case 9:
						control.muteOn();
						break;
				}
			}
			System.out.println("TV������ �����ϴ�.");
		}
		else if (tvOn == 2)
			System.out.println("TV�� �����ʽ��ϴ�.");
		
		scan.close();
	}
		
}
