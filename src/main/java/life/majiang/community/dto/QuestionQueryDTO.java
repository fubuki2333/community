package life.majiang.community.dto;

import lombok.Data;

/**
 * ClassName:QuestionQueryDTO
 * Package:life.majiang.community.dto
 * Description:
 *
 * @Date:2020/1/29 下午 11:48
 * @Author:gaochenyu2020@163.com
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;
}
