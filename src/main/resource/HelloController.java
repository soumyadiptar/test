package resource;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.WebApplicationContextUtils;

import resource.com.model.Circle;
import resource.com.model.Employee;

@RestController
//@RequestMapping("/helloworld")
public class HelloController {

	
	   @RequestMapping(value="/hello1.htm",method = RequestMethod.GET)
	   public String printHello(ModelMap model) {
		   System.out.println("Working");
		 //  HttpSession session = sessionEvent.getSession();

	         /* ApplicationContext ctx =
	                WebApplicationContextUtils.
	                      getWebApplicationContext(session.getServletContext());
	          Circle circle =  (Circle)ctx.getBean("Circle");
	          System.out.println("test"+ circle);*/

	      model.addAttribute("message", "Hello Spring MVC Framework!");

	      return "hello";
	   }
	   
	   @RequestMapping(value="/hello.htm",method = RequestMethod.GET, headers = "Accept=application/json", produces={"application/json"})
	   public String employeeInJSON(){
		   System.out.println("BBB");
		   Employee e = new Employee();
		   e.setName("abc");
		   e.setEmail("Test");
		   System.out.println("AAAA");
		   return toJSON(e);
		   
  
	   }
	   
	   public static String toJSON(Object object) 
	    { 
	        if ( object == null ){
	        return "{}"; 
	        } 
	        try { 
	           ObjectMapper mapper = new ObjectMapper(); 
	           return mapper.writeValueAsString(object); 
	           } 
	        catch (Exception e) { 
	         e.printStackTrace(); 
	        } 
	      return "{}"; 
	      } 

}
