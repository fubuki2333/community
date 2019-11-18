package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName:HelloController
 * Package:life.majiang.community.controller
 * Description:
 *
 * @Date:2019/11/18 下午 2:24
 * @Author:gaochenyu2012@126.com
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
