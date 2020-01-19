package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * ClassName:NotificationDTO
 * Package:life.majiang.community.dto
 * Description:
 *
 * @Date:2020/1/16 下午 10:30
 * @Author:gaochenyu2020@163.com
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
