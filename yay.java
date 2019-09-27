//Sarah Slim

//Used this for editing
//https://www.w3schools.com/html/html_form_input_types.asp
package yay;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class yay
 */
@WebServlet("/yay")
public class yay extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Car car;
	private Predictor pred;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public yay() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Car car = new Car();
		Predictor pred = new Predictor("/yay/carTrain.DATA"); //Coudln't figure out how to open this!
		String name = request.getParameter("name");
		String pass = request.getParameter("name2");
		String responseLabel="invalid";
		String responseLabelValue = " ";
		request.setAttribute(responseLabel,responseLabelValue);
		if(request.getParameter("submit1")!=null )
		{			
			if(request.getParameter("name").equals("DoDo" )&&request.getParameter("name2").equals("password") ) {
			
			RequestDispatcher rd=request.getRequestDispatcher("/welcome.jsp");
			rd.forward(request,response);  //forwarded to welcome.jsp
			}
			else
			{
				responseLabel="invalid";
				responseLabelValue = "*Invalid username or password";
				request.setAttribute(responseLabel,responseLabelValue);
				RequestDispatcher rd=request.getRequestDispatcher("/NewFile.jsp");
				rd.forward(request,response);
			}
		}
		
		if(request.getParameter("Button")!=null )
		{	
			String prclass = "";
			double price = 0.0;
			car.setBuying(request.getParameter("buy"));
			car.setMaint(request.getParameter("maint"));
			car.setDoors(Integer.parseInt(request.getParameter("door")));
			car.setPersons(Integer.parseInt(request.getParameter("people")));
			car.setTrunk(request.getParameter("trunk"));
			car.setSafety(request.getParameter("safe"));
			
			try {
		         price = Double.parseDouble(request.getParameter("money"));
			}
			catch(Exception e) {
				responseLabel="invalid";
				responseLabelValue = "*Invalid Entry";
				request.setAttribute(responseLabel,responseLabelValue);
				RequestDispatcher rd=request.getRequestDispatcher("/welcome.jsp");
				rd.forward(request,response);
				return;
			}
			if(pred.getPrediction(car).equals("unacc")){
				price = price*0.18;
				prclass = "Unacceptable";
			}
			else if(pred.getPrediction(car).equals("acc")){
				price = price*0.36;
				prclass = "Acceptable";
			}
			else if(pred.getPrediction(car).equals("good")){
				price = price*0.54;
				prclass = "Good";
			}
			else {
				prclass = "Very Good";
				price = price*0.72;
			}
			
			DecimalFormat df = new DecimalFormat("#.##");  //https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
			price = Double.valueOf(df.format(price));
			
			request.setAttribute("money",Double.toString(price));
			request.setAttribute("class", prclass);		
			RequestDispatcher rd=request.getRequestDispatcher("/Final.jsp");
			rd.forward(request,response);  //forwarded to welcome.jsp
			}
		
		if(request.getParameter("submit3")!=null ) {
			RequestDispatcher rd=request.getRequestDispatcher("/NewFile.jsp");
			rd.forward(request,response); }
		
		if(request.getParameter("submit2")!=null ) {
			RequestDispatcher rd=request.getRequestDispatcher("/welcome.jsp");
			rd.forward(request,response); }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
