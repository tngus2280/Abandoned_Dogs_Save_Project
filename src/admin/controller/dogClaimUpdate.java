package admin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.service.face.AdminMemberListService;
import admin.service.impl.AdminMemberListServiceImpl;
import java.util.*;

@WebServlet("/admin/claimUpdate")
public class dogClaimUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdminMemberListService adminMemberListService = new AdminMemberListServiceImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String useridArr=req.getParameter("userid");
		
		String []userid=useridArr.split(",");		
		List<String> id = new ArrayList<>();
		
		for(String e:userid) {
			id.add(e);
		}
		req.setAttribute("userid", id);
		req.setAttribute("idCount", id.size());
		
		req.getRequestDispatcher("/resources/js/dogClaimpage.jsp").forward(req, resp);
	
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String[]arr=req.getParameterValues("member_chk[]"); 	
		//Strint e = 아이디
		for(String e: arr) {
			//하나씩 입양신청 처리(허가)		
			String userid;
			
		}		
	
	
	
	}

}
