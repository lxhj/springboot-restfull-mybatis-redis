package com.gd.itcarrier.springboot.controller;

import com.solo.springcloud.commons.entities.UserProfile;
import com.gd.itcarrier.springboot.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.solo.springcloud.commons.util.ResultBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 业务处理控制层，实现 Restful服务
 * @author yuzg
 *
 */
@Api(value="web")
@RestController
public class UserProfileRestController {

    @Autowired
    private UserProfileService userProfileService;

    @ApiOperation(value = "/api/userprofile/{id}", response = CustomerRestController.class)
    @RequestMapping(value = "/api/userprofile/{id}", method = RequestMethod.GET)
    public UserProfile findOneUserProfile(@PathVariable("id") Integer id) {
        UserProfile userprofile = userProfileService.selectByPrimaryKey(id);

        return userprofile;
    }

    /*@RequestMapping(value = "/api/userprofile", method = RequestMethod.GET)
    public List<userprofile> findAllCustomer() {
        return customerService.findAllCustomer();
    }*/

    @RequestMapping(value = "/api/userprofile", method = RequestMethod.POST)
    public void createCustomer(@RequestBody UserProfile userprofile) {
        userProfileService.insert(userprofile);
    }

    @RequestMapping(value = "/api/userprofile", method = RequestMethod.PUT)
    public void modifyCustomer(@RequestBody UserProfile userprofile,HttpServletRequest request, HttpServletResponse response) {
        userProfileService.updateByPrimaryKey(userprofile);
    }
    @ResponseBody
    @RequestMapping(value = "/api/userprofile/{id}", method = RequestMethod.DELETE)
    public ResultBody modifyCustomer(@PathVariable("id") Integer id,HttpServletRequest request, HttpServletResponse response) {
        long result = userProfileService.deleteByPrimaryKey(id);
        ResultBody body = new ResultBody();
        if(result==0)
        {
            response.setStatus(400);
            body.setCode("400");
            body.setMessage("删除失败!");
        }
        else{
            body.setCode("200");
            body.setMessage("删除成功!");
        }
        return body;
    }
}
