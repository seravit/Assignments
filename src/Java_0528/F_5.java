package Java_0528;
import javax.swing.*;
import java.awt.*;

public class F_5 extends JFrame {
	
	public F_5() {
		
		setTitle("���� �Է��ϱ�");
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(20,20));
		
		/*
		JCheckBox jc1 = new JCheckBox("���ü",false);
		JCheckBox jc2 = new JCheckBox("���¸�ü", false);
		JButton jb1 = new JButton("Ȯ��");
		JButton jb2 = new JButton("���");
		*/
		
		JPanel jp = new JPanel();
		
		c.add(new JCheckBox("���ü"), BorderLayout.NORTH);
		c.add(new JCheckBox("���¸�ü"), BorderLayout.NORTH);
		c.add(new JButton("Ȯ��"), BorderLayout.SOUTH);
		c.add(new JButton("���"), BorderLayout.SOUTH);
		
		
		setSize(300,120);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new F_5();
	}

}
