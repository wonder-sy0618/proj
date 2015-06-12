package demo.proj.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import demo.proj.orm.dao.TeacherMapper;
import demo.proj.orm.modelEx.TeacherEx;

@Service
public class DemoSearchService {
	
	@Resource
	private TeacherMapper teacherMapper;
	
	/**
	 * 通过ID搜索
	 * @param id
	 * @return
	 */
	public TeacherEx searchById(Integer id) {
		if (id == null) {
			return null;
		}
		return teacherMapper.selectById(id);
	}

}
