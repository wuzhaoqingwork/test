package com.example.controller;

import com.example.entity.UserEntity;
import jakarta.websocket.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UrlController {

    @GetMapping("/index")
    public String getIndex(Model model) {

        UserEntity userEntity = new UserEntity("李四",18,1);
        model.addAttribute("user",userEntity);
//        model.addAttribute("name","aaa");
        return "index";
    }
    @GetMapping("/expression")
    public String getExpression(Model model) {
        UserEntity userEntity = new UserEntity("李四",18,1);
        model.addAttribute("user",userEntity);
        model.addAttribute("message", "通过$符号取出");
//        model.addAttribute("name","aaa");
        return "expression";
    }
    @GetMapping("/entity")
    public String getEntity(Model model) {

        UserEntity userEntity1 = new UserEntity("李四",18,1);
        model.addAttribute("user1",userEntity1);
        int age =1;
        List<UserEntity> userEntityList = new ArrayList<>();
        Map<String,UserEntity> userEntityMap = new HashMap<>();
        for(int i=0;i<4;i++){
            age++;
            UserEntity userEntity = new UserEntity("李四"+age,age,1);
//            userEntity.setName("李四"+age);
//            userEntity.setAge(age);
            userEntityList.add(userEntity);
            userEntityMap.put("李四"+age,userEntity);
//            System.out.println(userEntity.getName());
        }
        model.addAttribute("userEntityList",userEntityList);
        model.addAttribute("userEntityMap",userEntityMap);
//        model.addAttribute("name","aaa");
        return "entity";
    }
    @GetMapping("/condition")
    public String getCondition(Model model) {
        UserEntity userEntity1 = new UserEntity("李四",19,1);
        model.addAttribute("user",userEntity1);
        model.addAttribute("message", "通过$符号取出");
//        model.addAttribute("name","aaa");
        int age =17;
        Map<String,UserEntity> userEntityMap = new HashMap<>();
        List<String> tableName = new ArrayList<>();
        tableName.add("name");
        tableName.add("age");
        tableName.add("sex");
        for(int i=0;i<4;i++){
            age++;
            UserEntity userEntity = new UserEntity("李四"+age,age,1);
//            userEntity.setName("李四"+age);
//            userEntity.setAge(age);
            userEntityMap.put("李四"+age,userEntity);
//            System.out.println(userEntity.getName());
        }
        model.addAttribute("tableName",tableName);
        model.addAttribute("userEntityMap",userEntityMap);
        return "condition";
    }
}
