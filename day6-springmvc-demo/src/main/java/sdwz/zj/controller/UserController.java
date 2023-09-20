package sdwz.zj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(String name,String id){
        System.out.println("经过sdwz.zj.controller.save:");
        System.out.println("name:"+name+"--"+id);
        return "{'info':'save'}";
    }
}
