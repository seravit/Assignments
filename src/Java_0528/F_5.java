package Java_0528;
import javax.swing.*;
import java.awt.*;

public class F_5 extends JFrame {
	
	public F_5() {
		
		setTitle("정수 입력하기");
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(20,20));
		
		/*
		JCheckBox jc1 = new JCheckBox("고딕체",false);
		JCheckBox jc2 = new JCheckBox("이태릭체", false);
		JButton jb1 = new JButton("확인");
		JButton jb2 = new JButton("취소");
		*/
		
		JPanel jp = new JPanel();
		
		c.add(new JCheckBox("고딕체"), BorderLayout.NORTH);
		c.add(new JCheckBox("이태릭체"), BorderLayout.NORTH);
		c.add(new JButton("확인"), BorderLayout.SOUTH);
		c.add(new JButton("취소"), BorderLayout.SOUTH);
		
		
		setSize(300,120);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new F_5();
	}

}
