import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow {
	JFrame _main;
	
	public MainWindow() {	}
	
	private void init() {
		Random rnd = new Random();
		_main = new JFrame();
		_main.setBounds(100,100,450,300);
		_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pmain = new JPanel();
		_main.add(pmain);
		_main.setLayout(new BorderLayout());
		
		String[] btns = {"one", "two", "three", "four", "five", "six"};
		String [] regions = {BorderLayout.NORTH,BorderLayout.WEST,BorderLayout.EAST,BorderLayout.SOUTH,BorderLayout.CENTER};
		for (String b: btns) {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5,1));
		p.add(new JButton(b));
		//pmain.add(new JButton(p,regions[(rnd.nextInt(5))]));
		}
	}
	
	public void showWindow() {
		init();
		_main.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainWindow m = new MainWindow();
		m.showWindow();
	}

}
