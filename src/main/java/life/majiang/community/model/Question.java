package life.majiang.community.model;

import lombok.Data;

/**
 * ClassName:Question
 * Package:life.majiang.community.model
 * Description:
 *
 * @Date:2019/12/8 下午 1:11
 * @Author:gaochenyu2012@126.com
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
}
