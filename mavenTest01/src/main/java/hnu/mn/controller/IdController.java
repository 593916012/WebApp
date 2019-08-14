package hnu.mn.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hnu.mn.pojo.Id;
import hnu.mn.service.ShowIdService;

@Controller
public class IdController {
	@Resource
	ShowIdService showIdServiceImpl;
	
	@RequestMapping("showID")
	public String showID(HttpSession session) {
		List<Id> showList = showIdServiceImpl.showList();
		System.out.println(showList);
		if (showList!=null) {
			session.setAttribute("IDList", showList);
			return "redirect:/index.jsp";
		}
		return "redirect:/error.jsp";
	}
	
	
}
