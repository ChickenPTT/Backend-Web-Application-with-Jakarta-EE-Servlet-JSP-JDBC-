package com.laptrinhweb.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.constant.SystemConstant;
import com.laptrinhjavaweb.paging.PageRequest;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.sort.Sorter;
import com.laptrinhjavaweb.utils.FormUtil;
import com.laptrinhweb.model.NewsModel;
import com.laptrinhweb.service.INewService;

@WebServlet(urlPatterns = { "/admin-new" })
public class Newcontroller extends HttpServlet {

	@Inject
	private INewService newservice;
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		NewsModel model = FormUtil.toModel(NewsModel.class, request);
		Pageble pageble = new PageRequest(model.getPage(), model.getMaxPageItem(), 
				new Sorter(model.getSortName(), model.getSortBy()));
		model.setListResult(newservice.findAll(pageble)); 
		model.setTotalItem(newservice.getTotalItem());
		model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getMaxPageItem()));
		request.setAttribute(SystemConstant.MODEL, model);
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/news/list.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
