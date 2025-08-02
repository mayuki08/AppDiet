package com.example.appdiet;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class WeightEntry {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public float weight;

    public String date;
}