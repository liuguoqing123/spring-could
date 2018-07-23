package com.forezp.service;

import com.netflix.client.http.HttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }

    @Override
    public String selectById(String id) {
            return "sorry "+id;
        }

    @Override
    public String save(Users users) {
        return null;
    }

//    @Override
//    public String list(String page, String rows, Users user, HttpServletResponse res) {
//        return null;
//    }

    @Override
    public String list(String page, String rows,Users user) {
        return null;
    }

    @Override
    public String delete(String id) {
        return null;
    }


    @Override
    public String update(Users users) {
        return null;
    }

}
