package demo.proj.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class PropertyAutoSetInterception implements HandlerInterceptor {
	private static final Logger log = LoggerFactory.getLogger(PropertyAutoSetInterception.class);
	

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		// basePath
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		request.setAttribute("_basePath", basePath);
		
		// 当前URL地址
		request.setAttribute("_thisUrl", request.getRequestURL().toString());
		
		// now
		request.setAttribute("_now", new Date());
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		response.addHeader("ACCEPT_REQUEST_INSTANCE", System.getProperty("tomcat.instance", "default"));
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
