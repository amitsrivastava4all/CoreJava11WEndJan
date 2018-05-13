import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class SplashDemo extends JWindow {
	private int counter;
	private Timer timer;
	private boolean isVisible ;  //false
	private void plusProgress(){
		timer = new Timer(20,e->{
		if(counter>=100){
			timer.stop();
			LoginScreen loginScreen = new LoginScreen();
			loginScreen.setVisible(true);
			SplashDemo.this.setVisible(false);
			SplashDemo.this.dispose();
		}
		titlelbl.setVisible(isVisible);
		isVisible = !isVisible;
			if(counter<=100){
		counter++;
		progressBar.setValue(counter);
		}
		});
		timer.start();
		
	}
	JProgressBar progressBar = new JProgressBar();
	private JPanel contentPane;
	JLabel titlelbl = new JLabel("IMS");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SplashDemo frame = new SplashDemo();
					frame.setVisible(true);
					frame.plusProgress();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SplashDemo() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 373);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		titlelbl.setForeground(new Color(255, 0 ,0));
		titlelbl.setHorizontalAlignment(SwingConstants.CENTER);
		titlelbl.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		titlelbl.setBounds(83, 6, 297, 45);
		contentPane.add(titlelbl);
		
		JLabel imglbl = new JLabel("");
		Icon icon =new ImageIcon(SplashDemo.class.getResource("stock.jpg"));
		imglbl.setIcon(icon);
		imglbl.setBounds(10, 46, 434, 226);
		contentPane.add(imglbl);
		
		
		progressBar.setStringPainted(true);
		progressBar.setBounds(10, 297, 434, 20);
		contentPane.add(progressBar);
		setLocationRelativeTo(null);
	}
}
