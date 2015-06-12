package demo.proj.orm;

import java.io.IOException;

import javax.annotation.Resource;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo.proj.orm.dao.TeacherMapper;
import demo.proj.orm.model.Teacher;
import demo.proj.orm.model.TeacherExample;
import demo.proj.orm.modelEx.TeacherEx;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class TestTeacher {
	
	@Resource
	private TeacherMapper teacherMapper;
	
	@Test
	public void testSelectAll() throws JsonGenerationException, JsonMappingException, IOException {
		for (Teacher t : teacherMapper.selectByExample(new TeacherExample())) {
			System.out.println(new ObjectMapper().writeValueAsString(t));
		}
	}

	@Test
	public void testSelectById() throws JsonGenerationException, JsonMappingException, IOException {
		TeacherEx te = teacherMapper.selectById(2);
		System.out.println(new ObjectMapper().writeValueAsString(te));
	}

}
