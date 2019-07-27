package github.yy.controller;

import github.yy.mapper.UserMapper;
import github.yy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: day75-spring-mybatis
 * @author: yy
 * @create: 2019-07-26 20:53
 * Description: No Description
 */

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/query")
    public List<User> queryUser(){
        return  userMapper.queryUser();
    }
}