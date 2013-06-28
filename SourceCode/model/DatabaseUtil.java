package model;

import java.sql.Connection;//引用Connection包
import java.sql.DriverManager;//引用DriveManager包
import java.sql.ResultSet;//引用ResultSet包
import java.sql.SQLException;//引用SQLException包
import java.sql.Statement;//引用Statement包

public class DatabaseUtil {
	
	public static boolean objectIsExist(String table,String column,String value){
		Connection conn=DatabaseUtil.getConnection();
		String sql="select * from " + table+ " where "+ column + " = " + "'"+ value +"'";
		try {
			Statement st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery(sql); 
			if(rs.next()){	
				//���ҵ��򷵻�true�����������Ѿ�����
				DatabaseUtil.closeConnection(conn);
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
		DatabaseUtil.closeConnection(conn);
		return false;
	}//异常处理
	
    public static Connection getConnection() {  
        Connection con = null; 
        try {  
            Class.forName("com.mysql.jdbc.Driver");// ����Mysql��������            
            con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/CampusActivity", "root", "admin");// ������������  
        } catch (Exception e) {  
            System.out.println("���ݿ�����ʧ��" + e.getMessage());  
        }  
        return con; 
    } 
    
    public static void closeConnection(Connection con) {  
    	if(con!=null)
    		try{
    			con.close();
    		}catch(Exception e){
    			System.out.println("�ر����ݿ�ʧ��");
    		}
    }
}
