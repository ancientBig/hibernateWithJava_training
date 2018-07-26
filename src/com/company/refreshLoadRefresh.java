package com.company;
import org.hibernate.*;


public class refreshLoadRefresh {

    public static void main(String [] args)

    {
        ConnectdatabaseString conn = new ConnectdatabaseString();

        SessionFactory mainFuncFactory = conn.getConnectionfactory();
        Session sessions = mainFuncFactory.getCurrentSession();


        try {
            sessions.beginTransaction();
            System.out.println("refreshing the record ");

            int adminId = 1;
            Admin updateAdmin = sessions.get(Admin.class, adminId);
            sessions.refresh(updateAdmin);

            System.out.println(updateAdmin);

            sessions.getTransaction().commit();

            System.out.println("Done with record");


        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            mainFuncFactory.close();
        }

    }

}
