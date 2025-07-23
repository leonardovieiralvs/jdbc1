package TestDB.CRUD;


import TestDB.DbConnection;
import TestDB.ExceptionTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProgramDelete {

    public static void deleteObjectMySql(){

        String sql = "DELETE FROM seller WHERE name = ?";

        try (Connection conn = DbConnection.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, "Morpheus");
            pst.execute();

        } catch (SQLException e) {
            throw new ExceptionTest(e.getMessage());
        }
    }
}
