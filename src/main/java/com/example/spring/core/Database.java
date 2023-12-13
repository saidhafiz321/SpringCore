package com.example.spring.core;

public class Database {
    
    private static Database database;

    public static Database getInstance(){
        if(database == null){                  //jika database kosong maka akan membuat database baru
            database = new Database();         //jika database tidak kosong maka tampilkan database
        }
        return database;
    }

    private Database(){

    }
}
