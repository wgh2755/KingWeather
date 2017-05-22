package com.king.kingweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/5/21.
 */

public class Weather {
    public String status;//状态码
    public Aqi aqi;
    public Basic basic;
    public Now now;
    public Suggestion suggestion;
    public Weather weather;

    //天气预报
    @SerializedName("daily_forecast")
    public List<DailyForecast> dailyForecastList;

    //每小时预报
    @SerializedName("hourly_forecast")
    public List<HourlyForecast> hourlyForecastList;
}
