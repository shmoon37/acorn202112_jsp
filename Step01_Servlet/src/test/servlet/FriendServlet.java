package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/friend/list")
public class FriendServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> list=new ArrayList<String>();
		list.add("차은우");
		list.add("펭귄");
		list.add("강동원");
		list.add("알파카");
		list.add("벚꽃");
		
		//응답 인코딩 설정
		resp.setCharacterEncoding("utf-8");
		//응답 컨텐츠 type 설정(웹브라우저에게 html 형식의 문자열을 응답할 
		resp.setContentType("text/html; charset=utf-8");
		//html 형식의 문자열 응답하기
		PrintWriter pw = resp.getWriter();
		pw.println("<!doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'>");
		pw.println("<title></title>");
		pw.println("</head>");
		pw.println("<body>");
		//친구 이름 목록을 for 문을 활용해서 클라이언트 웹브라우저에 출력해보세요.
		pw.println("<h1>친구 이름 목록입니다</h1>");
		pw.println("<ul>");
		for(int i=0;i<list.size();i++) {
			pw.println("<li>"+list.get(i)+"</li>");
		}
		pw.println("</ul>");
		
		//확장 for문을 활용하면
		pw.println("<ul>");
		
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
}
