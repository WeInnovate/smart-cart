package com.smartcart.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartcart.dao.ItemDao;
import com.smartcart.dao.ItemDaoImpl;
import com.smartcart.domain.Item;

/**
 * Servlet implementation class ItemServlet
 */
@WebServlet("/item/*")
public class ItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ItemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestUri = request.getRequestURI();
		
		if(requestUri.contains("items")){
			ItemDao itemDao = new ItemDaoImpl();
			List<Item> items = itemDao.getItems();
			request.setAttribute("items", items);
			request.getRequestDispatcher("/items.jsp").forward(request, response);
		}
		else if(requestUri.contains("ItemDtl")){
			System.out.println(request.getParameter("itemId"));
			
			ItemDao itemDao = new ItemDaoImpl();
			Item item = itemDao.getItem(request.getParameter("itemId"));
			request.setAttribute("item", item);
			request.getRequestDispatcher("/item.jsp").forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
