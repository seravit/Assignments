package Java_pack01;

// 2018213043 �ȼ���

import java.util.Scanner;

class GameInfo {
	private String gameName;
	private String company;
	private int users;
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String name) {
		gameName = name;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String comName) {
		company = comName;
	}
	
	public int getUsers() {
		return users;
	}
	public void setUsers(int user) {
		users = user;
	}
}

public class Hw_01_3 {
	
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	
    	GameInfo gameinfo = new GameInfo();
    	
    	String string = scan.nextLine();
    	gameinfo.setGameName(string);
    	string = scan.nextLine();
    	gameinfo.setCompany(string);
    	int number = scan.nextInt();
    	gameinfo.setUsers(number);
    	
    	System.out.println("���� : " + gameinfo.getGameName());
    	System.out.println("����ȸ�� : " + gameinfo.getCompany());
    	System.out.println("������ : " + gameinfo.getUsers());
    	
    	scan.close();
    }

}