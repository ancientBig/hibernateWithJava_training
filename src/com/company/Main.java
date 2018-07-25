package com.company;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ConnectdatabaseString conn = new ConnectdatabaseString();

        SessionFactory mainFuncFactory=conn.getConnectionfactory();
        Session sessions = mainFuncFactory.getCurrentSession();

        try
        {
            Admin newAdmin = new Admin("mpuse","Monareng","mpuse@accenture.com","m912");

            sessions.beginTransaction();
            System.out.println("I have inserted a new admin into your database..");
            sessions.save(newAdmin);
            sessions.getTransaction().commit();

            System.out.println("done..");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        finally
        {
            mainFuncFactory.close();
            conn = null;
        }
    }
}
