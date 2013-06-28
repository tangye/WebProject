package model;

import java.sql.Connection;//引用Connection包
import java.sql.ResultSet;//引用ResultSet包
import java.sql.SQLException;//引用SOLException包
import java.sql.Statement;//引用Statement包

public class UserDao {
	public static final byte NOT_EXIST=0;
	public static final byte WRONG_PASSWORD=1;
	public static final byte VERIFY_CORRECT=2;
	
	public static boolean userIsExist(String userID){
		return DatabaseUtil.objectIsExist("UserInfo", "ID", userID);
	}
	
	public static void addUser(User user){
		Connection conn=DatabaseUtil.getConnection();
		String sql="insert into UserInfo(ID,password,identity) values(" + 
					"'" + user.ID + "'" + "," +
					"'" + user.password + "'" + "," +
					"'" + user.identity + "'" + 
					")";//为sql赋值
		Statement st;
		try {
			st = (Statement) conn.createStatement();
			st.executeUpdate(sql); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//异常处理       
        DatabaseUtil.closeConnection(conn);
	}
	public static User getWholeInfo(String ID){
		User user=new User();
		Connection conn=DatabaseUtil.getConnection();
		String sql="select * from  UserInfo  where ID = " + "'"+ ID +"'";
		try {
			Statement st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery(sql); 
			while(rs.next()){	
				user.ID=rs.getString("ID");
				user.identity=rs.getString("identity");
				user.email=rs.getString("email");
				user.sex=rs.getString("sex");
				DatabaseUtil.closeConnection(conn);
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public static String getIdentity(String ID){
		Connection conn=DatabaseUtil.getConnection();
		String sql="select * from  UserInfo  where ID = " + "'"+ ID +"'";
		try {
			Statement st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery(sql); 
			while(rs.next()){	
				String status=rs.getString("identity");
				DatabaseUtil.closeConnection(conn);
				return status;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public static byte verifyUser(User user){ 
		Connection conn=DatabaseUtil.getConnection();
		String sql="select * from  UserInfo  where ID = " + "'"+ user.ID +"'";
		try {
			Statement st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery(sql); 
			if(rs.next()){	
				String password=rs.getString("password");
				if(password.equals(user.password))
					return VERIFY_CORRECT;
				else
					return WRONG_PASSWORD;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		DatabaseUtil.closeConnection(conn);
		return NOT_EXIST;
	}
}
