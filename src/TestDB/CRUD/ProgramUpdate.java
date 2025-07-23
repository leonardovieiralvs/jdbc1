package TestDB.CRUD;

import TestDB.DbConnection;
import TestDB.ExceptionTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProgramUpdate {

    public static void updateMySql() {
        String sql = "UPDATE seller SET BaseSalary = BaseSalary + ? WHERE departmentId = ?";

        try (Connection conn = DbConnection.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setInt(1, 1000);
            pst.setInt(2, 1);
            pst.execute();

        } catch (SQLException e) {
            throw new ExceptionTest(e. getMessage());
        }
    }

}
