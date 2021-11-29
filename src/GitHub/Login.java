package GitHub;

import java.awt.Container;
import javax.swing.*;

public class Login extends JFrame{
	 private JLabel usrId = new JLabel("Username");
     private JLabel pwlb = new JLabel("Password");
	 private JLabel label[] = {usrId, pwlb};
	 
	 private JTextField usrtxt = new JTextField();
     private JTextField pwtxt = new JPasswordField();
     JTextField text[] = {usrtxt, pwtxt};
     private JButton login = new JButton("Login");
     private JButton manager = new JButton("Manager");
     JButton btn[] = {login, manager};
     
	public Login()
	{
		setTitle("로그인");
		JPanel panel = new JPanel();
		setSize(300, 200);
		setLocation(550,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

    	panel.setLayout(null);
    	//panel.setBackground(Color.decode("#4287f5"));

    	usrId.setBounds(10, 20, 80, 25);
	    usrtxt.setBounds(100, 20, 165, 25);
	    pwlb.setBounds(10, 50, 80, 25);
	    pwtxt.setBounds(100, 50, 165, 25);
	
	    login.setBounds(10, 80, 80, 25);
	    manager.setBounds(100,80,90,25);
	     
	     for(int i =0; i<2; i++)
	    	{
	    		panel.add(label[i]);
	    		panel.add(text[i]);
	    		panel.add(btn[i]);
	    	}
	     c.add(panel);
	     
	     login.addActionListener(new chooseLogin(btn, text));
	     setVisible(true);
	}

	public static void main(String[] args) {
		new Login();
	}

}
