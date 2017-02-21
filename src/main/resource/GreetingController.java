package resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import resource.com.model.Greetings;

@RestController
@RequestMapping("/restcontroller")
public class GreetingController {
	
	@RequestMapping("/greeting.htm")
	public Greetings sayHello(@RequestParam(value="name",defaultValue="world") String name) {
		System.out.println("here");
		return new Greetings("1","Soumya");
		
	}
	
	

}
