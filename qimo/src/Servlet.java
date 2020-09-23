import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Userregistration.Userregistration;

@WebServlet("/Servlet")
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        try {
            Connection conn = Userregistration.getConn();
            String sql = "insert into yh(xm,password) values(?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            String xm = request.getParameter("xm");
            String ps = request.getParameter("password");
            pstmt.setString(1, xm);
            pstmt.setString(2, ps);
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("Userregistration.jsp");
    }
}
