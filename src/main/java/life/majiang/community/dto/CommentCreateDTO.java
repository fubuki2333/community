package life.majiang.community.dto;

import lombok.Data;

/**
 * ClassName:CommentDTO
 * Package:life.majiang.community.dto
 * Description:
 *
 * @Date:2019/12/27 下午 8:38
 * @Author:gaochenyu2012@126.com
 */
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
