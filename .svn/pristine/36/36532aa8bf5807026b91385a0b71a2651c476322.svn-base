package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Conn {
	//final 不可修改，必须初始化
  public final static String drivername = "com.mysql.jdbc.Driver";
  public final static String user = "root";
  public final static String password = "root";
  public final static String url = "jdbc:mysql://localhost:3306/diannao";
  
  
	private static String dbClassName="com.mysql.jdbc.Driver";
	private static String dbUrl="jdbc:mysql://localhost:3306/diannao";
	private static String dbUser="";
	private static String dbPwd="";
	
  public Connection connection;
  public Statement stmt=null;//Statement瀵硅薄锛岀敤浜庢墽琛孲QL璇彞
  public ResultSet rs=null;//缁撴灉闆嗗璞�
  PreparedStatement pstmt=null;
  //构造方法和 类名同名，没有返回值，new 对象的时候调用,初始化基本设置和成员变量
  //图形界面要打开数据库并且完成查询
  //1.运行exe
  //2.填写主机名端口号 用户名 密码后 连接
  //3.编写查询语句（新开查询编辑器）
  //4.执行查询得到结果（选中按f8）
  //5.显示结果
  public Conn(){
	  try {
		Class.forName(drivername);//Class.forName是java反射机制，一个名字可以变成一个类和对象，对应第一步
		connection = DriverManager.getConnection(url, user, password);//对应的第二步
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  

  public static void main(String[] args) {
//	new Conn().getStudent();
}
}
