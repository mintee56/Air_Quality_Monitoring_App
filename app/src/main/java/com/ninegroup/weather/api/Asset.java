package com.ninegroup.weather.api;

import com.google.gson.annotations.SerializedName;

public class Asset {
    @SerializedName("id")
    public String id;
    @SerializedName("version")
    public String version;
    @SerializedName("createdOn")
    public String createdOn;
    @SerializedName("name")
    public String name;
    @SerializedName("accessPublicRead")
    public String accessPublicRead;
    @SerializedName("parentID")
    public String parentID;
    @SerializedName("realm")
    public String realm;
    @SerializedName("type")
    public String type;
    @SerializedName("path")
    public String[] path;
    @SerializedName("attributes")
    public Object attributes;
}


