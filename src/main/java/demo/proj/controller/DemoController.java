package demo.proj.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.proj.orm.modelEx.TeacherEx;
import demo.proj.service.DemoSearchService;

@Controller
@RequestMapping("/demo")
public class DemoController {
	
	@Resource
	private DemoSearchService demoSearchService;
	
	/**
	 * 进入首页
	 * @return
	 */
	@RequestMapping(value="/index")
	public String index(){
		return "/demo/index";
	}
	
	/**
	 * 通过ID搜索教师
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/search")
	@ResponseBody
	public Map<String, Object> search(@RequestParam Integer id) {
		Map<String, Object> data = new HashMap<String, Object>();
		TeacherEx info = demoSearchService.searchById(id);
		if (info == null) {
			data.put("state", "notfound");
		} else {
			data.put("state", "success");
			data.put("info", info);
		}
		return data;
	}

}
