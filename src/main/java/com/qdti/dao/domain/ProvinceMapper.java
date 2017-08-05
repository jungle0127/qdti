package com.qdti.dao.domain;

import com.qdti.dao.model.Province;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ProvinceMapper {
    @Delete({
        "delete from province",
        "where code = #{code,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String code);

    @Insert({
        "insert into province (code, name)",
        "values (#{code,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR})"
    })
    int insert(Province record);

    int insertSelective(Province record);

    @Select({
        "select",
        "code, name",
        "from province",
        "where code = #{code,jdbcType=VARCHAR}"
    })
    @ResultMap("com.qdti.dao.domain.ProvinceMapper.BaseResultMap")
    Province selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Province record);

    @Update({
        "update province",
        "set name = #{name,jdbcType=VARCHAR}",
        "where code = #{code,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Province record);
}