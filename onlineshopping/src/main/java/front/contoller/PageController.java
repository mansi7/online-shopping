package front.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("Hello", "Welcome spring");
		return mv;
	}
	
//	@RequestMapping(value="/test")
//	public ModelAndView test(@RequestParam(value="Hello",required=false)String Hello)
	//{   
		//if(Hello==null)
		//{
	//		Hello="HEY THERE";
		//}
		//ModelAndView mv=new ModelAndView("page");
		//mv.addObject("Hello", Hello);
		//return mv;
//	}
	
	
	@RequestMapping(value="/test/{Hello}")
	public ModelAndView test(@PathVariable("Hello")String Hello)
	{   
		if(Hello==null)
		{
			Hello="HEY THERE";
		}
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("Hello", Hello);
		return mv;
	}

	
}
