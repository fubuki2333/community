package life.majiang.community.exception;

/**
 * ClassName:CustomizeException
 * Package:life.majiang.community.exception
 * Description:
 *
 * @Date:2019/12/26 下午 5:59
 * @Author:gaochenyu2012@126.com
 */
public class CustomizeException extends RuntimeException {
    private String message;

    public CustomizeException(ICustomizeErrorCode errorCode){
        this.message = errorCode.getMessage();
    }

    public CustomizeException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
