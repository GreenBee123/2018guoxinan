package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.NEW;

import conn.Conn;
import model.Ad;
import page.PageInfo;

public class AdDao {
	Conn conn;

	public List<Ad> getAd(PageInfo pageInfo) {
		PreparedStatement prep = null;
		if (pageInfo.isPage) {
			int itemCount = getItemCount();
			pageInfo.setItemCount(itemCount);
			// ��Ӧ��3��
			try {
				prep = conn.connection.prepareStatement("select * from ad limit ?,?");
				prep.setInt(1, pageInfo.getOffset());
				prep.setInt(2, pageInfo.getLimit());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			// ��Ӧ��3��
			try {
				prep = conn.connection.prepareStatement("select * from ad");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {

			ResultSet rs = prep.executeQuery();
			List<Ad> ads = new ArrayList<Ad>();// һ�д���һ��ѧ�����ܶ�ѧ����ʹ��list���ϱ��棬�˴���������Ϊ��

			while (rs.next()) {
				int adID = rs.getInt(1);
				String adName = rs.getString(2);
				String adPwd = rs.getString(3);
				Ad ad = new Ad(adID, adName, adPwd);
				ads.add(ad);
			}
			return ads;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Ad getById(int adID) {
		try {
			// ��Ӧ��3��
			PreparedStatement prep = conn.connection.prepareStatement("select * from ad where `adID`=?");
			prep.setInt(1, adID);
			ResultSet rs = prep.executeQuery();
			List<Ad> ads = new ArrayList<Ad>();
			Ad ad = null;
			while (rs.next()) {
				// int adID=rs.getInt(1);
				String adName = rs.getString(2);
				String adPwd = rs.getString(3);
				ad = new Ad(adID, adName, adPwd);
			}
			return ad;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int getItemCount() {
		int itemCount = 0;
		try {
			// ��Ӧ��3��
			PreparedStatement prep = conn.connection.prepareStatement("select count(*) from ad");
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

	public int add(Ad ad) {
		int result = 0;
		try {
			PreparedStatement prep = conn.connection
					.prepareStatement("INSERT INTO ad" + "(`adID`,`adName`,`adPwd`) VALUES(?,?,?)");

			prep.setInt(1, ad.getAdID());
			prep.setString(2, ad.getAdName());
			prep.setString(3, ad.getAdPwd());
			result = prep.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public int update(Ad ad) {
		int result = 0;
		try {
			PreparedStatement prep = conn.connection
					.prepareStatement("update ad set `adName`=?,`adPwd`=? where `adID`=?");

			prep.setString(1, ad.getAdName());
			prep.setString(2, ad.getAdPwd());
			prep.setInt(3, ad.getAdID());
			result = prep.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public AdDao() {
		super();
		conn = new Conn();
		// TODO Auto-generated constructor stub
	}
}