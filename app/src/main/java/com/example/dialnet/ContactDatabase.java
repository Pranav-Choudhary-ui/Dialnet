package com.example.dialnet;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Contacts.class},version = 1)
public abstract class ContactDatabase extends RoomDatabase {

    public abstract ContactsDAO getContactDAO();

    private static ContactDatabase dbInstance; // Singleton Pattern or Instance is created

    //Method for creating Database
    public static synchronized ContactDatabase getInstance(Context context){

        if(dbInstance == null){
            dbInstance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    ContactDatabase.class,
                    "contacts_db").fallbackToDestructiveMigration().build();
        }
        return dbInstance;
    }
}
