package com.company;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

//class used to connect to the database
public class ConnectdatabaseString {

    private SessionFactory Connectionfactory;

    public ConnectdatabaseString() {
        Connectionfactory= new Configuration().configure("ConfigDir/hibernate.cfg.xml").addAnnotatedClass(Admin.class).buildSessionFactory();
    }

    //get method for the connection
    public SessionFactory getConnectionfactory() {
        return Connectionfactory;
    }
}
