package com.qdti.dao.domain;

import com.qdti.dao.model.City;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CityMapper {
    @Delete({
        "delete from city",
        "where code = #{code,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String code);

    @Insert({
        "insert into city (code, name, ",
        "provincecode)",
        "values (#{code,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{provincecode,jdbcType=VARCHAR})"
    })
    int insert(City record);

    int insertSelective(City record);

    @Select({
        "select",
        "code, name, provincecode",
        "from city",
        "where code = #{code,jdbcType=VARCHAR}"
    })
    @ResultMap("com.qdti.dao.domain.CityMapper.BaseResultMap")
    City selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(City record);

    @Update({
        "update city",
        "set name = #{name,jdbcType=VARCHAR},",
          "provincecode = #{provincecode,jdbcType=VARCHAR}",
        "where code = #{code,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(City record);
}