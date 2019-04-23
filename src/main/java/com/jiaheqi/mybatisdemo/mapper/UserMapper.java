package com.jiaheqi.mybatisdemo.mapper;

import com.jiaheqi.mybatisdemo.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from users")
    @Results({
            @Result(property = "userId",column = "user_id"),
            @Result(property = "userCode",column = "user_code"),
            @Result(property = "userName",column = "user_name"),
            @Result(property = "nickName",column = "nick_name"),
            @Result(property = "userPwd",column = "user_pwd"),
            @Result(property = "createDate",column = "create_date"),
            @Result(property = "updateDate",column = "update_date")
    })
    public List<UserEntity> queryList();

    @Select("select * from users where user_id = #{userId}")
    @Results({
            @Result(property = "userId",column = "user_id"),
            @Result(property = "userCode",column = "user_code"),
            @Result(property = "userName",column = "user_name"),
            @Result(property = "nickName",column = "nick_name"),
            @Result(property = "userPwd",column = "user_pwd"),
            @Result(property = "createDate",column = "create_date"),
            @Result(property = "updateDate",column = "update_date")
    })
     public UserEntity findById( Long userId);

    @Insert("insert into users(user_code,user_name,nick_name,user_pwd,create_date,update_date) values(#{userCode},#{userName}," +
            "#{nickName},#{userPwd},#{createDate},#{updateDate})")
    public int insertEntity(UserEntity entityinsert);

    @Update("update users set user_name = #{userName} where user_id = #{userId}")
    public int updateEntity(UserEntity entityupdate);

    @Delete("delete from users where user_id = #{userId}")
    public int delete(Long userId);
    @Delete("delete from users where user_id = #{userId}")
    public int deleteEntity(UserEntity entitydelete);


}
