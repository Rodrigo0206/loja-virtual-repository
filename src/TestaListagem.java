import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();

		
		Statement stm = connection.createStatement();
		stm.execute("SELECT ID, NOME, DESCRICACAO FROM PRODUTO");

		ResultSet rst = stm.getResultSet();

		while (rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println(id);
			String nome = rst.getString("NOME");
			System.out.println(nome);
			String descricao = rst.getString("DESCRICACAO");
			System.out.println(descricao);
		}
		connection.close();

	}

	private static ConnectionFactory CriaConexao() {
		// TODO Auto-generated method stub
		return null;
	}

}
