package life.majiang.community.enums;

/**
 * ClassName:CommentTypeEnum
 * Package:life.majiang.community.enums
 * Description:
 *
 * @Date:2019/12/28 下午 5:18
 * @Author:gaochenyu2012@126.com
 */
public enum CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);

    private Integer type;

    public Integer getType() {
        return type;
    }

    CommentTypeEnum(Integer type) { this.type = type; }

    public static boolean isExist(Integer type) {
        for (CommentTypeEnum commentTypeEnum : CommentTypeEnum.values()) {
            if (commentTypeEnum.getType() == type){
                return true;
            }
        }
        return false;
    }
}
