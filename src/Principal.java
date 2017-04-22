
import java.sql.Connection;
import java.sql.SQLException;

import hackateen.dao.ConnectionFactory;

public class Principal {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = ConnectionFactory.getConnection();
		
		System.out.println("Conectado!");
	 
    }
}

