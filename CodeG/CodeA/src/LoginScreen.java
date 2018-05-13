import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	private void checkLogin(){
		String userid = textField.getText();
		String pwd = passwordField.getText();
		if(userid.equals(pwd)){
			MainScreen mainScreen = new MainScreen(userid);
			mainScreen.setVisible(true);
			this.setVisible(false);
			this.dispose();
		}
		else{
			JOptionPane.showMessageDialog(this, "Invalid Userid or Password", "IMS", JOptionPane.INFORMATION_MESSAGE);
			//JOptionPane.showMessageDialog(this, "Invalid Userid or Password....");
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen frame = new LoginScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginScreen() {
		
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 349, 267);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblUserid.setBounds(33, 58, 99, 32);
		contentPane.add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblPassword.setBounds(19, 123, 99, 32);
		contentPane.add(lblPassword);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(new Color(199, 21, 133));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblLogin.setBounds(63, -1, 210, 47);
		contentPane.add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(121, 62, 215, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 127, 214, 26);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			checkLogin();
			}
		});
		btnLogin.setBounds(33, 186, 117, 29);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(156, 186, 117, 29);
		contentPane.add(btnReset);
		setLocationRelativeTo(null);
	}
}
