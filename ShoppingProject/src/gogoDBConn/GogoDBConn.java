package gogoDBConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GogoDBConn {
	public Connection con;//���Ӱ�ü con����
	
	public Connection getConnection() {
		return con;//���Ӱ�ü con ��ȯ
	}
	
	public GogoDBConn() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");//����Ŭ ����̹� �ε�
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");//DB ����
		
	}
}
