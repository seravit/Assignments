package Java_0528;
import javax.swing.*;
import java.awt.*;

//2018213043 안세라

public class H_3 extends JFrame {
	
	public H_3() {
		
		setTitle("2018213043 안세라");
		setSize(100, 100);
		
		Container ct = getContentPane();
		FlowLayout fl = new FlowLayout();
		JButton b1 = new JButton("Start");
		JButton b2 = new JButton("Stop");
		b1.setBackground(Color.pink);
		b2.setForeground(Color.green);
		
		ct.setLayout(fl);
		ct.add(b1);
		ct.add(b2);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new H_3();
	}

}
