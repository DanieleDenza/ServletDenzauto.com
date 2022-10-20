package it.daniele;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {

	public static void main(String[] args) {

        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8080);

        Context ctx = tomcat.addContext("/pippo", new File(".").getAbsolutePath());
        Context ctx1 = tomcat.addContext("/home", new File(".").getAbsolutePath());
        Context ctx2 = tomcat.addContext("/log", new File(".").getAbsolutePath());
        
        PrimaServlet primaServlet = new PrimaServlet();
        
        SecondaServlet secondaservlet= new SecondaServlet();
        Servletlogin servletlogin = new Servletlogin();
        
        
        
        Tomcat.addServlet(ctx, "pippo", primaServlet);
        Tomcat.addServlet(ctx1, "home",servletlogin);
        Tomcat.addServlet(ctx2, "log",  secondaservlet);
        
        
        ctx.addServletMapping("/*", "pippo");
        ctx1.addServletMapping("/*", "home");
        ctx2.addServletMapping("/*", "log");
        try {
			tomcat.start();
		} catch (LifecycleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        tomcat.getServer().await();
	}

}
