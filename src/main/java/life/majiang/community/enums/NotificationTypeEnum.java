package life.majiang.community.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * ClassName:NotificationEnum
 * Package:life.majiang.community.enums
 * Description:
 *
 * @Date:2020/1/16 下午 9:55
 * @Author:gaochenyu2020@163.com
 */
public enum NotificationTypeEnum {
    REPLY_QUESTION(1,"回复了问题"),
    REPLY_COMMENT(2,"回复了评论");
    private int type;
    private String name;

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    NotificationTypeEnum(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public static String nameOfType(int type){
        for (NotificationTypeEnum notificationTypeEnum : NotificationTypeEnum.values()) {
            if (notificationTypeEnum.getType() == type){
                return notificationTypeEnum.getName();
            }
        }
        return "";
    }
}
