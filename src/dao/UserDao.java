package dao;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conn.Conn;
import model.User;
import page.PageInfo;

public class UserDao {
	Conn conn;

	public List<User> getUser(PageInfo pageInfo) {
		PreparedStatement prep = null;
		if (pageInfo.isPage) {
			// 当需要分页的时候先计算 总记录数
			int itemCount = getItemCount();
			pageInfo.setItemCount(itemCount);
			// 对应第3部
			try {
				prep = conn.connection.prepareStatement("select * from user limit ?,?");
				prep.setInt(1, pageInfo.getOffset());
				prep.setInt(2, pageInfo.getLimit());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			// 对应第3部
			try {
				prep = conn.connection.prepareStatement("select * from user");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {

			ResultSet rs = prep.executeQuery();
			List<User> users = new ArrayList<User>();// 一行代表一个学生，很多学生就使用list集合保存，此处集合内容为空

			while (rs.next()) {
				int uID = rs.getInt(1);
				String uName = rs.getString(2);
				String uTrueName = rs.getString(3);
				String uPwd = rs.getString(4);
				BigDecimal uTel = rs.getBigDecimal(5);
				String uAdress = rs.getString(6);
				String uEmail = rs.getString(7);
				int uCredit = rs.getInt(8);
				User user = new User(uID, uName, uTrueName, uPwd, uTel, uAdress, uEmail, uCredit);
				users.add(user);// 添加学生对象到 学生集合
			}
			return users;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public User getById(int uID) {
		try {
			// 对应第3部
			PreparedStatement prep = conn.connection.prepareStatement("select * from user where `uID`=?");
			prep.setInt(1, uID);
			ResultSet rs = prep.executeQuery();
			List<User> users = new ArrayList<User>();
			User user = null;
			while (rs.next()) {
				// int adID=rs.getInt(1);
				String uName = rs.getString(2);
				String uTrueName = rs.getString(3);
				String uPwd = rs.getString(4);
				BigDecimal uTel = rs.getBigDecimal(5);
				String uAdress = rs.getString(6);
				String uEmail = rs.getString(7);
				int uCredit = rs.getInt(8);
				user = new User(uID, uName, uTrueName, uPwd, uTel, uAdress, uEmail, uCredit);
			}
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int getItemCount() {
		int itemCount = 0;
		try {
			// 对应第3部
			PreparedStatement prep = conn.connection.prepareStatement("select count(*) from user");
			ResultSet rs = prep.executeQuery();

			if (rs.next()) {
				itemCount = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return itemCount;
	}

	public int add(User user) {
		int result = 0;
		try {
			PreparedStatement prep = conn.connection.prepareStatement("INSERT INTO user"
					+ "(`uID`,`uName`,`uTrueName`,`uPwd`,`uTel`,`uAdress`,`uEmail`,`uCredit`) VALUES(?,?,?,?,?,?,?,?)");

			prep.setInt(1, user.getuID());
			prep.setString(2, user.getuName());
			prep.setString(3, user.getuTrueName());
			prep.setString(4, user.getuPwd());
			prep.setBigDecimal(5, user.getuTel());
			prep.setString(6, user.getuAdress());
			prep.setString(7, user.getuEmail());
			prep.setInt(8, user.getuCredit());
			result = prep.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public int update(User user) {
		int result = 0;
		try {
			PreparedStatement prep = conn.connection.prepareStatement(
					"update user set `uName`=?,`uTrueName`=?,`uPwd`=?,`uTel`=?,`uAdress`=?,`uEmail`=?,`uCredit`=? where `uID`=? ");

			prep.setString(1, user.getuName());
			prep.setString(2, user.getuTrueName());
			prep.setString(3, user.getuPwd());
			prep.setBigDecimal(4, user.getuTel());
			prep.setString(5, user.getuAdress());
			prep.setString(6, user.getuEmail());
			prep.setInt(7, user.getuCredit());
			prep.setInt(8, user.getuID());
			result = prep.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public UserDao() {
		super();
		conn = new Conn();
		// TODO Auto-generated constructor stub
	}

}
