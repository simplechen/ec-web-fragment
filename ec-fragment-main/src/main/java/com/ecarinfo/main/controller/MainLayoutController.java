package com.ecarinfo.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class MainLayoutController {
	@RequestMapping("/index")
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {

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
//			
//			resources = resolover.getResources("classpath*:/META-INF/resources/velocity/*.vm");
//			System.out.println(resources.length+"; "+resources[0].getURL());
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		return new ModelAndView("main/index", "uname", "simple-chen");
	}
}