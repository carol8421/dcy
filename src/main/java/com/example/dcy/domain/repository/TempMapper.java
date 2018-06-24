package com.example.dcy.domain.repository;

import com.example.dcy.domain.entity.Temp;
import org.apache.ibatis.annotations.*;

/**
 * Temp映射的操作
 */
@Mapper
public interface TempMapper {

    @Select("SELECT * FROM TEMP WHERE ID = #{id}")
    Temp findById(@Param("id") Integer id);

    @Insert("INSERT INTO TEMP(NAME, CONTENT) VALUES(#{name}, #{content})")
    int insert(Temp temp);

    @Update("UPDATE TEMP SET  CONTENT=#{content} WHERE ID=#{id}")
    int update(@Param("content") String content, @Param("id") Integer id);
}