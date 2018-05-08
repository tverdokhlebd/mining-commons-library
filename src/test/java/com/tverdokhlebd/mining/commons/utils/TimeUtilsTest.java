package com.tverdokhlebd.mining.commons.utils;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

/**
 * Tests of time utils.
 *
 * @author Dmitry Tverdokhleb
 *
 */
public class TimeUtilsTest {

    @Test
    public void testAddingMinutes() {
        Date date = new Date(1524304800000L); // Saturday, April 21, 2018 10:00:00 AM
        assertEquals(new Date(1524304860000L), TimeUtils.addMinutes(date, 1));
        assertEquals(new Date(1524306300000L), TimeUtils.addMinutes(date, 25));
        assertEquals(new Date(1524308400000L), TimeUtils.addMinutes(date, 60));
    }

}
