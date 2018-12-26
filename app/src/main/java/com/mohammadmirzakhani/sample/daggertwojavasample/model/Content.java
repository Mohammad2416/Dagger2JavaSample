
package com.mohammadmirzakhani.sample.daggertwojavasample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("addressLarge")
    @Expose
    private String addressLarge;
    @SerializedName("addressSmall")
    @Expose
    private String addressSmall;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("info")
    @Expose
    private String info;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressLarge() {
        return addressLarge;
    }

    public void setAddressLarge(String addressLarge) {
        this.addressLarge = addressLarge;
    }

    public String getAddressSmall() {
        return addressSmall;
    }

    public void setAddressSmall(String addressSmall) {
        this.addressSmall = addressSmall;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
