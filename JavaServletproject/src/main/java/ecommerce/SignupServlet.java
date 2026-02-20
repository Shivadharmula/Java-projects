package ecommerce;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {

    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        setCorsHeaders(res);
        res.setStatus(HttpServletResponse.SC_OK);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        setCorsHeaders(res);
        res.setContentType("application/json");

        Gson gson = new Gson();
        BufferedReader reader = req.getReader();
        User user = gson.fromJson(reader, User.class);

        try (Connection con = DBConnection.getConnection()) {

            String sql = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getName().trim());
            ps.setString(2, user.getEmail().trim());
            ps.setString(3, user.getPassword().trim());

            int rows = ps.executeUpdate();
            if (rows > 0) {
                res.getWriter().write("{\"message\":\"Signup successful\"}");
            } else {
                res.setStatus(500);
                res.getWriter().write("{\"message\":\"Signup failed\"}");
            }

        } catch (Exception e) {
            e.printStackTrace();
            res.setStatus(500);
            res.getWriter().write("{\"message\":\"Server error\"}");
        }
    }

    private void setCorsHeaders(HttpServletResponse res) {
        res.setHeader("Access-Control-Allow-Origin", "http://localhost:3000");
        res.setHeader("Access-Control-Allow-Methods", "POST, OPTIONS");
        res.setHeader("Access-Control-Allow-Headers", "Content-Type");
        res.setHeader("Access-Control-Max-Age", "3600");
    }
}
