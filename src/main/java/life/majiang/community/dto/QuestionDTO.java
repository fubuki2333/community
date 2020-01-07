package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * ClassName:QuestionDTO
 * Package:life.majiang.community.dto
 * Description:
 *
 * @Date:2019/12/9 下午 10:57
 * @Author:gaochenyu2020@163.com
 */
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
