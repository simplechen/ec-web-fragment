package com.ecarinfo.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginLayoutController {
	@RequestMapping("/index")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse arg1) throws Exception {
		String tpl_file ="META-INF/modules/login/index";
		if(!StringUtils.isEmpty(request.getParameter("tpl")) && request.getParameter("tpl").equals("parent")){
			tpl_file="META-INF/modules/login2/index";
		}
		
//		PathMatchingResourcePatternResolver resolover = new PathMatchingResourcePatternResolver();
//
//		try
//		{
//			Resource[] resources = null;
////			resources = resolover
////					.getResources("file:E:/information/personal/workspace/poc/synchrophy/framework/src/test/synchrophy/com/sunvalley/framework/test/configuration/init*.properties");
////			System.out.println(resources.length);
////			resources = resolover
////					.getResources("classpath*:/com/**/Driver.class");
////			System.out.println(resources.length);
////			resources = resolover
////					.getResources("classpath*:/META-INF/*.schemas");
////			System.out.println(resources[0].getURL());
////			resources = resolover
////					.getResources("classpath*:com/synchrophy/**/*ui.properties");
////			System.out.println(resources.length);
//			resources = resolover.getResources("classpath*:/META-INF/resources/velocity/*");
//			System.err.println("resources.length:"+resources.length);
//			for (Resource resource : resources) {	
//				System.err.println(resource.getURL());
//			}
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		String tpl_file ="META-INF/modules/login/index";
//		tpl_file= "META-INF/resources/velocity/login";
//		tpl_file= "com/ecarinfo/login";
		
		
		return new ModelAndView(tpl_file,"uname","simple-chen-login");
    }
}