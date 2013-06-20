package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtil {
	
	public static boolean objectIsExist(String table,String column,String value){
		Connection conn=DatabaseUtil.getConnection();
		String sql="select * from " + table+ " where "+ column + " = " + "'"+ value +"'";
		try {
			Statement st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery(sql); 
			if(rs.next()){	
				//若找到则返回true代表该用于已经存在
				DatabaseUtil.closeConnection(conn);
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
		DatabaseUtil.closeConnection(conn);
		return false;
	}
	
    public static Connection getConnection() {  
        Connection con = null; 
        try {  
            Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动            
            con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/CampusActivity", "root", "admin");// 创建数据连接  
        } catch (Exception e) {  
            System.out.println("数据库连接失败" + e.getMessage());  
        }  
        return con; 
    } 
    
    public static void closeConnection(Connection con) {  
    	if(con!=null)
    		try{
    			con.close();
    		}catch(Exception e){
    			System.out.println("关闭数据库失败");
    		}
    }
}
