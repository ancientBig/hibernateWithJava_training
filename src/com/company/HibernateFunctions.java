package com.company;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;

import java.util.List;


public class HibernateFunctions {

    private interceptor myin;

    private ConnectdatabaseString conn = new ConnectdatabaseString();

    private SessionFactory mainFuncFactory=conn.getConnectionfactory();
    private Session sessions = mainFuncFactory.getCurrentSession();


    /* Method to CREATE an Admin in the database */
    public void addAdmin(String fname, String lname, String email,String password){


         sessions = mainFuncFactory.withOptions().interceptor(new interceptor()).openSession();

        Transaction trans = null;
        Integer adminId = null;

        try {
            trans = sessions.beginTransaction();
            Admin newAdmin = new Admin(fname,lname,email,password);/////////////////////////
            adminId = (Integer) sessions.save(newAdmin);
            trans.commit();
        } catch (HibernateException e) {
            if (trans!=null) trans.rollback();
            e.printStackTrace();
        } finally {
            sessions.close();
        }

    }


    /* Method to  READ all the Admin */
    public void listAllAmin( ){
        Session session =  mainFuncFactory.withOptions().interceptor(new interceptor()).openSession();
        Transaction trans = null;

        try {
            trans = session.beginTransaction();
            List<Admin> listAdminsDb = session.createQuery("from Admin").list();
            for (Admin tempAdmin : listAdminsDb){
                Admin employee =  tempAdmin;
                System.out.println(tempAdmin);

            }
            trans.commit();
        } catch (HibernateException e) {
            if (trans!=null) trans.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


    /* Method to UPDATE email for an Admin */
    public void updateAdmin(int adminID, String e_mail ){
        Session session = mainFuncFactory.withOptions().interceptor(new interceptor()).openSession();
        Transaction trans = null;

        try {
            trans = session.beginTransaction();
            Admin employee = (Admin)session.get(Admin.class, adminID);
            employee.setAdminEmail( e_mail );
            session.update(employee);
            trans.commit();
        } catch (HibernateException e) {
            if (trans!=null) trans.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


    /* Method to DELETE an admin from the records */
    public void deleteAdmin(int adminID){
        Session session = mainFuncFactory.withOptions().interceptor(new interceptor()).openSession();
        Transaction trans = null;

        try {
            trans = session.beginTransaction();
            Admin tempAdmin = (Admin)session.get(Admin.class, adminID);
            session.delete(tempAdmin);
            trans.commit();
        } catch (HibernateException e) {
            if (trans!=null) trans.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }



}
