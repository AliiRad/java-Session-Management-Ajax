package com.example.testsessionfromdiv;

/*
 + Created By AliRad
 + Time   : 12/4/2023 AT 12:12 AM
 + Github : https://github.com/AliiRad
*/

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet(urlPatterns = "/getReceiver")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        System.out.println(session.getAttribute("receiver"));
    }
}
