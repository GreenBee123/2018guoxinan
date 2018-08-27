package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conn.Conn;
import model.Attendant;
import page.PageInfo;

public class AttendantDao {
	Conn conn;

	public List<Attendant> getAttendant(PageInfo pageInfo) {
		PreparedStatement prep = null;
		if (pageInfo.isPage) {
			// 当需要分页的时候先计算 总记录数
			int itemCount = getItemCount();
			pageInfo.setItemCount(itemCount);
			// 对应第3部
			try {
				prep = conn.connection.prepareStatement("select * from attendant limit ?,?");
				prep.setInt(1, pageInfo.getOffset());
				prep.setInt(2, pageInfo.getLimit());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			// 对应第3部
			try {
				prep = conn.connection.prepareStatement("select * from attendant");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {

			ResultSet rs = prep.executeQuery();
			List<Attendant> attendants = new ArrayList<Attendant>();// 一行代表一个学生，很多学生就使用list集合保存，此处集合内容为空

			while (rs.next()) {
				int aID = rs.getInt(1);
				String aName = rs.getString(2);
				String aTrueName = rs.getString(3);
				String aPwd = rs.getString(4);
				int aTel = rs.getInt(5);
				String aAdress = rs.getString(6);
				String aEmail = rs.getString(7);
				int aCredit = rs.getInt(8);
				Attendant attendant = new Attendant(aID, aName, aTrueName, aPwd, aTel, aAdress, aEmail, aCredit);
				attendants.add(attendant);// 添加学生对象到 学生集合
			}
			return attendants;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Attendant getById(int aID) {
		try {
			// 对应第3部
			PreparedStatement prep = conn.connection.prepareStatement("select * from attendant where `aID`=?");
			prep.setInt(1, aID);
			ResultSet rs = prep.executeQuery();
			List<Attendant> attendants = new ArrayList<Attendant>();
			Attendant attendant = null;
			while (rs.next()) {
				// int aID=rs.getInt(1);
				String aName = rs.getString(2);
				String aTrueName = rs.getString(3);
				String aPwd = rs.getString(4);
				int aTel = rs.getInt(5);
				String aAdress = rs.getString(6);
				String aEmail = rs.getString(7);
				int aCredit = rs.getInt(8);
				attendant = new Attendant(aID, aName, aTrueName, aPwd, aTel, aAdress, aEmail, aCredit);
			}
			return attendant;
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
			PreparedStatement prep = conn.connection.prepareStatement("select count(*) from attendant");
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

	public int add(Attendant attendant) {
		int result = 0;
		try {
			PreparedStatement prep = conn.connection.prepareStatement("INSERT INTO attendant"
					+ "(`aID`,`aName`,`aTrueName`,`aPwd`,`aTel`,`aAdress`,`aEmail`,`aCredit`) VALUES(?,?,?,?,?,?,?,?)");

			prep.setInt(1, attendant.getaID());
			prep.setString(2, attendant.getaName());
			prep.setString(3, attendant.getaTrueName());
			prep.setString(4, attendant.getaPwd());
			prep.setInt(5, attendant.getaTel());
			prep.setString(6, attendant.getaAdress());
			prep.setString(7, attendant.getaEmail());
			prep.setInt(8, attendant.getaCredit());
			result = prep.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public int update(Attendant attendant) {
		int result = 0;
		try {
			PreparedStatement prep = conn.connection.prepareStatement(
					"update attendant set `aName`=?,`aTrueName`=?,`aPwd`=?,`aTel`=?,`aAdress`=?,`aEmail`=?,`aCredit`=? where `aID`=? ");

			prep.setString(1, attendant.getaName());
			prep.setString(2, attendant.getaTrueName());
			prep.setString(3, attendant.getaPwd());
			prep.setInt(4, attendant.getaTel());
			prep.setString(5, attendant.getaAdress());
			prep.setString(6, attendant.getaEmail());
			prep.setInt(7, attendant.getaCredit());
			prep.setInt(8, attendant.getaID());
			result = prep.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public AttendantDao() {
		super();
		// TODO Auto-generated constructor stub
		conn = new Conn();
	}

}
