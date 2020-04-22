package com.gd.itcarrier.springboot.controller;

import com.gd.itcarrier.springboot.service.UserService;
import com.solo.springcloud.commons.util.ResultBody;
import com.solo.springcloud.commons.entities.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 业务处理控制层，实现 Restful服务
 *
 * @author yuzg
 */
@Api(value = "web")
@RestController
public class UserRestController {

    @Autowired
    private UserService UserService;

    @GetMapping(value = "/api/user/{id}")
    @ApiOperation(value = "/api/user/{id}", response = UserRestController.class)
    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
    //public void findOneUser(@PathVariable("id") Long id) {
    public ResultBody findOneUser(@PathVariable("id") Long id, HttpServletRequest request, HttpServletResponse response) {
        //User user = UserService.findUserById(id);
        //return user;
        User user = UserService.findUserById(id);
        ResultBody body = new ResultBody();
        body.setResult(user);
        body.setCode("200");
        body.setMessage("ID:" + user.getId() + ",查询成功");
        return body;
    }

    /*@RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public List<user> findAllUser() {
        return UserService.findAllUser();
    }*/

    @RequestMapping(value = "/api/user", method = RequestMethod.POST)
    public void createUser(@RequestBody User user) {

        UserService.saveUser(user);
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.PUT)
    public void modifyUser(@RequestBody User user, HttpServletRequest request, HttpServletResponse response) {
        UserService.updateUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.DELETE)
    public ResultBody modifyUser(@PathVariable("id") Long id, HttpServletRequest request, HttpServletResponse response) {
        long result = UserService.deleteUser(id);
        ResultBody body = new ResultBody();
        if (result == 0) {
            response.setStatus(400);
            body.setCode("400");
            body.setMessage("删除失败!");
        } else {
            body.setCode("200");
            body.setMessage("删除成功!");
        }
        return body;
    }

    @ResponseBody
    @PostMapping(value = "/api/login")
    public ResultBody login(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            Map<String, Object> map,
                            HttpSession session) {

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        ResultBody body = new ResultBody();
        if (UserService.login(user) != null) {
            User userInfo = UserService.login(user);
            Long id = userInfo.getId();
            HashMap<String, Long> userID = new HashMap<String, Long>() {{
                put("id", id);
            }};
            //登录成功,为了防止表单重复提交，利用重定向
            session.setAttribute("loginUser", username);
            session.setAttribute("loginUserID", userInfo.getId());
            body.setResult(userID);
            body.setCode("200");
            body.setMessage("登录成功!");
        } else {
            //            登陆失败
            body.setCode("400");
            body.setMessage("密码错误或者用户不存在!");
        }
        return body;
    }

    // 用户注销
    @GetMapping("/logout/{username}")
    public String logout(@PathVariable("username") String username, HttpSession session) {
        // 清除session
        session.invalidate();
        return "redirect:/login";
    }

}
