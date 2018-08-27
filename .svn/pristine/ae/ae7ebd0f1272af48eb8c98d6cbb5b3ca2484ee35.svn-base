package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnDB {
	public Connection conn=null;//数据库连接对�?
	public PreparedStatement stmt=null;//Statement对象，用于执行SQL语句
	public ResultSet rs=null;//结果集对�?
	//驱动类的类名
	private static String dbClassName="com.mysql.jdbc.Driver";
	private static String dbUrl="jdbc:mysql://localhost:3306/diannao";
	  public final static String user = "root";
	  public final static String password = "root";
	private static String dbUser="";
	private static String dbPwd="";
	/*
	 *功能：创建数据库对象
	 * */
	public static Connection getConnection() {
		Connection conn=null;//声明数据库连接对�?
		try {
			Class.forName(dbClassName);//装载数据库驱�?
			conn=DriverManager.getConnection(dbUrl,user,password);
			System.out.println("���ݿ����Ӵ����ɹ�");
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		if(conn==null) {
			System.err.println("DbConnectionManager.getConnection():"+dbClassName+"\r\n"+dbUser+"/"+dbPwd);//输出连接信息
		}
		return  conn;//返回数据库连接对�?
	}
	/*
	 *功能：更新数�?
	 * 
	 */
	
	/*
	 * 功能：根据制定的SQL语句查询数据
	 */	
	public int userexecuteQuery(String user,String pwd) {
		try {
			System.out.println("user:"+user+"pwd:"+pwd);
			conn=getConnection();//获取数据库连�?
			//创建用于执行SQK语句的Statement对象
			stmt=conn.prepareStatement("select * from user where uID=? and uPwd=?");
			stmt.setString(1,user);
			stmt.setString(2,pwd);
			rs=stmt.executeQuery();//执行SQL语句
			System.out.println("���ݿ��ѯ���");
			if (rs.next()&&rs!=null) { 
				return 1;
				
			}else{
				return 0;
			}
		}catch (SQLException ex) {
			ex.printStackTrace();
			// TODO: handle exception
		}
		return 0;
	}
	
	public int attendantexecuteQuery(String user,String pwd) {
		try {
			System.out.println("user:"+user+"pwd:"+pwd);
			conn=getConnection();//获取数据库连�?
			//创建用于执行SQK语句的Statement对象
			stmt=conn.prepareStatement("select * from attendant where aID=? and aPwd=?");
			stmt.setString(1,user);
			stmt.setString(2,pwd);
			rs=stmt.executeQuery();//执行SQL语句
			System.out.println("���ݿ��ѯ���");
			if (rs.next()&&rs!=null) { 
				return 1;
				
			}else{
				return 0;
			}
		}catch (SQLException ex) {
			ex.printStackTrace();
			// TODO: handle exception
		}
		return 0;
	}
	
	public int adexecuteQuery(String user,String pwd) {
		try {
			System.out.println("user:"+user+"pwd:"+pwd);
			conn=getConnection();//获取数据库连�?
			//创建用于执行SQK语句的Statement对象
			stmt=conn.prepareStatement("select * from ad where adID=? and adPwd=?");
			stmt.setString(1,user);
			stmt.setString(2,pwd);
			rs=stmt.executeQuery();//执行SQL语句
			System.out.println("���ݿ��ѯ���");
			if (rs.next()&&rs!=null) { 
				return 1;
				
			}else{
				return 0;
			}
		}catch (SQLException ex) {
			ex.printStackTrace();
			// TODO: handle exception
		}
		return 0;
	}
	
	
	/*
	 * 功能：关闭数据库连接
	 */
	public void close() {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(stmt!=null) {
				stmt.close();
			}
			if(conn!=null) {
				conn.close();
			}
		}catch (Exception e) {
			e.printStackTrace(System.err);
			// TODO: handle exception
		}
	}
	public static void main(String[]args) {
		if(getConnection()!=null) {
			System.out.println("数据库连接成�?");
		}
	}

}
