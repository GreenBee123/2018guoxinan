package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conn.Conn;
import model.Computer;
import page.PageInfo;

public class ComputerDao {
	Conn conn;

	public List<Computer> getComputer(PageInfo pageInfo) {
		PreparedStatement prep = null;
		if (pageInfo.isPage) {
			// 当需要分页的时候先计算 总记录数
			int itemCount = getItemCount();
			pageInfo.setItemCount(itemCount);
			// 对应第3部
			try {
				prep = conn.connection.prepareStatement("select * from computer limit ?,?");
				prep.setInt(1, pageInfo.getOffset());
				prep.setInt(2, pageInfo.getLimit());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			// 对应第3部
			try {
				prep = conn.connection.prepareStatement("select * from computer");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {

			ResultSet rs = prep.executeQuery();
			List<Computer> computers = new ArrayList<Computer>();// 一行代表一个学生，很多学生就使用list集合保存，此处集合内容为空

			while (rs.next()) {
				int cID = rs.getInt(1);
				String cBrand = rs.getString(2);
				String cModel = rs.getString(3);
				Computer computer = new Computer(cID, cBrand, cModel);
				computers.add(computer);// 添加学生对象到 学生集合
			}
			return computers;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Computer getById(int cID) {
		try {
			// 对应第3部
			PreparedStatement prep = conn.connection.prepareStatement("select * from computer where `cID`=?");
			prep.setInt(1, cID);
			ResultSet rs = prep.executeQuery();
			List<Computer> computers = new ArrayList<Computer>();// 一行代表一个学生，很多学生就使用list集合保存，此处集合内容为空
			Computer computer = null;
			while (rs.next()) {
				// int cID=rs.getInt(1);
				String cBrand = rs.getString(2);
				String cModel = rs.getString(3);
				computer = new Computer(cID, cBrand, cModel);
			}
			return computer;
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
			PreparedStatement prep = conn.connection.prepareStatement("select count(*) from computer");
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

	public int add(Computer computer) {
		int result = 0;
		try {
			PreparedStatement prep = conn.connection
					.prepareStatement("INSERT INTO computer" + "(`cID`,`cBrand`,`cModel`) VALUES(?,?,?)");
			prep.setInt(1, computer.getcID());
			prep.setString(2, computer.getcBrand());
			prep.setString(3, computer.getcModel());
			result = prep.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public int update(Computer computer) {
		int result = 0;
		try {
			PreparedStatement prep = conn.connection
					.prepareStatement("update computer set `cBrand`=?,`cModel`=? where `cID`=?");

			prep.setString(1, computer.getcBrand());
			prep.setString(2, computer.getcModel());
			prep.setInt(3, computer.getcID());
			result = prep.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public ComputerDao() {
		super();
		conn = new Conn();
		// TODO Auto-generated constructor stub
	}
}
