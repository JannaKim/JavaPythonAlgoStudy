package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hi")
// annotation을 통한 mapping 정보
public class Nana extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		PrintWriter out = resp.getWriter();
		out.println("Hello");
	}
}
