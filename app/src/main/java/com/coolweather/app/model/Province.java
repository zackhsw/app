package com.coolweather.app.model;

/**
 * Created by zack on 2016/5/5.
 */
public class Province {
    private int id;
    private String provinceName;

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    private String provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id ){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceCode(String provinceCode){
        this.provinceCode = provinceCode;
    }




}
