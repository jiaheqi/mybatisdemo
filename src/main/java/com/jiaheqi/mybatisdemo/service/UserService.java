package com.jiaheqi.mybatisdemo.service;

import com.jiaheqi.mybatisdemo.entity.UserEntity;
import com.jiaheqi.mybatisdemo.mapper.UserMapper;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class UserService {
        @Autowired(required = false)
        private UserMapper mapper;

        /*
        查询所有
         */
        public List<UserEntity> queryList(){
            List<UserEntity> userlist = mapper.queryList();
            return userlist;
        }
        /*
        根据id查询
         */
        public UserEntity findById(Long userId){
            System.out.println("useRId"+userId);
            return mapper.findById(userId);
        }

        public int insertEntity(){
            UserEntity entityinsert = new UserEntity();
            entityinsert.setUserName("jiaheqi");
            entityinsert.setNickName("小七");
            entityinsert.setUserCode("jiaheqi");
            entityinsert.setUserPwd("123456");
            entityinsert.setCreateDate(new Date());
            entityinsert.setUpdateDate(new Date());
            return mapper.insertEntity(entityinsert);


        }

        public int deleteEntity(){
            UserEntity entitydelete = new UserEntity();
            entitydelete.setUserId(11);
            return mapper.deleteEntity(entitydelete);

        }

        public int updateEntity(){
            UserEntity entityupdate = new UserEntity();
            entityupdate.setUserName("curry");
            entityupdate.setUserId(3);
            return mapper.updateEntity(entityupdate);

        }

}
