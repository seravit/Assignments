package Java_0528;
import javax.swing.*;
import java.awt.*;

//2018213043 안세라

public class H_2 extends JFrame {
	
	public H_2() {
		
		setTitle("2018213043 안세라");
		setSize(400,400);
		
		BorderLayout bd = new BorderLayout();
		JButton[] bt = new JButton[5];
		Container ct = getContentPane();
		
		setLayout(bd);
		
		String[] dr = { bd.NORTH,
				bd.EAST, bd.CENTER,
				bd.WEST, bd.SOUTH };
		String[] nm = { "북쪽", "동쪽", "중앙", "서쪽", "남쪽" };
		
		for (int i = 0; i < bt.length;i++) {
			bt[i] = new JButton(nm[i]);
			ct.add(bt[i],dr[i]);
		}
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new H_2();
	}

}
