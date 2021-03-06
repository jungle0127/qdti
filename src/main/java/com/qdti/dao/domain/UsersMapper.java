package com.qdti.dao.domain;

import com.qdti.dao.model.Users;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface UsersMapper {
    @Delete({
        "delete from users",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into users (id, userName, ",
        "loginName, password, ",
        "typeid)",
        "values (#{id,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{loginname,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{typeid,jdbcType=INTEGER})"
    })
    int insert(Users record);

    int insertSelective(Users record);

    @Select({
        "select",
        "id, userName, loginName, password, typeid",
        "from users",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.qdti.dao.domain.UsersMapper.BaseResultMap")
    Users selectByPrimaryKey(Integer id);

    @Select({
    	"select",
        "id, userName, loginName, password, typeid",
        "from users",
        "order by id desc"
    })
    @Results({
    	@Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
    	@Result(column="userName", property="username", jdbcType=JdbcType.VARCHAR),    	
    	@Result(column="loginName", property="loginname", jdbcType=JdbcType.VARCHAR),
    	@Result(column="typeid",property="typeid", jdbcType=JdbcType.INTEGER)
    })
    List<Users> selectAll();
    
    int updateByPrimaryKeySelective(Users record);

    @Update({
        "update users",
        "set userName = #{username,jdbcType=VARCHAR},",
          "loginName = #{loginname,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "typeid = #{typeid,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Users record);
}