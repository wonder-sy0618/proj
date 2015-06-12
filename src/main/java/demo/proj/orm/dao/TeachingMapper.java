package demo.proj.orm.dao;

import demo.proj.orm.model.TeachingExample;
import demo.proj.orm.model.TeachingKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachingMapper {
    int countByExample(TeachingExample example);

    int deleteByExample(TeachingExample example);

    int deleteByPrimaryKey(TeachingKey key);

    int insert(TeachingKey record);

    int insertSelective(TeachingKey record);

    List<TeachingKey> selectByExample(TeachingExample example);

    int updateByExampleSelective(@Param("record") TeachingKey record, @Param("example") TeachingExample example);

    int updateByExample(@Param("record") TeachingKey record, @Param("example") TeachingExample example);
}