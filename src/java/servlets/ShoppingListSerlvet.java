
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import models.Item;
import services.ItemService;
public class ShoppingListSerlvet extends HttpServlet {





    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            HttpSession session = request.getSession();
            String username = request.getParameter("username");
            String logout = request.getParameter("logout");
             if (username != null && !username.equals("")) {
                 session.setAttribute("username", username);
                 getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
            return;
            }
             
            if (logout != null) {
            session.invalidate();
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
            }
            
            
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        }
        
    
    
    
    private void displayShoppingList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
            HttpSession session = request.getSession();
            String logout = request.getParameter("logout");
            String addNewItem = request.getParameter("addNewItem");
            /*boolean isNewSession = false;
            //isNewSession = (boolean) session.getAttribute("isNewSession");
            if(isNewSession){
                ItemService itemsList = new ItemService();
                session.setAttribute("isNewSession", false);
            }else{
              ItemService itemsList = (ItemService)session.getAttribute("itemsList");
            }*/
            ItemService itemsList = (ItemService)session.getAttribute("itemsList");
            
             if (addNewItem != null && !addNewItem.equals("")) {
                 Item userItem = new Item(addNewItem);
                 
                 itemsList.addItem(userItem);
                 session.setAttribute("itemsList", itemsList);
            }
            if (logout != null) {
            session.invalidate();
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
            }
        
        getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            displayShoppingList(request, response);
    }

}
