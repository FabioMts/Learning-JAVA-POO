package app;

import db.DB;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();

            /*
            st = conn.prepareStatement(

                "INSERT INTO seller " +
                        "(Name, Email, Birthdate, BaseSalary, DepartmentId) " +
                        "VALUES" +
                        "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

                st.setString(1, "Carl Purple");
                st.setString(2, "carl@gmail.com");
                st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
                st.setDouble(4, 3000.00);
                st.setInt(5, 4);

             */

            st = conn.prepareStatement(
                    "insert into department (Name) values ('D1'), ('D2')",
                        Statement.RETURN_GENERATED_KEYS);

                int rowsAffected = st.executeUpdate();

                if(rowsAffected > 0) {
                    ResultSet rs = st.getGeneratedKeys();
                    while (rs.next()) {
                        int id = rs.getInt(1);
                        System.out.println("Done! ID = " + id);
                    }
                }
                else {
                    System.out.println("No rown affected!");
                }


        }
        catch(SQLException e) {
            e.printStackTrace();
        }
//        catch(ParseException e) {
//            e.printStackTrace();
//        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }


    }


}
