package com.forezp.mapper;

import com.forezp.bean.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UsersMapper {

    public Long getTotal(Map<String, Object> map);

    public List<Users> find(Map<String, Object> map);

    public Users selectById(int id);

    public int save(Users user);

    public int delete(int id);

    public int update(Users user);

    public List<Users> selectAll();

    public List<Users> select1(@Param("userName")String userName , @Param("userSex")String userSex);


}
