package com.company;

import org.hibernate.*;


public class SaveOrUpdate {
    public static void main(String [] args)
    {
        ConnectdatabaseString conn = new ConnectdatabaseString();

        SessionFactory mainFuncFactory=conn.getConnectionfactory();
        Session sessions = mainFuncFactory.getCurrentSession();

        try
        {
            sessions.beginTransaction();
            System.out.println("updating admin with ID 2");

            int adminId=1;
            Admin updateAdmin =sessions.get(Admin.class, adminId);

            updateAdmin.setAdminEmail("goldAdmin@accenture.com");
            updateAdmin.setAdminLastname("patricia");
            updateAdmin.setAdminPasword("12345");
            updateAdmin.setAdminname("mbape");

            sessions.saveOrUpdate(updateAdmin);
            sessions.getTransaction().commit();
            System.out.println("Done updating or inserting record");



        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally {
            mainFuncFactory.close();
        }
    }
}
