
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web application lifecycle listener.
 *
 * @author Mohab
 */
public class NewServletListener implements HttpSessionListener {
ServletContext ctx=null;
	static int total=0;
    @Override
    public void sessionCreated(HttpSessionEvent se) {
          total++;
	
	ctx=se.getSession().getServletContext();
	ctx.setAttribute("totalusers", total);
	    
     
    
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) { 
                            }
}
