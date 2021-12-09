/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CategoryDAO;
import dal.SongDAO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.Category;
import model.Song;

/**
 *
 * @author Administrator
 */
public class AddServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        SongDAO songDAO = new SongDAO();
        CategoryDAO cateDAO = new CategoryDAO();
        List<Song> list = new ArrayList<>();
        List<Category> listCate = new ArrayList<>();
        list = songDAO.getAllSong();
        listCate = cateDAO.getAllCategory();

        request.setAttribute("listCate", listCate);
        request.setAttribute("list", list);
        request.getRequestDispatcher("add.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String songName = request.getParameter("name");
        String album = request.getParameter("album");
        String cateID = request.getParameter("cateID");
        String photo = request.getParameter("image");

        String mp3 = request.getParameter("source");
        String source = "audio/" + mp3;
        String image = "img/album" + photo;

        SongDAO songDAO = new SongDAO();
        CategoryDAO cateDAO = new CategoryDAO();
        List<Song> list = new ArrayList<Song>();
        List<Category> listCate = new ArrayList<Category>();
        list = songDAO.getAllSong();
        listCate = cateDAO.getAllCategory();

        int a = songDAO.addSong(new Song(songName, 1, cateID, album, image, source));
        if (source.endsWith("jpg") || image.endsWith("mp3")) {
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Add failed" + source + "</h1>");
                out.println("</body>");
                out.println("</html>");
            }
        }
        if (a == 0) {

            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Add failed" + source + "</h1>");
                out.println("</body>");
                out.println("</html>");
            }

        } else {
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Add success</h1>");
                out.println("</body>");
                out.println("</html>");
            }
        }
        request.setAttribute("listCate", listCate);
        request.setAttribute("list", list);

        request.getRequestDispatcher("add.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
