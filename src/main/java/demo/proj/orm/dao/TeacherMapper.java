package demo.proj.orm.dao;

import demo.proj.orm.model.Teacher;
import demo.proj.orm.model.TeacherExample;
import demo.proj.orm.modelEx.TeacherEx;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    int countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
    
    /**
     * 根据教师ID查询教师基本信息和学生列表
     * @param id
     * @return
     */
    TeacherEx selectById(@Param("id") Integer id);
}