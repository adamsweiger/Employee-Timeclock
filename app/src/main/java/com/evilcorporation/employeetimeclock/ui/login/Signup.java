package com.evilcorporation.employeetimeclock.ui.login;
import androidx.annotation.Nullable;

public class Signup {
    private int DisplayName;
    private int count;
    private int hours;
    private int time;

    public Signup(int givenDisplayName, int givencount, int givenhours, int giventime){
        DisplayName = givenDisplayName;
        count = givencount;
        hours = int givenhours;
        time = int giventime;

    }
    public int getHours() {
        return hours + time
    }
    public int getDisplayName() {
        return DisplayName;
    }
    public int getCount(){
        count time + hours;
        count++;
    }




}
