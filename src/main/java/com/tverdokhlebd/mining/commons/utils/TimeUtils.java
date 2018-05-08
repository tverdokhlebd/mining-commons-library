package com.tverdokhlebd.mining.commons.utils;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/**
 * Utils for working with time.
 *
 * @author Dmitry Tverdokhleb
 *
 */
public class TimeUtils {

    /** Hours in day. */
    public static final BigDecimal HOURS_IN_DAY = BigDecimal.valueOf(24);
    /** Days in week. */
    public static final BigDecimal DAYS_IN_WEEK = BigDecimal.valueOf(7);
    /** Days in month. */
    public static final BigDecimal DAYS_IN_MONTH = BigDecimal.valueOf(30);
    /** Days in year. */
    public static final BigDecimal DAYS_IN_YEAR = BigDecimal.valueOf(365);
    /** Period of repeated task. */
    public static final long REPEATED_TASK_PERIOD = SECONDS.toMillis(10);

    /**
     * Adds minutes to date.
     *
     * @param currentDate current date
     * @param amount amount of minutes
     * @return date with added amount of minutes
     */
    public static Date addMinutes(Date currentDate, int amount) {
        Calendar now = Calendar.getInstance();
        now.setTime(currentDate);
        now.add(Calendar.MINUTE, amount);
        return now.getTime();
    }

}
