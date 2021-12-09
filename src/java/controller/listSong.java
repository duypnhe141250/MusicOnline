/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.SongDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Song;

/**
 *
 * @author Administrator
 */
public class listSong extends HttpServlet {

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
            out.println("<title>Servlet listSong</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet listSong at " + request.getContextPath() + "</h1>");
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
        List<Song> list = new ArrayList<Song>();
        list=songDAO.getAllSong();
        
        int size = list.size();
        int numberPage =4;
        
        int numPage=size/numberPage+(size%numberPage==0?0:1);
        String spage = request.getParameter("page");
        int page;
        if(spage==null){
            page=1;
        }else{
            page=Integer.parseInt(spage);
        }
        int start,end;
        start =(page-1)*numberPage;
        end=Math.min(size, page*numberPage);
        List<Song> arr = songDAO.getSongByPage(list, start, end);
        
        HttpSession session= request.getSession();
        String  user= (String) session.getAttribute("u");
        Account acc = (Account) session.getAttribute("vip");
        request.setAttribute("num", numPage);
        request.setAttribute("listSong", arr);
        request.setAttribute("page", page);
        request.getRequestDispatcher("song.jsp").forward(request, response);
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
        processRequest(request, response);
        
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
