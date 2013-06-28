package model;

import java.sql.Connection;//引用Connection包
import java.sql.ResultSet;//引用ResultSet包
import java.sql.SQLException;//引用SQLException包
import java.sql.Statement;//引用Statement包
import java.util.ArrayList;//引用ArrayList包

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
					")";//给sql串赋值
		Statement st;
		try {
			st = (Statement) conn.createStatement();
			st.executeUpdate(sql); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//异常预防机制       
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
		}//异常预防机制       
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
				//���ҵ��򷵻�true�����������Ѿ�����
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
				//���ҵ��򷵻�true�����������Ѿ�����
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
