package com.king.kingweather.gson;

/**
 * Created by Administrator on 2017/5/21.
 */

public class Now {
    public Cond cond;
    public String fl;
    public String hum;
    public String pcpn;
    public String pres;
    public String tmp;
    public String vis;
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
