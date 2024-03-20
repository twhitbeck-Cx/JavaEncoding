package com.cx.automation.adk.stopwatch;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Dima Masis
 * Date 04/05/2016\ 2024 03 01
 */

public class Stopwatch {

    private final long start;

    /**
     * Initializes a new stopwatch.
     */
    public Stopwatch() {
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

    public String convertSecondToHHMMString(int secondtTime) {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        df.setTimeZone(tz);
        String time = df.format(new Date(secondtTime * 1000L));

        return time;

    }
}
