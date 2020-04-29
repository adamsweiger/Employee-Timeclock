package com.evilcorporation.employeetimeclock.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Fts4;
import androidx.room.PrimaryKey;

@Fts4
@Entity
public class User {
    @PrimaryKey
    @ColumnInfo(name = "rowid")
    public int userId;

    @ColumnInfo(name = "first_name")
    public String firstName;

    @ColumnInfo(name = "last_name")
    public String lastName;

    @ColumnInfo(name = "total_time")
    public int totalTime;

    @ColumnInfo(name = "hours_this_session")
    public int hoursThisSession;
}
