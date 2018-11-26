package demo.spring.result;

/**
 * @Auther: zhangsy
 * @Date: 2018/11/26 14:42
 * @Description:
 */
public class GlobalErrorInfoException extends Exception {

    private ErrorInfoInterface errorInfoInterface;

    public GlobalErrorInfoException(ErrorInfoInterface errorInfoInterface) {
        this.errorInfoInterface = errorInfoInterface;
    }

    public ErrorInfoInterface getErrorInfoInterface() {
        return errorInfoInterface;
    }

    public void setErrorInfoInterface(ErrorInfoInterface errorInfoInterface) {
        this.errorInfoInterface = errorInfoInterface;
    }
}
