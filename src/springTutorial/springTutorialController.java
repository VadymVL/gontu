package springTutorial;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class springTutorialController {

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		model.addObject("time", Calendar.getInstance().getTime().toString());
		model.addObject("osname", System.getProperty("os.name"));
		model.addObject("osver", System.getProperty("os.version"));
		model.addObject("osarch", System.getProperty("os.arch"));
		return model;
	}
	
	@RequestMapping(value="/welcome", method = RequestMethod.POST)
	public ModelAndView hello(@RequestParam("name") String name, @RequestParam("password") String password) {
		ModelAndView model = new ModelAndView("helloUser");
		model.addObject("name", name);
		model.addObject("password", password);
		return model;
	}
	
	@RequestMapping(value="/create"/*, method = RequestMethod.POST*/)
	public ModelAndView bye() {
		ModelAndView model = new ModelAndView("createUser");
		model.addObject("message","You are creating new user.");
		return model;
	}	
}
