package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ActivityDao {
	
	public static boolean activityIsExist(String activityID){
		return DatabaseUtil.objectIsExist("Activity", "ID", activityID);
	}
	
	public static void addActivity(Activity activity){
		Connection conn=DatabaseUtil.getConnection();
		String sql="insert into Activity(ID,title,pageURL,belongs) values(" + 
					"'" + activity.ID + "'" + "," +
					"'" + activity.title + "'" + "," +
					"'" + activity.pageURL + "'" + "," +
					"'" + activity.belongs + "'" + 
					")";
		Statement st;
		try {
			st = (Statement) conn.createStatement();
			st.executeUpdate(sql); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       
        DatabaseUtil.closeConnection(conn);
	}
	
	public static void removeActivity(String ID){
		Connection conn=DatabaseUtil.getConnection();
		String sql="delete from Activity where ID = " + "'"+ ID +"'";
		Statement st;
		try {
			st = (Statement) conn.createStatement();
			st.executeUpdate(sql); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       
        DatabaseUtil.closeConnection(conn);
	}
	public static ArrayList<Activity> getAllActivities(){
		ArrayList<Activity> activities=new ArrayList<Activity>();	
		Connection conn=DatabaseUtil.getConnection();
		String sql="select * from  Activity";
		try {
			Statement st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery(sql); 
			while(rs.next()){	
				//若找到则返回true代表该用于已经存在
				Activity activity=new Activity();
				activity.ID=rs.getString("ID");
				activity.title=rs.getString("title");
				activity.pageURL=rs.getString("pageURL");
				activity.belongs=rs.getString("belongs");
				activities.add(activity);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		DatabaseUtil.closeConnection(conn);
		return activities;
		
	}
	
	public static ArrayList<Activity> getOwnActivities(String belongs){
		ArrayList<Activity> activities=new ArrayList<Activity>();	
		Connection conn=DatabaseUtil.getConnection();
		String sql="select * from  Activity  where belongs = " + "'"+ belongs +"'";
		try {
			Statement st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery(sql); 
			while(rs.next()){	
				//若找到则返回true代表该用于已经存在
				Activity activity=new Activity();
				activity.ID=rs.getString("ID");
				activity.title=rs.getString("title");
				activity.pageURL=rs.getString("pageURL");
				activity.belongs=rs.getString("belongs");
				activities.add(activity);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		DatabaseUtil.closeConnection(conn);
		return activities;
	}
}
