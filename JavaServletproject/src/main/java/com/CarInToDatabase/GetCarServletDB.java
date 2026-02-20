package com.CarInToDatabase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetCarServletDB")
public class GetCarServletDB extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String carId = request.getParameter("carId");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo", "root", "Root");

            String query;
            PreparedStatement ps;

            if (carId != null && !carId.isEmpty()) {
                query = "SELECT * FROM Cars WHERE carId = ?";
                ps = con.prepareStatement(query);
                ps.setInt(1, Integer.parseInt(carId));
            } else {
                query = "SELECT * FROM Cars";
                ps = con.prepareStatement(query);
            }

            ResultSet rs = ps.executeQuery();

            out.println("<html><head>");
            out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css' rel='stylesheet'>");
            out.println("<title>Car Details</title></head><body>");
            out.println("<div class='container mt-5'>");
            out.println("<h2 class='text-center mb-4'>Car Details</h2>");
            out.println("<table class='table table-striped table-bordered'>");
            out.println("<thead class='table-dark'><tr>");
            out.println("<th>ID</th><th>Car Name</th><th>Brand</th><th>Year</th><th>Fuel Type</th><th>Transmission</th><th>Capacity (cc)</th><th>Price ($)</th><th>Color</th>");
            out.println("</tr></thead><tbody>");

            boolean hasData = false;
            while (rs.next()) {
                hasData = true;
                out.println("<tr>");
                out.println("<td>" + rs.getInt("carId") + "</td>");
                out.println("<td>" + rs.getString("carName") + "</td>");
                out.println("<td>" + rs.getString("brand") + "</td>");
                out.println("<td>" + rs.getInt("yearOfManufacture") + "</td>");
                out.println("<td>" + rs.getString("fuelType") + "</td>");
                out.println("<td>" + rs.getString("transmissionType") + "</td>");
                out.println("<td>" + rs.getInt("engineCapacity") + "</td>");
                out.println("<td>" + rs.getDouble("price") + "</td>");
                out.println("<td>" + rs.getString("color") + "</td>");
                out.println("</tr>");
            }

            if (!hasData) {
                out.println("<tr><td colspan='9' class='text-center text-warning'>No car found with the given ID.</td></tr>");
            }

            out.println("</tbody></table>");
            out.println("<button onclick=\"location.href='CarDetailsForm.html'\" class='btn btn-primary mt-3'>Add Another Car</button>");
            out.println("</div></body></html>");

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            out.println("<h3 class='text-danger text-center'>Database Error!</h3>");
            e.printStackTrace(out);
        }
    }
}
