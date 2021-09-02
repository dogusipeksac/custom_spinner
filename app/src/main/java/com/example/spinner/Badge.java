package com.example.spinner;

public class Badge {
    private String title;
    private int badgeImage;

    public Badge(String title, int badgeImage) {
        this.title = title;
        this.badgeImage = badgeImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBadgeImage() {
        return badgeImage;
    }

    public void setBadgeImage(int badgeImage) {
        this.badgeImage = badgeImage;
    }
}
