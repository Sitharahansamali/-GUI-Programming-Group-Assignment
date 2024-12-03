import java.sql.*;

public class SignUpHandler {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/UserDB";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Sitha2001#";

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }

    public void signUp(String name, String email, String gender, String birthday, String password) throws SQLException {
        String query = "INSERT INTO Users (name, email, gender, birthday, password) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, gender);
            stmt.setDate(4, Date.valueOf(birthday));
            stmt.setString(5, password);
            stmt.executeUpdate();
        }
    }

    public boolean signIn(String email, String password) throws SQLException {
        String query = "SELECT * FROM Users WHERE email = ? AND password = ?";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, email);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        }
    }
}
