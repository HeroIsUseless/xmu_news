package cn.heroisuseless.back;

import java.util.List;

import com.alibaba.fastjson.JSON;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.heroisuseless.back.entity.NewsEntity;

@Controller
public class Router {
    @Autowired
    private Mapper mapper;

    @RequestMapping("/news")
    @ResponseBody
    public String news() {
        List<NewsEntity> li = mapper.findAll();
        return JSON.toJSONString(li);
    }

    @GetMapping("/test")
    public String test() {
        return "Hello";
    }
}
