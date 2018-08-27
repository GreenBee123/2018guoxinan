package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conn.Conn;
import model.ComputerDetails;
import page.PageInfo;

//private int dID;                    //ID
//private String dType;               //损坏类型
//private String dCPU;                //CPU型号
//private String dGraphicsCard;       //显卡型号
//private String dHardDisk;           //硬盘容量
//private String dMemory;  
public class ComputerDetailsDao {
	Conn conn;

	public ComputerDetailsDao() {
		conn = new Conn();
	}

	public List<ComputerDetails> getComputerDetails(PageInfo pageInfo) {
		PreparedStatement prep = null;
		if (pageInfo.isPage) {
			// 当需要分页的时候先计算 总记录数
			int itemCount = getItemCount();
			pageInfo.setItemCount(itemCount);
			// 对应第3部
			try {
				prep = conn.connection.prepareStatement("select * from computerdetails limit ?,?");
				prep.setInt(1, pageInfo.getOffset());
				prep.setInt(2, pageInfo.getLimit());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			// 对应第3部
			try {
				prep = conn.connection.prepareStatement("select * from computerdetails");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {

			ResultSet rs = prep.executeQuery();
			List<ComputerDetails> computerDetails = new ArrayList<ComputerDetails>();// 一行代表一个学生，很多学生就使用list集合保存，此处集合内容为空

			while (rs.next()) {
				int dID = rs.getInt(2);
				String dType = rs.getString(3);
				String dCPU = rs.getString(4);
				String dGraphicsCard = rs.getString(5);
				String dHardDisk = rs.getString(6);
				String dMemory = rs.getString(7);
				ComputerDetails computerDetail = new ComputerDetails(dID, dType, dCPU, dGraphicsCard, dHardDisk,
						dMemory);
				computerDetails.add(computerDetail);// 添加学生对象到 学生集合
			}
			return computerDetails;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ComputerDetails getById(int dID) {
		try {
			// 对应第3部
			PreparedStatement prep = conn.connection.prepareStatement("select * from computerdetails where `dID`=?");
			prep.setInt(1, dID);
			ResultSet rs = prep.executeQuery();
			ComputerDetails computerDetails = null;
			while (rs.next()) {
				// int dID=rs.getInt(1);
				String dType = rs.getString(3);
				String dCPU = rs.getString(4);
				String dGraphicsCard = rs.getString(5);
				String dHardDisk = rs.getString(6);
				String dMemory = rs.getString(7);
				computerDetails = new ComputerDetails(dID, dType, dCPU, dGraphicsCard, dHardDisk, dMemory);
			}
			return computerDetails;
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
			PreparedStatement prep = conn.connection.prepareStatement("select count(*) from computerdetails");
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

	public int add(ComputerDetails computerDetails) {
		int result = 0;
		try {
			PreparedStatement prep = conn.connection.prepareStatement(
					"INSERT INTO computerdetails(dID,dType,dCPU,dGraphicsCard,dHardDisk,dMemory) VALUES(?,?,?,?,?,?)");
			prep.setInt(1, computerDetails.getdID());
			prep.setString(2, computerDetails.getdType());
			prep.setString(3, computerDetails.getdCPU());
			prep.setString(4, computerDetails.getdGraphicsCard());
			prep.setString(5, computerDetails.getdHardDisk());
			prep.setString(6, computerDetails.getdMemory());
			result = prep.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public int update(ComputerDetails computerDetails) {
		int result = 0;
		try {
			PreparedStatement prep = conn.connection.prepareStatement(
					"update computerdetails set `dType`=?,`dCPU`=?,`dGraphicsCard`=?,`dHardDisk`=?,`dMemory`=? where `dID`=?");
			prep.setString(1, computerDetails.getdType());
			prep.setString(2, computerDetails.getdCPU());
			prep.setString(3, computerDetails.getdGraphicsCard());
			prep.setString(4, computerDetails.getdHardDisk());
			prep.setString(5, computerDetails.getdMemory());
			prep.setInt(6, computerDetails.getdID());
			result = prep.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
