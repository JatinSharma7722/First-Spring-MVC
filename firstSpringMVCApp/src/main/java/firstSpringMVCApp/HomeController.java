package firstSpringMVCApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui,Model; 



@Controller
public class HomeController {
@RequestMapping(value = "/", method = RequestMethod.GET)
public String home() {
return "hello";
}

@RequestMapping(value = "displayName")
public String displayName(@RequestParam("firstName") String name,Model model ,HttpServletRequest request) {
	String name = request.getParameter("firstName");
	request.setAttribute("firstName", name);
	return "displayName";
}
}