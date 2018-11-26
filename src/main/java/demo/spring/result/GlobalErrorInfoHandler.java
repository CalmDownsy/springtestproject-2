package demo.spring.result;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Auther: zhangsy
 * @Date: 2018/11/26 15:10
 * @Description:
 */
@RestControllerAdvice
public class GlobalErrorInfoHandler {

    @ExceptionHandler(value = GlobalErrorInfoException.class)
    public ResultBody errorHandler(GlobalErrorInfoException e) {
        ErrorInfoInterface errorInfoInterface = e.getErrorInfoInterface();
        return new ResultBody(errorInfoInterface);
    }
}
