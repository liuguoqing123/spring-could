package com.forezp.controller;


import com.forezp.bean.PageBean;
import com.forezp.bean.PageBeanUsers;
import com.forezp.bean.Users;
import com.forezp.service.UsersService;
import com.forezp.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;

@CrossOrigin
@RestController
public class UsersController {

    @Autowired(required = true)
    UsersService usersService;

    @RequestMapping(value = "/list")
    public PageBeanUsers list(@RequestParam(value="page",required=false) String page, @RequestParam(value="rows",required=false) String rows, @RequestBody Users s_user, HttpServletResponse res) throws Exception{
        System.out.println("page "+page);
        System.out.println("rows "+rows);
        PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
        Map<String,Object> map=new HashMap<String,Object>();
        //System.out.println("+++++++++++++++++++++++++++: "+s_user.getUserTel());
        System.out.println("+++++++++++++++++++++++++++: "+s_user.toString());
        map.put("userName",Util.formatLike(s_user.getUserName()));
        map.put("userTel", Util .formatLike(s_user.getUserTel()));
        map.put("start", pageBean.getStart());
        map.put("size", pageBean.getPageSize());
        List<Users> userList=usersService.find(map);
        Long total = usersService.getTotal(map);
//        JSONObject result=new JSONObject();
//        JSONArray jsonArray=JSONArray.fromObject(userList);
//        result.put("rows", jsonArray);
//        result.put("total", total);
        PageBeanUsers pageUsers = new PageBeanUsers();
        pageUsers.setTotal(total);
        pageUsers.setUsersList(userList);

        //res.setHeader("Access-Control-Allow-Origin", "*");
        return  pageUsers;
    }

    @RequestMapping(value = "/selectById")
    public Users selectById(int id){
        return usersService.selectById(id);
    }

    @RequestMapping(value="/save",method=RequestMethod.POST)
    public Users save(@RequestBody Users users,HttpServletResponse res){
        int rs = usersService.save(users);
        System.out.println("+++++++++++++++++++:"+rs);
        res.setHeader("Access-Control-Allow-Origin", "*");
        return users;
    }

    @RequestMapping("/delete")
    public int delete(int id,HttpServletResponse res){
        res.setHeader("Access-Control-Allow-Origin", "*");
        return usersService.delete(id);
    }

    @RequestMapping(value="/update",method=RequestMethod.POST)
    public Users update(@RequestBody Users users,HttpServletResponse res){
        System.out.println("+++++++++++++++++++++++++++: "+users.toString());
        res.setHeader("Access-Control-Allow-Origin", "*");
        usersService.update(users);
        return users;
    }


    @RequestMapping("/selectAll")
    public List<Users> selectAll(){
        return usersService.selectAll();
    }

    @RequestMapping("/select1")
    public List<Users> select1(String userName , String userSex){
        //PageHelper.startPage(pageNum, pageSize);
        return usersService.select1(userName , userSex);
    }
}
