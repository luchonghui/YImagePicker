package com.example.ypxredbookpicker.bean;

import java.io.Serializable;

/**
 * Created by Eason.Lai on 2015/11/1 10:42
 * contact：easonline7@gmail.com
 */
public class ImageItem implements Serializable {
    private static final long serialVersionUID = 1L;
    public String path;
    public String name;
    public int width;
    public int height;
    public long time;
    public String timeFormat;
    private boolean isSelect = false;
    private boolean isPress = false;
    private int selectIndex = -1;

    public ImageItem() {

    }

    public int getSelectIndex() {
        return selectIndex;
    }

    public void setSelectIndex(int selectIndex) {
        this.selectIndex = selectIndex;
    }

    public boolean isPress() {
        return isPress;
    }

    public void setPress(boolean press) {
        isPress = press;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }

    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public ImageItem(String path, String name, long time) {
        this.path = path;
        this.name = name;
        this.time = time;
    }

    public ImageItem(String path, String name, int width, int height, long time) {
        this.path = path;
        this.name = name;
        this.time = time;
        this.width = width;
        this.height = height;
    }

    public float getWidthHeightRatio() {
        if (height == 0) {
            return 1;
        }
        return width * 1.00f / (height * 1.00f);
    }

    public int getWidthHeightType() {
        if (getWidthHeightRatio() > 1.1f) {
            return 1;
        }

        if (getWidthHeightRatio() < 0.99f) {
            return -1;
        }

        return 0;
    }

    @Override
    public boolean equals(Object o) {
        try {
            ImageItem other = (ImageItem) o;
            return this.path.equalsIgnoreCase(other.path) && this.time == other.time;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return super.equals(o);
    }

}
