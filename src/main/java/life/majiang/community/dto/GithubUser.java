package life.majiang.community.dto;

import lombok.Data;

/**
 * ClassName:GithubUser
 * Package:life.majiang.community.dto
 * Description:
 *
 * @Date:2019/11/21 下午 1:50
 * @Author:gaochenyu2020@163.com
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
