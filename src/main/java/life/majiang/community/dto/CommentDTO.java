package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * ClassName:CommentDTO
 * Package:life.majiang.community.dto
 * Description:
 *
 * @Date:2020/1/5 下午 10:54
 * @Author:gaochenyu2020@163.com
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private String content;
    private User user;
}
