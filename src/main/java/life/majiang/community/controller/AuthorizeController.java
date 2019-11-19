package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName:AuthorizeController
 * Package:life.majiang.community.controller
 * Description:
 *
 * @Date:2019/11/19 下午 10:00
 * @Author:gaochenyu2020@163.com
 */
@Controller
public class AuthorizeController {
    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state) {
        return "index";
    }
}
