package com.evilcorporation.employeetimeclock.hours;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import com.evilcorporation.employeetimeclock.R;
import com.evilcorporation.employeetimeclock.ui.login.LoginViewModel;
import com.evilcorporation.employeetimeclock.ui.login.LoginViewModelFactory;

public class hours {
    private int hour;
    private int minute;
    private int second;
    public hours (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    /*public Time(long time) {
        LocalDateTime now = LocalDateTime.now();


    }
    public int getDate() {
        LocalDateTime now = LocalDateTime.now();
    }
    //public static void main(String[] args) {
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
       // LocalDateTime now = LocalDateTime.now();
        //System.out.println(dtf.format(now));


     */
}
