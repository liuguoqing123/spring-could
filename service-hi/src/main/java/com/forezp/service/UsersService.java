package com.forezp.service;

import com.forezp.bean.Users;
import com.forezp.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class UsersService {

    @Autowired(required = true)
    UsersMapper usersMapper;

    public List<Users> find(Map<String, Object> map) {
        return usersMapper.find(map);
    }

    public Long getTotal(Map<String, Object> map) {
        return usersMapper.getTotal(map);
    }

    public Users selectById(int id){
        return usersMapper.selectById(id);
    }

    @Transactional
    public int save(Users users){
        return usersMapper.save(users);
    }

    @Transactional
    public int delete(int id){
        return usersMapper.delete(id);
    }

    @Transactional
    public int update(Users users){
        return usersMapper.update(users);
    }


    public List<Users> selectAll(){
        return usersMapper.selectAll();
    }


    public List<Users> select1(String userName , String userSex){
        return usersMapper.select1(userName , userSex);
    }
}
