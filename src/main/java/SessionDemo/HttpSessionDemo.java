package SessionDemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/batch")
public class HttpSessionDemo extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession hs = req.getSession();//create the object of implementing class of httpsession.
	HttpSession hs1 = req.getSession();//both reference are indicate same object.
	hs.setAttribute("A2", "fantastic");
	System.out.println(hs1.getAttribute("A2"));//fantastic
	System.out.println(hs.getAttribute("A2"));
	System.out.println(hs.getAttribute("A1"));//null
	hs.invalidate();
	System.out.println(hs1.getAttribute("A2"));
}
}
