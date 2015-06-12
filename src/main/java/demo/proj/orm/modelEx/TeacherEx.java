package demo.proj.orm.modelEx;

import java.util.List;

import demo.proj.orm.model.Student;
import demo.proj.orm.model.Teacher;

/**
 * 教师扩展对象
 * 
 * @author shiying
 *
 */
public class TeacherEx extends Teacher {
	private static final long serialVersionUID = -1168640098608451689L;
	
	private List<Student> students;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	
}
