package com.laptrinhweb.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.laptrinhjavaweb.utils.HttpUtils;
import com.laptrinhweb.model.NewsModel;
import com.laptrinhweb.service.INewService;

@WebServlet(urlPatterns = {"/api-admin-news"})
public class NewAPI extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject INewService newService;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=UTF-8");
		NewsModel newModel = HttpUtils.of(request.getReader()).toModel(NewsModel.class);
		newModel = newService.save(newModel);
		mapper.writeValue(response.getOutputStream(), newModel);

	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=UTF-8");
		NewsModel updateNews = HttpUtils.of(request.getReader()).toModel(NewsModel.class);
		updateNews = newService.update(updateNews);
		mapper.writeValue(response.getOutputStream(), updateNews);
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=UTF-8");
		NewsModel newModel = HttpUtils.of(request.getReader()).toModel(NewsModel.class);
		newService.delete(newModel.getIds());
		mapper.writeValue(response.getOutputStream(), "{}");
	}
	
	
}
