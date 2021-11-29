package GitHub;

import java.awt.event.*;

import javax.swing.*;
import checkValue.ValueCheck;
import connectionDB.DBConnection;

public class chooseLogin implements ActionListener {
	DBConnection con = new DBConnection();
	ValueCheck vc = ValueCheck.getInstance();
	listTable listMain = new listTable();
	JButton btn[];
	JTextField text[];

	chooseLogin(JButton btn[], JTextField text[]){
		this.btn = btn;
		this.text = text;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton login = btn[0];
		JButton manager = btn[1];
		JTextField usrtxt = text[0];
		JTextField pwtxt = text[1];
		
		boolean IdCheck = vc.IdCheck(usrtxt);
	    boolean PwCheck = vc.PwCheck(pwtxt);
		
		if(login.getText().equals("Login")) {
			if(con.getDBConn()!= null) {
				if(IdCheck == true){
					if(PwCheck == true) {
						JOptionPane.showMessageDialog(null, "로그인 성공");
						listMain.setVisible(true);
						login.setText("Logout");
					}else {
						JOptionPane.showMessageDialog(null, "비밀번호가 틀립니다.");
					}
				}else {
					JOptionPane.showMessageDialog(null, "아이디가 틀립니다.");
				}
			}else {
				JOptionPane.showMessageDialog(null, "DB 연결 실패");
			}
		}else {
			//listMain.setVisible(false);
			login.setText("Login");
		}
		
		if(manager.getText().equals("Manager")) {
			
		}

	}

}
