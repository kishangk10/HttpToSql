package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.InsertToMySqlDao;
import dto.InsertToMySql;

@WebServlet ("/data")
public class MClassHSql extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String s1 = req.getParameter("uid");
		int userName=Integer.parseInt(s1);
		String gmail=req.getParameter("gmail");
		String pwd = req.getParameter("pwd");
		String gender = req.getParameter("gender");
		String country = req.getParameter("country");

		InsertToMySql insertToMySql=new InsertToMySql();
		insertToMySql.setUid(userName);
		insertToMySql.setGmail(gmail);
		insertToMySql.setPwd(pwd);
		insertToMySql.setGender(gender);
		insertToMySql.setCountry(country);
		
		InsertToMySqlDao dao=new InsertToMySqlDao();
		dao.insert(insertToMySql);
	}
}
