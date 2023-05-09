package com.example.lll;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.*;
import POJO.*;
import Model.*;


@WebServlet("/AddingServlet")
public class AddingServlet extends HttpServlet {
    Model dataModel = new Model();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/take.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String filePath = "C:\\Users\\denis\\IdeaProjects\\LLL\\src\\main\\webapp\\csv\\data.csv";
        String data = request.getParameter("data");
        System.out.println(data);
        Gson gson = new Gson();
        User gfg = gson.fromJson(data, User.class);
        System.out.println(gfg.name);
        String[] row = {gfg.name, gfg.lastname, gfg.middlename, gfg.age, gfg.language};
        dataModel.addData(row);
        dataModel.writeToCSV(filePath);

        //String row = gfg.name + "," + gfg.lastname + "," + gfg.middlename + "," + Integer.toString(gfg.age) + "," + gfg.language;
        //String filePath = "C:\\Users\\denis\\IdeaProjects\\LLL\\src\\main\\webapp\\csv\\data.csv";
    }
}