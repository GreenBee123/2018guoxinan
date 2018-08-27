package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import conn.Conn;
import model.Requirement;
import page.PageInfo;

public class RequirementDao {
	Conn conn;

	public RequirementDao() {
		conn = new Conn();
	}

	public List<Requirement> getRequirement(PageInfo pageInfo) {
		PreparedStatement prep = null;
		if (pageInfo.isPage) {
			// 当需要分页的时候先计算 总记录数
			int itemCount = getItemCount();
			pageInfo.setItemCount(itemCount);
			// 对应第3部
			try {
				prep = conn.connection.prepareStatement("select * from requirement limit ?,?");
				prep.setInt(1, pageInfo.getOffset());
				prep.setInt(2, pageInfo.getLimit());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			// 对应第3部
			try {
				prep = conn.connection.prepareStatement("select * from requirement");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {

			ResultSet rs = prep.executeQuery();
			List<Requirement> requirements = new ArrayList<Requirement>();// 一行代表一个学生，很多学生就使用list集合保存，此处集合内容为空

			while (rs.next()) {
				int rID = rs.getInt(3);
				Timestamp rTime = rs.getTimestamp(5);
				String rRemarks = rs.getString(6);
				String rType = rs.getString(7);
				Requirement requirement = new Requirement(rID, rTime, rRemarks, rType);
				requirements.add(requirement);// 添加学生对象到 学生集合
			}
			return requirements;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Requirement getById(int rID) {
		try {
			// 对应第3部
			PreparedStatement prep = conn.connection.prepareStatement("select * from requirement where `rID`=?");
			prep.setInt(1, rID);
			ResultSet rs = prep.executeQuery();
			Requirement requirement = null;
			while (rs.next()) {
				;
				// int rID=rs.getInt(3);
				Timestamp rTime = rs.getTimestamp(5);
				String rRemarks = rs.getString(6);
				String rType = rs.getString(7);
				requirement = new Requirement(rID, rTime, rRemarks, rType);
			}
			return requirement;
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
			PreparedStatement prep = conn.connection.prepareStatement("select count(*) from requirement");
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

	public int add(Requirement requirement) {
		int result = 0;
		try {
			PreparedStatement prep = conn.connection
					.prepareStatement("INSERT INTO requirement" + "(`rID`,`rTime`,`rRemarks`,`rType`) VALUES(?,?,?,?)");

			prep.setInt(1, requirement.getrID());
			prep.setTimestamp(2, requirement.getrTime());
			prep.setString(3, requirement.getrRemarks());
			prep.setString(4, requirement.getrType());
			result = prep.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public int update(Requirement requirement) {
		int result = 0;
		try {
			PreparedStatement prep = conn.connection
					.prepareStatement("update requirement  set `rTime`=?,`rRemarks`=?,`rType`=? where `rID`=?");
			prep.setTimestamp(1, requirement.getrTime());
			prep.setString(2, requirement.getrRemarks());
			prep.setString(3, requirement.getrType());
			prep.setInt(4, requirement.getrID());
			result = prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
