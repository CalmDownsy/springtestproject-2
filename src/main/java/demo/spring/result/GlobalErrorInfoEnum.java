package demo.spring.result;

/**
 * @Auther: zhangsy
 * @Date: 2018/11/26 15:52
 * @Description:
 */
public enum GlobalErrorInfoEnum implements ErrorInfoInterface {

    SUCCESS("0", "success"), NOT_FOUND("-1", "service not found");

    private String code;
    private String msg;

    GlobalErrorInfoEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
