package New_Packages;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class SQL_Connection {

	
	
		
	//Below is working code
	//public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		static String value;
		
		@Test()
		public static void test() throws ClassNotFoundException, SQLException {
			
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		//Local Database setting final String url = "jdbc:sqlserver://DESKTOP-C6M5A7U\\SQLEXPRESS:1433;database=stb_production;authenticationScheme=NTLM;integratedSecurity=false;trustServerCertificate=true";
		final String url = "jdbc:sqlserver://172.20.10.149\\PRODUCTION:1433;database=stb_production;authenticationScheme=NTLM;integratedSecurity=false;trustServerCertificate=true";
		// Local User final String user ="Lalit.Soni" ;
		// Local Password final String password ="Password123" ;
		final String user ="sa" ;
		final String password ="Sql2012PM" ;
		String PCB_Number = "123456000005";
		
		Connection connection = DriverManager.getConnection(url,user,password);
		
		Statement st = connection.createStatement();
		String Sql = "select id_status,timestamp from production_event where pcb_num = '" + PCB_Number + "'";
		ResultSet rs = st.executeQuery(Sql);
		
		//Below commented is also working code.
		/*if(rs.next()) {
			value = rs.getString(1);
			System.out.println(value);
		}
		
		
		//System.out.println(viewValue(connection,Sql));
		
		 ResultSetMetaData rsMetaData = rs.getMetaData();
		
		for (int i = 1; i <= 2; i++) {
            System.out.print(rsMetaData.getColumnName(i)+ "\t");
        } */
		
		System.out.println("Contents of the table");
		while (rs.next()) {
			
			//System.out.println("\n");
			
			//value = rs.getString(i);
			
			System.out.print(rs.getString("id_status") +  "\t\t" + rs.getString("TimeStamp"));
		
		}
		
	
	
		}	

	

}
