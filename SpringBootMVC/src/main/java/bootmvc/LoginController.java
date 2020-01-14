package bootmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginForm(){
		return "Login";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView loginValidation(@ModelAttribute("Login") Login login){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Welcome");
		mav.addObject(login);
		return mav;
	}
}
