package GitHub;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import connectionDB.DBConnection;

public class showAllTable extends JFrame{
	DefaultTableModel model;
	DBConnection con = new DBConnection();
	
	public showAllTable(DefaultTableModel model) throws SQLException {
		this.model = model;
		model.setRowCount(0);
		
		Connection conn = con.getDBConn();
		String sql = "select num, subject, writer, reg_date, readcount, ip from board order by num desc;";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int num = rs.getInt("num");
			String subject = rs.getString("subject");
			String writer = rs.getString("writer");
			String reg_date = rs.getString("reg_date");
			String readcount = rs.getString("readcount");
			String ip = rs.getString("ip");	
			
			String nnum = Integer.toString(num);
			String arr[] = {nnum, subject, writer, reg_date, readcount, ip};
			
			model.addRow(arr);

		}
		
		
	}
	
}