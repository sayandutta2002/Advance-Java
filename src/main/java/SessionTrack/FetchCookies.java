package SessionTrack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fetch")
public class FetchCookies extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		for(int i =0;i<cookies.length;i++) {
			Cookie c = cookies[i];
			System.out.println("key:"+ c.getName());
			System.out.println("value :"+c.getValue());
			
		}
	
	}
}
