package cool.lym.blog.web;

import cool.lym.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        String blog =null;
        if (blog == null){
            throw  new NotFoundException("Not !!");
        }
        return "index";
    }
}
