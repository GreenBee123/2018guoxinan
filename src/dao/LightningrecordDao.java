package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import conn.Conn;
import model.Lightningrecord;
import page.PageInfo;

public class LightningrecordDao {
	Conn conn;

	public LightningrecordDao() {
		conn = new Conn();
	}

	public List<Lightningrecord> getLightningrecord(PageInfo pageInfo) {
		PreparedStatement prep = null;
		if (pageInfo.isPage) {
			// 当需要分页的时候先计算 总记录数
			int itemCount = getItemCount();
			pageInfo.setItemCount(itemCount);
			// 对应第3部
			try {
				prep = conn.connection.prepareStatement("select * from lightningrecord limit ?,?");
				prep.setInt(1, pageInfo.getOffset());
				prep.setInt(2, pageInfo.getLimit());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			// 对应第3部
			try {
				prep = conn.connection.prepareStatement("select * from lightningrecord");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {

			ResultSet rs = prep.executeQuery();
			List<Lightningrecord> lightningrecords = new ArrayList<Lightningrecord>();// 一行代表一个学生，很多学生就使用list集合保存，此处集合内容为空

			while (rs.next()) {
				int lID = rs.getInt(1);
				Timestamp lTime = rs.getTimestamp(4);
				Timestamp lCheakTime = rs.getTimestamp(5);
				Timestamp lCheakTakeTime = rs.getTimestamp(6);
				String lCheakRemarks = rs.getString(7);
				String lUserCharge = rs.getString(8);
				String lAttendantCharge = rs.getString(9);
				Lightningrecord lightningrecord = new Lightningrecord(lID, lTime, lCheakTime, lCheakTakeTime,
						lCheakRemarks, lUserCharge, lAttendantCharge);
				lightningrecords.add(lightningrecord);// 添加学生对象到 学生集合
			}
			return lightningrecords;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Lightningrecord getById(int lID) {
		try {
			// 对应第3部
			PreparedStatement prep = conn.connection.prepareStatement("select * from lightningrecord where `lID`=?");
			prep.setInt(1, lID);
			ResultSet rs = prep.executeQuery();
			Lightningrecord lightningrecord = null;
			while (rs.next()) {
				// int lID=rs.getInt(1);
				Timestamp lTime = rs.getTimestamp(4);
				Timestamp lCheakTime = rs.getTimestamp(5);
				Timestamp lCheakTakeTime = rs.getTimestamp(6);
				String lCheakRemarks = rs.getString(7);
				String lUserCharge = rs.getString(8);
				String lAttendantCharge = rs.getString(9);
				lightningrecord = new Lightningrecord(lID, lTime, lCheakTime, lCheakTakeTime, lCheakRemarks,
						lUserCharge, lAttendantCharge);
			}
			return lightningrecord;
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
			PreparedStatement prep = conn.connection.prepareStatement("select count(*) from lightningrecord");
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

	public int add(Lightningrecord lightningrecord) {
		int result = 0;
		try {
			PreparedStatement prep = conn.connection.prepareStatement("INSERT INTO lightningrecord"
					+ "(`lID`,`lTime`,`lCheakTime`,`lCheakTakeTime`,`lCheakRemarks`,`lUserCharge`,`lAttendantCharge`) VALUES(?,?,?,?,?,?,?)");
			prep.setInt(1, lightningrecord.getlID());
			prep.setTimestamp(2, lightningrecord.getlTime());
			prep.setTimestamp(3, lightningrecord.getlCheakTime());
			prep.setTimestamp(4, lightningrecord.getlCheakTakeTime());
			prep.setString(5, lightningrecord.getlCheakRemarks());
			prep.setString(6, lightningrecord.getlUserCharge());
			prep.setString(7, lightningrecord.getlAttendantCharge());
			result = prep.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public int update(Lightningrecord lightningrecord) {
		int result = 0;
		try {
			PreparedStatement prep = conn.connection.prepareStatement(
					"update lightningrecord set `lTime`=?,`lCheakTime`=?,`lCheakTakeTime`=?,`lCheakRemarks`=?,`lUserCharge`=?,`lAttendantCharge`=? where `lID`=?");
			prep.setTimestamp(1, lightningrecord.getlTime());
			prep.setTimestamp(2, lightningrecord.getlCheakTime());
			prep.setTimestamp(3, lightningrecord.getlCheakTakeTime());
			prep.setString(4, lightningrecord.getlCheakRemarks());
			prep.setString(5, lightningrecord.getlUserCharge());
			prep.setString(6, lightningrecord.getlAttendantCharge());
			prep.setInt(7, lightningrecord.getlID());
			result = prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
