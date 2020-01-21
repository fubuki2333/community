package life.majiang.community.controller;

import life.majiang.community.dto.FileDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:FileController
 * Package:life.majiang.community.controller
 * Description:
 *
 * @Date:2020/1/20 上午 11:36
 * @Author:gaochenyu2020@163.com
 */
@Controller
public class FileController {
    @RequestMapping("/files/upload")
    @ResponseBody
    public FileDTO upload(){
        FileDTO fileDTO = new FileDTO();
        fileDTO.setSuccess(1);
        fileDTO.setUrl("/images/redmi.jpg");
        return fileDTO;
    }
}
