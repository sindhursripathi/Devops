package jdbc;
import java.sql.*;

public class Jdbc1 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		try
	
	{
Scanner s=new Scanner(System.in);
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		PreparedStatement ps=c.prepareStatement("insert into sindhu.dept values(?,?)");
		ps.getInt(1,s.nextInt());
		ps.setString(2,s.setString());
		int count=ps.executeUpdate();
		System.out.println(count+"rows inserted");
	}
	//rsultSet rs=s.executeQuery("select * from SINDHU.DEPT");
		/*while(rs.next())
		{
			System.out.println("deptid:"+rs.getInt(1)+""+"deptname:"+rs.getString(2));
		}
		//System.out.println(count+"rows inserted");
		
	}*/
	catch(SQLException e)
	{
		System.out.println(e);
	}
	}
}
	
