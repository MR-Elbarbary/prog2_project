package skyglide;

import java.sql.*;

public class DataBase {
    private Connection conn;

    public DataBase(){
        try{
            this.conn = DriverManager.getConnection("skyglide.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public ResultSet getUserData(String name, String password){
        Statement statement;
        ResultSet result = null;
        try {
            statement = this.conn.createStatement();
            result = statement.executeQuery("SELECT * FROM user WHERE user_name ='"+name+"' AND password = '"+password+"';");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
