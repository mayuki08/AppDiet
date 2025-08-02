package com.example.appdiet;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class UserInfomationEntry {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String username;
    public double weight;
    public double height;
    public double goal;
    public String date;
}
