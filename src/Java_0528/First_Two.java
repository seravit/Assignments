package Java_0528;
import javax.swing.*;
import java.awt.*;

public class First_Two extends JFrame {
	
	public First_Two() {
		setTitle("¹öÆ° 10°³");
		
		Container C = getContentPane();
		
		C.setLayout(new GridLayout(1,10));
		C.add(new JButton("0"));
		C.add(new JButton("1"));
		C.add(new JButton("3"));
		C.add(new JButton("4"));
		C.add(new JButton("5"));
		C.add(new JButton("6"));
		C.add(new JButton("7"));
		C.add(new JButton("8"));
		C.add(new JButton("9"));
		
		setSize(500,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new First_Two();
	}

}
