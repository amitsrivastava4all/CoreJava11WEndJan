import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo extends JFrame { //implements ActionListener {
	JButton button = new JButton("Ok");
	JButton button2 = new JButton("Cancel");
	/*
	@Override
	public void actionPerformed(ActionEvent e){
		Color color = Color.WHITE;
		String buttonName = e.getActionCommand();
		if(buttonName.equals("Ok")){
			color = Color.RED;
		}
		else
		if(buttonName.equals("Cancel")){
			color = Color.YELLOW;
		}
		/*JButton source = (JButton)e.getSource();
		Color color = Color.WHITE;
		if(source == button){
			color = Color.RED;
		}
		else
		if(source == button2){
			color = Color.GREEN;
		}*/
	//	this.getContentPane().setBackground(color);
	//}
		
	
	Demo(){
		button.
		addActionListener
		(e->Demo.this.getContentPane().setBackground(Color.RED));
		
		button2.
		addActionListener
		(e->Demo.this.getContentPane().setBackground(Color.GREEN));
		
//		button.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e){
//				Demo.this.getContentPane().setBackground(Color.RED);
//			}
//		});
//		
//		button2.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e){
//				Demo.this.getContentPane().setBackground(Color.GREEN);
//			}
//		});
		//button.addActionListener(this);
		
		//button2.addActionListener(this);
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(button);
		this.getContentPane().add(button2);
		//this.getContentPane().add(button,BorderLayout.SOUTH);
		setLocationRelativeTo(null);
		//setLocation(400, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setTitle("Frame1");
		setVisible(true);
	}

	public static void main(String[] args) {
		Demo obj = new Demo();
		// TODO Auto-generated method stub
		//System.out.println("hello");

	}

}
