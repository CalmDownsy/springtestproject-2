package demo.spring.web;

import demo.spring.constant.CityErrorInfoEnum;
import demo.spring.domain.City;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import demo.spring.result.GlobalErrorInfoException;
import demo.spring.result.ResultBody;

/**
 * @Auther: zhangsy
 * @Date: 2018/11/26 13:46
 * @Description:
 */
@RestController
public class ErrorJsonController {

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public ResultBody find(@RequestParam("cityName") String name) throws GlobalErrorInfoException {
        if (StringUtils.isEmpty(name)) {
            throw new GlobalErrorInfoException(CityErrorInfoEnum.PARAMS_NOT_COMPLETED);
        }
        return new ResultBody(new City(1L, 1L ,"武汉", "这里很热~"));
    }
}
