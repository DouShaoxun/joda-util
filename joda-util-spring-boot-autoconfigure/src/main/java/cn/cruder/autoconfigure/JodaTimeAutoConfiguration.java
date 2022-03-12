package cn.cruder.autoconfigure;

import cn.cruder.properties.JodaTimeProperties;
import cn.cruder.service.JodaTimeService;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: cruder
 * @Date: 2022/03/12/18:00
 */
@AllArgsConstructor
@Configuration
@ConditionalOnProperty(value = "cruder.joda.enable", havingValue = "true")
@EnableConfigurationProperties(JodaTimeProperties.class)
public class JodaTimeAutoConfiguration {
    private final JodaTimeProperties jodaTimeProperties;


    @Bean
    @ConditionalOnMissingBean
    public JodaTimeService jodaTimeService() {
        return new JodaTimeService(jodaTimeProperties.getPatternStandard());
    }
}
