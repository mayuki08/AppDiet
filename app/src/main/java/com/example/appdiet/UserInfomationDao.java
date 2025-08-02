package com.example.appdiet;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserInfomationDao {

    @Insert
    void insert(UserInfomationEntry entry);

    @Query("SELECT * FROM UserInfomationEntry ORDER BY id DESC LIMIT 1")
    UserInfomationEntry getLatest();
}

