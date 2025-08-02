package com.example.appdiet;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {WeightEntry.class}, version = 1)
public abstract class SaveRoom extends RoomDatabase {
    public abstract WeightDao weightDao();
}
