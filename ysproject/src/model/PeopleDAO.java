package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import model.domain.PeopleVO;
import util.DBUtil;

public class PeopleDAO {
	static ResourceBundle sql = DBUtil.getResourceBundle();
	
	//회원가입된사람 DB에 추가
	public static int insert(PeopleVO value) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		try{
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getString("addClient"));
			
			pstmt.setString(1, value.getId());
			pstmt.setString(2, value.getPw());
			pstmt.setString(3, value.getName());
			pstmt.setString(4, value.getGender());
			pstmt.setString(5, value.getBirthday());
			
			return pstmt.executeUpdate();
			
		}finally {
			DBUtil.close(con, pstmt);
		}
	}
	//로그인 검색
	public static int login(String id, String pw){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try{
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select password from people where id =?");
			
			pstmt.setString(1, id);
			rset=pstmt.executeQuery();
			if(rset.next()) {
				if(rset.getString(1).equals(pw)) {
					return 1;
				}
			}
			return -1;
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.close(con, pstmt);
		}return -2;
	}
   //모든 회원정보 검색
   public static ArrayList<PeopleVO> selectAllPeople() throws SQLException {
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rset = null;
      ArrayList<PeopleVO>all=null;
      try {
         con=DBUtil.getConnection();
         pstmt=con.prepareStatement(sql.getString("selectClientAll"));
         rset=pstmt.executeQuery();
         
         all=new ArrayList<PeopleVO>();
         
         while (rset.next()) {
        	 all.add(new PeopleVO(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5)));
         }
      }finally {
         DBUtil.close(con, pstmt, rset);
      }
      return all;
   }
   
   //강제추방(회원정보 삭제)
   public static boolean deletePerson(String id) throws SQLException {
      Connection con = null;
      PreparedStatement pstmt = null;
      try {
         con = DBUtil.getConnection();
         pstmt = con.prepareStatement(sql.getString("deleteClient"));
         pstmt.setString(1, id);
         int result = pstmt.executeUpdate();
         if(result==1) {
            return true;
         }
      }finally {
         DBUtil.close(con, pstmt);
      }
      return false;
   }
}
