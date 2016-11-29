package com.craft.Spring.Action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.craft.Spring.Service.UserService;
import com.craft.Spring.entity.User;

@Controller
@RequestMapping(value="/User")
public class Second {
	
	private UserService userService;
	@Resource(name="userServiceId")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value="/insert.action")
	public String insert(Model model,User user) throws Exception {
		System.out.println(user.getU_id());
		userService.UserAdd(user);
		model.addAttribute("success", "Second成功");
		model.addAttribute("user", user);
		return "/JSP/spring.jsp";
	}
}
