import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SwingObserverExample {
	JFrame frame;
	
	public static void main(String args[]) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();
		JButton button = new JButton("���� �ص� �ɱ�? �Ǹ��� �ӻ���");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		
		// Set frame properties 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300); 
		frame.setVisible(true);
	}
	
	class AngelListener implements ActionListener{
		// ������ Ŭ�������� ���� Ŭ���� ���·� �����մϴ�. �ݵ�� �̷��߸� �ϴ� ���� �ƴմϴ�.
		public void actionPerformed(ActionEvent event) {
			System.out.println("�� ��. �и� ���߿� ��ȸ�� �ž�");
		}
	}
	
	class DevilListener implements ActionListener{
		// ���⿡���� ��ư(Observer���Ͽ����� Subject)�� ���°� ����Ǿ��� �� update()�� �ƴ�
		// actionPerformed() �޼ҵ尡 ȣ��˴ϴ�.
		public void actionPerformed(ActionEvent event) {
			System.out.println("�翬����. �׳� ������ ����!");
		}
	}
}
