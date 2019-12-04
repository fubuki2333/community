package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName:PublishController
 * Package:life.majiang.community.controller
 * Description:
 *
 * @Date:2019/12/4 下午 10:33
 * @Author:gaochenyu2020@163.com
 */
@Controller
public class PublishController {

    @GetMapping("/publish")
    public String publish(){
        return "publish";
    }
}
