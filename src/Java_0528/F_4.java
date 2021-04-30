package Java_0528;
import javax.swing.*;
import java.awt.*;

public class F_4 extends JFrame {
	
	public F_4() {
		
		setTitle("정수 입력하기");
		
		JPanel jp = new JPanel();
		
		JLabel jl = new JLabel("정수값을 입력하세요");
		JTextField jt = new JTextField(10);
		JButton jb = new JButton("검사");
		
		jp.add(jl);
		jp.add(jt);
		jp.add(jb);
		
		add(jp);
		
		setSize(300,120);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new F_4();
	}

}
