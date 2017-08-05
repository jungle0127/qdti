package com.qdti.dao.domain;

import com.qdti.dao.model.Usertype;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UsertypeMapper {
    @Delete({
        "delete from usertype",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into usertype (id, typename)",
        "values (#{id,jdbcType=INTEGER}, #{typename,jdbcType=VARCHAR})"
    })
    int insert(Usertype record);

    int insertSelective(Usertype record);

    @Select({
        "select",
        "id, typename",
        "from usertype",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.qdti.dao.domain.UsertypeMapper.BaseResultMap")
    Usertype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Usertype record);

    @Update({
        "update usertype",
        "set typename = #{typename,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Usertype record);
}