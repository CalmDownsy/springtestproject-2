package demo.spring.result;

/**
 * @Auther: zhangsy
 * @Date: 2018/11/26 14:43
 * @Description:
 */
public class ResultBody {

    private String code;
    private String msg;
    private Object result;

    // 异常
    // 多态
    public ResultBody(ErrorInfoInterface errorInfoInterface) {
        this.code = errorInfoInterface.getCode();
        this.msg = errorInfoInterface.getMsg();
    }

    // 成功
    public ResultBody(Object result) {
        this.code = GlobalErrorInfoEnum.SUCCESS.getCode();
        this.msg = GlobalErrorInfoEnum.SUCCESS.getMsg();
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
