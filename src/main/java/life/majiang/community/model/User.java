package life.majiang.community.model;

import lombok.Data;

/**
 * ClassName:User
 * Package:life.majiang.community.model
 * Description:
 *
 * @Date:2019/12/1 下午 2:35
 * @Author:gaochenyu2012@126.com
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
