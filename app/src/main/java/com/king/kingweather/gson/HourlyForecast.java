package com.king.kingweather.gson;

/**
 * Created by Administrator on 2017/5/21.
 */

public class HourlyForecast {
    public Cond cond;
    public String date;
    public String hum;
    public String pop;
    public String pres;
    public String tmp;
    public Wind wind;

    public class Cond{
        public String code;
        public String txt;
    }

    public class Wind{
        public String deg;
        public String dir;
        public String sc;
        public String spd;

    }


}
