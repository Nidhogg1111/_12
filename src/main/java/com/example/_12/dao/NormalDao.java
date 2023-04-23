package com.example._12.dao;

import com.example._12.domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NormalDao {
    List<Student> selectByPageAndContion(@Param("begin") int begin, @Param("size") int size, @Param("student") Student student);

    int selectTotalCountByContion(@Param("student") Student student);

    @Insert("insert into normaluser values(#{id},#{name},#{sex},#{age},null)")
    void add(Student stu);

    void deleteByIds(@Param("ids") int[] ids);

    void updateByNum(Student student);

    @Delete("delete from normaluser where num = #{num}")
    void deleteById(int num);
}
