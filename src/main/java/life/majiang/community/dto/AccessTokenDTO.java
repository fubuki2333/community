package life.majiang.community.dto;

import lombok.Data;

/**
 * ClassName:AccessTokenDTO
 * Package:life.majiang.community.dto
 * Description:
 *
 * @Date:2019/11/19 下午 10:51
 * @Author:gaochenyu2020@163.com
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
