package Java_0528;
import javax.swing.*;
import java.awt.*;

// 2018213043 �ȼ���

public class H_4 extends JFrame {
	
	public H_4() {
		
		setTitle("2018213043 �ȼ���");
		setSize(800,400);
		
		Container co = getContentPane();
		JScrollPane sc1 = new JScrollPane();
		
		JTextField tf = new JTextField("�ȳ��ϼ���",10);
		JTextArea ta = new JTextArea("���ڰ� �Ⱥ����� ��������� �𸣰ھ��",10,10);
		JScrollPane sc2 = new JScrollPane(ta);
		
		String[] csr = { "����","��ġ","����","����","���" };
		JCheckBox cb = new JCheckBox();
		JComboBox cob = new JComboBox(csr);
		
		JRadioButton rb1 = new JRadioButton();
		JRadioButton rb2 = new JRadioButton();
		
		ButtonGroup bg = new ButtonGroup();
		
		String[] lsr = { "�ٳ���","���","��" };
		JList ls = new JList(lsr);
		sc1.setViewportView(ls);
		
		FlowLayout fl = new FlowLayout();
		
		co.setLayout(fl);
		co.add(tf);
		co.add(sc2);
		
		co.add(cb = new JCheckBox("����"));
		co.add(cb = new JCheckBox("������"));
		co.add(cb = new JCheckBox("��Ʋ��"));
		
		co.add(rb1 = new JRadioButton("����"));
		co.add(rb2 = new JRadioButton("����"));
		bg.add(rb1);
		bg.add(rb2);
		
		co.add(sc1); // �� ��ũ���� �ȳ��ñ��
		
		co.add(cob);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		
		new H_4();
		
	}
	
}
