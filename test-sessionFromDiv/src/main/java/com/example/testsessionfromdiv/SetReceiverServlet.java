package com.example.testsessionfromdiv;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/setReceiver")
public class SetReceiverServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String receiverName = request.getParameter("receiver");

        HttpSession session = request.getSession();
        session.setAttribute("receiver", receiverName);

    }
}