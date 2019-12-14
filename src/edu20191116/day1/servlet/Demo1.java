package edu20191116.day1.servlet;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo1 extends HttpServlet {
//  shixian servlet接口
//	继承Genericervlet 实现service
//	继承HTTP Servlet 复写doGet doPost

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		OutputStream ops = resp.getOutputStream();
//		Integer num = Integer.valueOf(req.getParameter("num"));
//		String result = IsOddOrEven(num);
//		ops.write(result.getBytes());
//		重定项
//		resp.sendRedirect("jsp/check.jsp");
		req.getRequestDispatcher("jsp/check.jsp").forward(req, resp);

//		ops.write(("Hello world" + req.getRequestURI().toString()).getBytes());
//		ops.write(req.getRequestURI().getBytes());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer num = Integer.valueOf(req.getParameter("num"));
		System.out.println(num);
		req.setAttribute("num", num);
		req.setAttribute("result", IsOddOrEven(num));
		doGet(req, resp);

	}

	private String IsOddOrEven(Integer num) {
		String result = null;
		if (num % 2 != 0) {
			result = num + ":odd";
		} else {
			result = num + ":even";
		}
		return result;
	}

}
