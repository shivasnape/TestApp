package com.snape.shivichu.testjelws.model;

/**
 * Created by Shivichu on 28-01-2018.
 */

public class CategoryDataList {

    String sId,sName,sImage;

    public CategoryDataList(){

    }

    public CategoryDataList(String id, String name, String image){

        this.sId = id;
        this.sName = name;
        this.sImage = image;

    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsImage() {
        return sImage;
    }

    public void setsImage(String sImage) {
        this.sImage = sImage;
    }
}
