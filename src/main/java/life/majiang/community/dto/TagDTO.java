package life.majiang.community.dto;

import lombok.Data;

import java.util.List;

/**
 * ClassName:TagDTO
 * Package:life.majiang.community.dto
 * Description:
 *
 * @Date:2020/1/13 下午 10:18
 * @Author:gaochenyu2020@163.com
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
