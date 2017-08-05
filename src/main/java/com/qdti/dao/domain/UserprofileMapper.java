package com.qdti.dao.domain;

import com.qdti.dao.model.Userprofile;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserprofileMapper {
    @Delete({
        "delete from userProfile",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into userProfile (id, userId, ",
        "telephone, currentcountycode, ",
        "destcountycode)",
        "values (#{id,jdbcType=INTEGER}, #{userid,jdbcType=INTEGER}, ",
        "#{telephone,jdbcType=VARCHAR}, #{currentcountycode,jdbcType=VARCHAR}, ",
        "#{destcountycode,jdbcType=VARCHAR})"
    })
    int insert(Userprofile record);

    int insertSelective(Userprofile record);

    @Select({
        "select",
        "id, userId, telephone, currentcountycode, destcountycode",
        "from userProfile",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.qdti.dao.domain.UserprofileMapper.BaseResultMap")
    Userprofile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userprofile record);

    @Update({
        "update userProfile",
        "set userId = #{userid,jdbcType=INTEGER},",
          "telephone = #{telephone,jdbcType=VARCHAR},",
          "currentcountycode = #{currentcountycode,jdbcType=VARCHAR},",
          "destcountycode = #{destcountycode,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Userprofile record);
}