package skyglide.classes;

import java.sql.*;

public class DataBase {
    private Connection conn;

    public DataBase(){
        try{
            this.conn = DriverManager.getConnection("jdbc:sqlite:skyglide.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public ResultSet getUserData(String name, String password){
        ResultSet result = null;
        try (PreparedStatement statement = conn.prepareStatement("SELECT * FROM user WHERE user_name = ? AND password = ?")) {
            statement.setString(1, name);
            statement.setString(2, password);
            result = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
