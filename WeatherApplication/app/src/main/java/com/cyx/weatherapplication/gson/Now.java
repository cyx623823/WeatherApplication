package com.cyx.weatherapplication.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cyx623823 on 2017/4/20.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
