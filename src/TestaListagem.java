import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.alura.jdbc.factory.ConnectionFactory;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		connection.setAutoCommit(false);
		
		PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME, DESCRICACAO FROM PRODUTO ");
		stm.execute();

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
