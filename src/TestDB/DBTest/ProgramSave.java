package TestDB.DBTest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class ProgramSave {
    public static void saveNewObject(Seller seller) {

        String sql = "INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DBTest.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, seller.getName());
            pst.setString(2, seller.getEmail());
            pst.setDate(3, new Date(seller.getDate().getTime()));
            pst.setDouble(4, seller.getBaseSalary());
            pst.setInt(5, seller.getDepartmentId());
            pst.execute();
        } catch (Exception e) {
            throw new ExceptionTest(e.getMessage());
        }
    }
}
