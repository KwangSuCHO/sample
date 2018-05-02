package com.example.study4;

/**
 * Created by Win7 on 2018-04-28.
 */

public class FriendList {
    private int profile;
    private String name;
    private String textBox;

    public FriendList(int profile, String name, String textBox){
        this.profile = profile;
        this.name = name;
        this.textBox = textBox;
    }

    public String getName() {
        return name;
    }

    public int getProfile() {
        return profile;
    }

    public String getTextBox() {
        return textBox;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTextBox(String textBox) {
        this.textBox = textBox;
    }
}
