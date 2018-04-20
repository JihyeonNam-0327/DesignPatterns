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
		JButton button = new JButton("정말 해도 될까? 악마의 속삭임");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		
		// Set frame properties 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300); 
		frame.setVisible(true);
	}
	
	class AngelListener implements ActionListener{
		// 옵저버 클래스들은 내부 클래스 형태로 정의합니다. 반드시 이래야만 하는 것은 아닙니다.
		public void actionPerformed(ActionEvent event) {
			System.out.println("안 돼. 분명 나중에 후회할 거야");
		}
	}
	
	class DevilListener implements ActionListener{
		// 여기에서는 버튼(Observer패턴에서는 Subject)의 상태가 변경되었을 때 update()가 아닌
		// actionPerformed() 메소드가 호출됩니다.
		public void actionPerformed(ActionEvent event) {
			System.out.println("당연하지. 그냥 저질러 버려!");
		}
	}
}
