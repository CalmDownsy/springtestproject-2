package demo.spring.constant;


import demo.spring.result.ErrorInfoInterface;

/**
 * @Auther: zhangsy
 * @Date: 2018/11/26 14:14
 * @Description:
 */
public enum CityErrorInfoEnum implements ErrorInfoInterface {
    PARAMS_NOT_COMPLETED("000001", "params not complete"),
    CITY_EXIT("000002", "city exist");

    private String code;
    private String msg;

    CityErrorInfoEnum(String code, String msg) {
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
