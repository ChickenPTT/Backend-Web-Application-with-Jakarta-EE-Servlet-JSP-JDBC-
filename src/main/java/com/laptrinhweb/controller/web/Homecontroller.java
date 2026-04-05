package com.laptrinhweb.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.laptrinhjavaweb.model.Usermodel;
import com.laptrinhjavaweb.utils.FormUtil;
import com.laptrinhjavaweb.utils.HttpUtils;
import com.laptrinhweb.dao.IUserDAO;
import com.laptrinhweb.model.NewsModel;
import com.laptrinhweb.model.UserModel;
import com.laptrinhweb.service.INewService;
import com.laptrinhweb.service.IUserService;

@WebServlet(urlPatterns = { "/trang-chu", "/dang-nhap" })
public class Homecontroller extends HttpServlet {
	@Inject
	INewService newService;
	private IUserService userService;
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null && action.equals("login")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
			rd.forward(request, response);
		} else if(action != null && action.equals("logout")) {
			
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null && action.equals("login")) {
			UserModel model = FormUtil.toModel(UserModel.class, request);
			model = userService.findByUsernameAndPasswordAndStatus(model.getUsername(), model.getPasswork(), 1);
			if(model != null ) {
				if (model.getRole().getCode().equals("USER")) {
					response.sendRedirect(request.getContextPath() + "/trang-chu");
				}else if(model.getRole().getCode().equals("ADMIN")) {
					response.sendRedirect(request.getContextPath() + "/admin-home");
				}
			}else {
				response.sendRedirect(request.getContextPath() + "/dang-nhap?action=login");
				
			}
		}
	}
}