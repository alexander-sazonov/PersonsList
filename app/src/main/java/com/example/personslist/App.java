package com.example.personslist;

import android.app.Application;

public class App extends Application {
    private final  PersonService service = new PersonService();
    public PersonService getPersonService(){
        return service;
    }

}
