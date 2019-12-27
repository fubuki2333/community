package life.majiang.community.exception;

/**
 * ClassName:CustomizeErrorCode
 * Package:life.majiang.community.exception
 * Description:
 *
 * @Date:2019/12/26 下午 8:52
 * @Author:gaochenyu2012@126.com
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND("你找的问题不在了，要不要换个试试？");

    @Override
    public String getMessage() {
        return message;
    }

    private String message;

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
