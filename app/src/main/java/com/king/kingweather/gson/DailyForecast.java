package com.king.kingweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/5/21.
 */

public class DailyForecast {

    public Astro astro;//天文指数

    public Cond cond;//

    public String date;

    public String hum;

    public String pcpn;

    public String pop;

    public String pres;

    public String vis;

    public Wind wind;

    @SerializedName("tmp")
    public Temperature temperature;

    public class Temperature{
        public String max;
        public String min;
    }

    public class Astro{
        public String mr;
        public String ms;
        public String sr;
        public String ss;
    }

    public class Cond{
        public String code_d;
        public String code_n;
        public String txt_d;
        public String txt_n;
    }

    public class Wind{
        public String deg;
        public String dir;
        public String sc;

    }
}
