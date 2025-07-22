package Application;

import db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program_2 {
    public static void main(String[] args) {

        try (Connection conn = DB.getConnection(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery("select * from seller")) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
