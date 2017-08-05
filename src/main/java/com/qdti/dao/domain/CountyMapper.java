package com.qdti.dao.domain;

import com.qdti.dao.model.County;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CountyMapper {
    @Delete({
        "delete from county",
        "where code = #{code,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String code);

    @Insert({
        "insert into county (code, name, ",
        "citycode)",
        "values (#{code,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{citycode,jdbcType=VARCHAR})"
    })
    int insert(County record);

    int insertSelective(County record);

    @Select({
        "select",
        "code, name, citycode",
        "from county",
        "where code = #{code,jdbcType=VARCHAR}"
    })
    @ResultMap("com.qdti.dao.domain.CountyMapper.BaseResultMap")
    County selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(County record);

    @Update({
        "update county",
        "set name = #{name,jdbcType=VARCHAR},",
          "citycode = #{citycode,jdbcType=VARCHAR}",
        "where code = #{code,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(County record);
}