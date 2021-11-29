package GitHub;

import java.awt.*;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class listTable extends JFrame {
	
	private String colNames[] = {"번호","제목", "작성자", "작성일", "조회", "IP"};
	
	private DefaultTableModel model = new DefaultTableModel(colNames, 0) {
		public boolean isCellEditable(int i, int c) {
			return false;
		}
	};
	
	public listTable() {
		setTitle("학생정보관리 프로그램");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(890,200));
		setLocation(500, 200);
		Container c = getContentPane();

		JTable table = new JTable(model);
		c.add(new JScrollPane(table), BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		
		JButton insert = new JButton("추가"); 
		
		panel.add(insert);
		
		c.add(panel, BorderLayout.NORTH);
		
		//insert.addActionListener(new InsertActionListener(model, null));
		
		try {
			new showAllTable(model);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pack();
		setVisible(false);
	}
	

}
