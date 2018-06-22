package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import model.domain.SongVO;
import util.DBUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SongDAO {
	static String totalData="";
	static ResourceBundle sql = DBUtil.getResourceBundle();
	static {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("D:\\0.Bigdata\\4.web\\ysproject\\songlist.json"));

			String value = in.readLine();
			while (value != null) {
				totalData += value;
				value = in.readLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static String jsonData() {
		return totalData;
	}

   //특정 곡명으로 노래 검색
   public static ArrayList<SongVO> selectSongsBySongName(String songName) throws SQLException {
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rset = null;
      ArrayList<SongVO> song1 = null;
      
      try {
         con = DBUtil.getConnection();
         pstmt = con.prepareStatement(sql.getString("selectSongBySongName"));
         pstmt.setString(1, "%"+songName+"%");
         rset=pstmt.executeQuery();
         song1= new ArrayList<SongVO>();
         while(rset.next()) {
            song1.add(new SongVO(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5), rset.getString(6)));
         }
      }finally {
         DBUtil.close(con, pstmt, rset);
      }
      return song1;      
   }
   
   
   //장르별 노래 검색
   public static ArrayList<SongVO> selectSongsByGenre(String genre) throws SQLException {
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rset = null;
      ArrayList<SongVO> song2 = null;
   
      try {
         con = DBUtil.getConnection();
         pstmt = con.prepareStatement(sql.getString("selectSongByGenre"));
         pstmt.setString(1, "%"+genre+"%");
         rset = pstmt.executeQuery();
         song2= new ArrayList<SongVO>();
         while(rset.next()) {
        	 song2.add(new SongVO(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5), rset.getString(6)));
         }
      }finally {
         DBUtil.close(con, pstmt, rset);
      }
      return song2;
   }
   
   
   
   //가수별 노래 검색
   public static ArrayList<SongVO> selectSongsByArtist(String artist) throws SQLException {
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rset = null;
      ArrayList<SongVO> song3 = null;
   
      try {
         con = DBUtil.getConnection();
         pstmt = con.prepareStatement(sql.getString("selectSongByArtist"));
         pstmt.setString(1, "%"+artist+"%");
         rset = pstmt.executeQuery();
         song3= new ArrayList<SongVO>();
         while(rset.next()) {
        	 song3.add(new SongVO(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5), rset.getString(6)));
         }
      }finally {
         DBUtil.close(con, pstmt, rset);
      }
      return song3;
   }
   
}