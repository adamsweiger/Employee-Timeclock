package com.evilcorporation.employeetimeclock.hours;

public class paycheck {

    private long hours = 0;
    private long payWage = 0;
    private long pay = 0;

    public paycheck(long hoursWorked, long wage) {
        hours = hoursWorked;
        payWage = wage;
    }

    public long totalPay() {
        pay = hours * payWage;
        return pay;
    }

}
