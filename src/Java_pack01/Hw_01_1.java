package Java_pack01;

// 2018213043 안세라

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
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
		System.out.println("음소거 : " + mute);
		System.out.println("=======================");
		System.out.println("채널+:7 볼륨+:8 음소거on:9");
        System.out.println("채널-:1 볼륨-:2 음소거off:3");
        System.out.println("TV끄기:5\n");
	}
}

public class Hw_01_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tv를 켜시겠습니까? 예:1 아니오:2");
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
			System.out.println("TV전원이 꺼집니다.");
		}
		else if (tvOn == 2)
			System.out.println("TV를 켜지않습니다.");
		
		scan.close();
	}
		
}
