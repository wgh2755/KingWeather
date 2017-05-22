package com.king.kingweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/5/21.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("cnty")
    public String country;

    @SerializedName("id")
    public String weatherId;

    public String lat;

    public String lon;

    @SerializedName("prov")
    public String provinceName;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
        @SerializedName("utc")
        public String utctime;
    }
}
