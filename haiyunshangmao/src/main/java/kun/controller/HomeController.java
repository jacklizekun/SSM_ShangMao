package kun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	//系统首页
	@RequestMapping(value = {"/","/home"})
	public String login() {
		return "/index.jsp";
	}
	@RequestMapping(value="/fmain")
	public String fmain(){
		return "/home/fmain.jsp";
	}
	
	@RequestMapping(value="/title")
	public String title(){
		return "/home/title.jsp";
	}
	
	@RequestMapping(value="/left")
	public String left(){
		return "/home/left.jsp";
	}
	
	@RequestMapping(value="/main")
	public String main(){
		return "/home/olmsgList.jsp";			//首页转向留言板
	}
	//基础信息模块
	
		@RequestMapping("/baseinfoMain")
		public String baseinfoMain(){
			return "/baseinfo/main.jsp";
		}
		
		@RequestMapping("/baseinfoLeft")
		public String baseinfoLeft(){
			return "/baseinfo/left.jsp";
		}
		
		//货运管理模块
		
		@RequestMapping("/cargoMain")
		public String cargoMain(){
			return "/cargo/main.jsp";
		}
		
		@RequestMapping("/cargoLeft")
		public String cargoLeft(){
			return "/cargo/left.jsp";
		}
}
