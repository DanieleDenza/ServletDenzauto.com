package it.daniele;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servletlogin extends HttpServlet{



	private static final long serialVersionUID = 1L;

	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
		
		
		
        Writer w = resp.getWriter();
        /*
        w.write("<html><head><title>denzadaniele</title></head><body><form name=\"loginForm\" method=\"post\" action=\"log\">\r\n\""
        	  		+ "    Username: <input type=\"text\" name=\"username\"/> <br/>\r\n\""
        	 		+ "    Password: <input type=\"password\" name=\"password\"/> <br/>\r\n\""
        	 		+ "    <input type=\"submit\" value=\"Login\" />\r\n\"");
		}
	
	*/
        w.write("<html>\r\n"
        		+ "<head>\r\n"
        		+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
        		+ "<style>\r\n"
        		+ "body {font-family: Arial, Helvetica, sans-serif;}\r\n"
        		+ "form {border: 3px solid #f1f1f1;}\r\n"
        		+ "\r\n"
        		+ "input[type=text], input[type=password] {\r\n"
        		+ "  width: 100%;\r\n"
        		+ "  padding: 12px 20px;\r\n"
        		+ "  margin: 8px 0;\r\n"
        		+ "  display: inline-block;\r\n"
        		+ "  border: 1px solid #ccc;\r\n"
        		+ "  box-sizing: border-box;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "button {\r\n"
        		+ "  background-color: black;\r\n"
        		+ "  color: white;\r\n"
        		+ "  padding: 14px 20px;\r\n"
        		+ "  margin: 8px 0;\r\n"
        		+ "  border: none;\r\n"
        		+ "  cursor: pointer;\r\n"
        		+ "  width: 100%;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "button:hover {\r\n"
        		+ "  opacity: 0.8;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".cancelbtn {\r\n"
        		+ "  width: auto;\r\n"
        		+ "  padding: 10px 18px;\r\n"
        		+ "  background-color: #f44336;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".imgcontainer {\r\n"
        		+ "  text-align: center;\r\n"
        		+ "  margin: 24px 0 12px 0;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "img.avatar {\r\n"
        		+ "  width: 40%;\r\n"
        		+ "  border-radius: 50%;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".container {\r\n"
        		+ "  padding: 16px;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "span.psw {\r\n"
        		+ "  float: right;\r\n"
        		+ "  padding-top: 16px;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "/* Change styles for span and cancel button on extra small screens */\r\n"
        		+ "@media screen and (max-width: 300px) {\r\n"
        		+ "  span.psw {\r\n"
        		+ "     display: block;\r\n"
        		+ "     float: none;\r\n"
        		+ "  }\r\n"
        		+ "  .cancelbtn {\r\n"
        		+ "     width: 100%;\r\n"
        		+ "  }\r\n"
        		+ "}\r\n"
        		+ "</style>\r\n"
        		+ "</head>\r\n"
        		+ "<body>\r\n"
        		+ "\r\n"
        		+ "<h2 align=center>PAGINA DI LOGIN</h2>\r\n"
        		+ "\r\n"
        		+ "<form action=\"/log\" method=\"post\">\r\n"
        		+ "  <div class=\"imgcontainer\">\r\n"
        		+ "  </div>\r\n"
        		+ "\r\n"
        		+ "  <div class=\"container\">\r\n"
        		+ "    <label for=\"username\"><b>Username</b></label>\r\n"
        		+ "    <input type=\"text\" placeholder=\"inserisci Username\" name=\"username\" required>\r\n"
        		+ "\r\n"
        		+ "    <label for=\"password\"><b>Password</b></label>\r\n"
        		+ "    <input type=\"password\" placeholder=\"inserisci Password\" name=\"password\" required>\r\n"
        		+ "        \r\n"
        		+ "    <button type=\"submit\">Login</button>\r\n"
        		+ "    <label>\r\n"
        		+ "      <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Ricordati di me \r\n"
        		+ "    </label>\r\n"
        		+ "  </div>\r\n"
        		+ "\r\n"
        		+ "  <div class=\"container\" style=\"background-color:#f1f1f1\">\r\n"
        		+ "    <a href><button type=\"button\" class=\"reset\">Rimuovi dati</button>\r\n"
        		+ "    <span class=\"psw\"><a href=\"http://localhost:8080/pippo#\">TORNA ALLA HOME</a></span>\r\n"
        		+ "  </div>\r\n"
        		+ "</form>\r\n"
        		+ "\r\n"
        		+ "</body>\r\n"
        		+ "</html>\r\n"
        		+ "");
	}
}
