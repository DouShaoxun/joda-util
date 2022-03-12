package cn.cruder.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: cruder
 * @Date: 2022/03/12/18:02
 */
@Data
@Component
@ConfigurationProperties(prefix = "cruder.joda")
public class JodaTimeProperties {

    /**
     * JodaTimeProperties 开关
     */
    boolean enable = false;

    /**
     * 日期格式
     */
    private String patternStandard = "yyyy-MM-dd HH:mm:ss";
}
