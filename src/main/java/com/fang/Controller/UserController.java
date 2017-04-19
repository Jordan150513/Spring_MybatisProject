package com.fang.Controller;

import com.fang.DAO.UserMapper;
import com.fang.model.User;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by qiaodandan on 2017/4/19.
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("selectByPrimaryKey")
    public User selectByPrimaryKey(int id){
        //http://localhost:8080/dd/selectByPrimaryKey?id=1
       return userMapper.selectByPrimaryKey(id);
    }

    @RequestMapping("insert")
    public int insert(java.lang.String username, java.lang.String birthday, java.lang.String sex, java.lang.String address){
        //http://localhost:8080/dd/insert?username=qiao&sex=1&birthday="1991"&address="beijingft"
        User user = new User(username,new Date(),sex,address);
        return userMapper.insert(user);
    }

    @RequestMapping("updateByPrimaryKey")
    public int updateByPrimaryKey(Integer id, java.lang.String username, java.lang.String sex, java.lang.String address, java.lang.String birthday){
        //http://localhost:8080/dd/updateByPrimaryKey?id=27&username=qiao&sex=1&birthday=1991&address=beijingft
        User user = new User(id,username,new Date(),sex,address);
        return userMapper.updateByPrimaryKey(user);
    }
}
