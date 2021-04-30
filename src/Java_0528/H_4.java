package Java_0528;
import javax.swing.*;
import java.awt.*;

// 2018213043 안세라

public class H_4 extends JFrame {
	
	public H_4() {
		
		setTitle("2018213043 안세라");
		setSize(800,400);
		
		Container co = getContentPane();
		JScrollPane sc1 = new JScrollPane();
		
		JTextField tf = new JTextField("안녕하세요",10);
		JTextArea ta = new JTextArea("글자가 안보여서 뭘써야할지 모르겠어요",10,10);
		JScrollPane sc2 = new JScrollPane(ta);
		
		String[] csr = { "복어","참치","연어","광어","방어" };
		JCheckBox cb = new JCheckBox();
		JComboBox cob = new JComboBox(csr);
		
		JRadioButton rb1 = new JRadioButton();
		JRadioButton rb2 = new JRadioButton();
		
		ButtonGroup bg = new ButtonGroup();
		
		String[] lsr = { "바나나","사과","배" };
		JList ls = new JList(lsr);
		sc1.setViewportView(ls);
		
		FlowLayout fl = new FlowLayout();
		
		co.setLayout(fl);
		co.add(tf);
		co.add(sc2);
		
		co.add(cb = new JCheckBox("스팀"));
		co.add(cb = new JCheckBox("오리진"));
		co.add(cb = new JCheckBox("배틀넷"));
		
		co.add(rb1 = new JRadioButton("남자"));
		co.add(rb2 = new JRadioButton("여자"));
		bg.add(rb1);
		bg.add(rb2);
		
		co.add(sc1); // 왜 스크롤이 안나올까요
		
		co.add(cob);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		
		new H_4();
		
	}
	
}
