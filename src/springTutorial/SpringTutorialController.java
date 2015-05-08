package springTutorial;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringTutorialController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		//binder.setDisallowedFields("mobileNumber"); //Exclude the field from data binding
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		binder.registerCustomEditor(Date.class, "dateOfBirth", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "name", new CustomNameEditor());
	}
	
	//mapping for the default root page
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		model.addObject("time", Calendar.getInstance().getTime().toString());
		model.addObject("osname", System.getProperty("os.name"));
		model.addObject("osver", System.getProperty("os.version"));
		model.addObject("osarch", System.getProperty("os.arch"));
		return model;
	}
	//Controller call it first, before all other mapping methods!!!
	//Common model object for the all mapping methods in this controller
	@ModelAttribute
	public void setCommonObject(Model model, Model model2, Model model3) {
		model.addAttribute("time", "Accurate time is: " + Calendar.getInstance().getTime().toString());
		model2.addAttribute("time2", "Try 2");
		model3.addAttribute("time3", "Try 3");
	}
	//mapping with path parameter
	@RequestMapping(value="/welcome/{path}")
	public ModelAndView helloAgain(@PathVariable("path") String path) {
		ModelAndView model = new ModelAndView("helloUser");
		model.addObject("path", path);
		return model;
	}
	//mapping with defined request method
	@RequestMapping(value="/welcome", method = RequestMethod.POST)
	public ModelAndView hello(@RequestParam(value="name", required = true, defaultValue="Anonymous") String name, @RequestParam("password") String password) {
		ModelAndView model = new ModelAndView("helloUser");
		model.addObject("name", name);
		model.addObject("password", password);
		return model;
	}
	
	@RequestMapping(value="/create"/*, method = RequestMethod.POST*/)
	public ModelAndView create() {
		ModelAndView model = new ModelAndView("createUser");
		model.addObject("message","You are creating a new user.");
		return model;
	}	
	
	@RequestMapping(value="/welcome/model", method = RequestMethod.POST)
	public ModelAndView hello2(@ModelAttribute("newUser") UserModel newUser, BindingResult result) {
		
		if(result.hasErrors()) {
			ModelAndView model1 = new ModelAndView("createUser");
			return model1;
		}
		
		ModelAndView model = new ModelAndView("helloUserModel");
		return model;
	}
}
