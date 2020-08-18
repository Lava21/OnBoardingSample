package com.mas.sampleOnBoarding;

public class ScreenItem {
    String title, desc;
    int screenIv;

    public ScreenItem(String title, String desc, int screenIv) {
        this.title = title;
        this.desc = desc;
        this.screenIv = screenIv;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getScreenIv() {
        return screenIv;
    }

    public void setScreenIv(int screenIv) {
        this.screenIv = screenIv;
    }
}
