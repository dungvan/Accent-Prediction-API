package accent.servelet;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import accent.prediction.AccentPredictor;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class controller
 */
@WebServlet("/")
public class Controller extends HttpServlet {
	static AccentPredictor ap;
	
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append(new File("").getAbsolutePath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (ap.equals(null)) {
		    ap = new AccentPredictor();
		}
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF8");
		response.setContentType("application/json");
		StringBuilder buffer = new StringBuilder();
	    BufferedReader reader = request.getReader();
	    String line;
	    while ((line = reader.readLine()) != null) {
	        buffer.append(line);
	    }
	    String data = buffer.toString();
	    String resData = ap.predictAccents(data);
	    resData = "\"" + resData + "\"";
		response.getWriter().write(resData);
	}

}
