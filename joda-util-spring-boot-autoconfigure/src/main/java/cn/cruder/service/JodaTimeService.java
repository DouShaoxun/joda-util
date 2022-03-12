package cn.cruder.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.joda.time.DateTime;
import org.joda.time.Days;

import java.util.Date;

/**
 * @Author: cruder
 * @Date: 2022/03/12/18:01
 */
@AllArgsConstructor
@Data
public class JodaTimeService {
    /**
     * 日期格式
     */
    private String patternStandard;

    /**
     * 获取当前系统时间
     *
     * @return yyyy-MM-dd HH:mm:ss
     */
    public String getCurrentDateTime() {
        DateTime dt = new DateTime();
        return dt.toString(patternStandard);
    }

    /**
     * 计算两个时间相差多少天
     *
     * @param startDate 起始时间
     * @param endDate   结束时间
     * @return 时间间隔
     */
    public Integer diffDay(Date startDate, Date endDate) {
        if (startDate == null || endDate == null) {
            throw new RuntimeException("参数有误");
        }
        DateTime dt1 = new DateTime(startDate);
        DateTime dt2 = new DateTime(endDate);
        int day = Days.daysBetween(dt1, dt2).getDays();
        return Math.abs(day);
    }


}
