import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	private String userid;
	public MainScreen(String userid) {
		this.userid = userid;
		setTitle("DashBoard - Welcome "+this.userid);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		//JMenuItem mntmNewUser = new JMenuItem("New User");
		//mnFile.add(mntmNewUser);
		
		JMenu newUserChoice = new JMenu("New User");
		JMenuItem adminUser = new JMenuItem("Admin User");
		adminUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminScreen admin = new AdminScreen();
				admin.setVisible(true);
			}
		});
		JMenuItem guestUser = new JMenuItem("Guest User");
		newUserChoice.add(adminUser);
		newUserChoice.add(guestUser);
		mnFile.add(newUserChoice);
		//mnFile.add(mnAdmin);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		Icon icon =new ImageIcon(SplashDemo.class.getResource("stock.jpg"));
		lblNewLabel.setIcon(icon);
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
	}

}
