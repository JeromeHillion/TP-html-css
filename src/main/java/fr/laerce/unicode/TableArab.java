package fr.laerce.unicode;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class TableArab extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Integer> indexAsciiArab = new ArrayList();
        for(int iArab = 1536; iArab <= 1776; iArab++){
            indexAsciiArab.add(iArab);
        }

        /*============pour les besoins de la vue============*/
        request.setAttribute("indexAsciiArab" , indexAsciiArab);
        String laVue = "table-unicode-arabe.jsp";
        getServletConfig().getServletContext()
                .getRequestDispatcher("/WEB-INF/jsp/"+laVue).forward(request, response);

    }
    }

