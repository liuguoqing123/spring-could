package com.forezp.web;

import com.forezp.service.SchedualServiceHi;
import com.forezp.service.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;
import java.util.List;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    @RequestMapping(value = "/selectById",method = RequestMethod.GET)
    public String selectById(@RequestParam String id){
        return schedualServiceHi.selectById(id);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@RequestBody Users users){
        return schedualServiceHi.save(users);
    }

//    @RequestMapping(value = "/list",method = RequestMethod.POST)
//    public String list(@RequestParam(value="page",required=false) String page, @RequestParam(value="rows",required=false) String rows, @RequestBody Users user, HttpServletResponse res){
//        return schedualServiceHi.list(page,rows,user,res);
//    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public String list(@RequestParam(value="page",required=false) String page, @RequestParam(value="rows",required=false) String rows, @RequestBody Users user){
        return schedualServiceHi.list(page,rows,user);
    }

        @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(@RequestParam String id){
        return schedualServiceHi.delete(id);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(@RequestBody Users users){
        return schedualServiceHi.update(users);
    }
}
