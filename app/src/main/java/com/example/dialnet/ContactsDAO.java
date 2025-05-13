package com.example.dialnet;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ContactsDAO { // Data Access Object

    @Insert
    void insert(Contacts contacts); // Insert Command to Database

    @Delete
    void delete(Contacts contacts);  // Delete Command to Database

    @Query("SELECT * FROM contact_table")
    LiveData<List<Contacts>> getAllContacts(); // Show All Contacts
}
