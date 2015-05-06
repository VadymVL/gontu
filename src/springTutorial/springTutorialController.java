package springTutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class springTutorialController {

	@RequestMapping("/welcome/{user}")
	public ModelAndView hello(@PathVariable("user") String user) {
		ModelAndView model = new ModelAndView("helloWorld");
		model.addObject("message","HE MAKARENA, " + user);
		return model;
	}
	
	@RequestMapping("/farewell/{user}")
	public ModelAndView bye(@PathVariable("user") String userName) {
		ModelAndView model = new ModelAndView("byeUser");
		model.addObject("message","ComeAGAIN, "+userName);
		return model;
	}	
}
