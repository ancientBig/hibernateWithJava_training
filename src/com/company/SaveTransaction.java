package com.company;
import org.hibernate.*;


public class SaveTransaction {

    public static void main(String [] args)

    {
        ConnectdatabaseString conn = new ConnectdatabaseString();

        SessionFactory mainFuncFactory = conn.getConnectionfactory();
        Session sessions = mainFuncFactory.getCurrentSession();
        Transaction tranSec = sessions.getTransaction();


        try {
            tranSec.begin();

            System.out.println("refreshing the record ");

            int adminId = 3;
            Admin updateAdmin = sessions.load(Admin.class, adminId);
            sessions.refresh(updateAdmin);

            updateAdmin.setAdminname("madagarscar");

            tranSec.commit();

            System.out.println("Done with record");


        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            mainFuncFactory.close();
            sessions.close();
        }

    }
}
