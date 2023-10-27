package br.com.bruKorczak;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "AcelerarMoto", urlPatterns = {"/moto"})
public class AcelerarMoto extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("/moto.jsp");
        dispatcher.forward(request, response);
    }
}
