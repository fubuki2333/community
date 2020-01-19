package life.majiang.community.enums;

/**
 * ClassName:NotificationStatusEnum
 * Package:life.majiang.community.enums
 * Description:
 *
 * @Date:2020/1/16 下午 10:01
 * @Author:gaochenyu2020@163.com
 */
public enum NotificationStatusEnum {
    UNREAD(0), READ(1);
    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status) {
        this.status = status;
    }
}
