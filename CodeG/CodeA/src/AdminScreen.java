import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdminScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	private void askForClosing(){
		if(textField.getText().length()>0){
			int choice= JOptionPane.showConfirmDialog(this, "Do you want to Close this Window","IMS",JOptionPane.YES_NO_OPTION);
			if(choice == JOptionPane.YES_OPTION){
				this.setVisible(false);
				this.dispose();
			}
			else{
				return;
			}
		}
		else{
			this.setVisible(false);
			this.dispose();
		}
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminScreen frame = new AdminScreen();
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
	public AdminScreen() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			askForClosing();
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdmin = new JLabel("ADMIN");
		lblAdmin.setBounds(190, 41, 61, 16);
		contentPane.add(lblAdmin);
		
		textField = new JTextField();
		textField.setBounds(189, 89, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
