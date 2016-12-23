package com.a14.free.nvg.Model;

/**
 * Created by huyen on 12/20/2016.
 */

public class GameEntity {
    public String imageResId;
    public String titleResId;

    public GameEntity (String imageResId, String titleResId){
        this.imageResId = imageResId;
        this.titleResId = titleResId;
    }

    public String getImageResId() {
        return imageResId;
    }

    public void setImageResId(String imageResId) {
        this.imageResId = imageResId;
    }

    public String getTitleResId() {
        return titleResId;
    }

    public void setTitleResId(String titleResId) {
        this.titleResId = titleResId;
    }
}