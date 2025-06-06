package com.ohgiraffers.chap09eljstllecturesource.el.controller;

import com.ohgiraffers.chap09eljstllecturesource.el.model.dto.MemberDTO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/test4")
public class TestFourServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MemberDTO sesstionMember = new MemberDTO("홍길동", 19, "010-1234-5678", "gildong@ohgiraffers.com");
        MemberDTO requestMember = new MemberDTO("유관순", 14, "010-1234-5578", "yu@ohgiraffers.com");

        HttpSession session = request.getSession();
        session.setAttribute("member", sesstionMember);
        request.setAttribute("member", requestMember);

        RequestDispatcher rd = request.getRequestDispatcher("views/el/testEl4.jsp");
        rd.forward(request, response);
    }
}