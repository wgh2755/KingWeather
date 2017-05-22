package com.king.kingweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/5/21.
 */

public class Aqi {

    public City city;

    public class City{
        public String aqi;

        public String co;

        public String no2;

        public String o3;

        public String pm10;

        public String pm25;

        @SerializedName("qlty")
        public String quality;

        public String so2;
    }
}
