package com.forezp.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;



/**
 * Created by fangzhipeng on 2017/4/6.
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/selectById",method = RequestMethod.GET)
    String selectById(@RequestParam(value = "id") String id);

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    String save(@RequestBody Users users);

//    @RequestMapping(value = "/list",method = RequestMethod.POST)
//    String list(@RequestParam(value="page",required=false) String page, @RequestParam(value="rows",required=false) String rows, @RequestBody Users user, HttpServletResponse res);

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    String list(@RequestParam(value="page",required=false) String page, @RequestParam(value="rows",required=false) String rows, @RequestBody Users user);


    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    String delete(@RequestParam(value = "id") String id);

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    String update(@RequestBody Users users);

    }


