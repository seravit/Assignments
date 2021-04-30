package Java_0528;
import javax.swing.*;
import java.awt.*;

public class F_3 extends JFrame {

	public F_3() {
		
		setTitle("Date Button");
		
		Container C = getContentPane();
		
		C.setLayout(new GridLayout(1,7));
		JButton[] jb = new JButton[7];
		
		Color CA = null;
		
		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JButton();
			
			
		}
		

		/*C.add(new JButton("월"));
		C.setBackground(Color.RED);
		C.add(new JButton("화"));
		C.setBackground(Color.orange);
		C.add(new JButton("수"));
		C.setBackground(Color.YELLOW);
		C.add(new JButton("목"));
		C.setBackground(Color.GREEN);
		C.add(new JButton("금"));
		C.setBackground(Color.cyan);
		C.add(new JButton("토"));
		C.setBackground(Color.BLUE);
		C.add(new JButton("일"));
		C.setBackground(Color.magenta);
		*/
		
		setSize(500,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new F_3();
	}

}
