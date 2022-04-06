package app;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try {

            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "UPDATE seller " +
                            "SET BaseSalary = BaseSalary + ? " +
                            "WHERE " +
                            "(DepartmentId = ?)");

            st.setDouble(1, 200.00);
            st.setInt(2, 2);

            int rowsAffected = st.executeUpdate();

            System.out.println("DONE! Rows Affected: " + rowsAffected);

        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }


}
