package com.company;
import com.company.Admin;
import org.hibernate.EmptyInterceptor;
import org.hibernate.Transaction;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.util.Iterator;


public class interceptor extends EmptyInterceptor {




    public void onDelete(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        System.out.println("Executing from:  onDelete");

        if(entity instanceof Admin)
        {
            System.out.println("worker with id  :  "+id+"  is deleted");
        }


    }

    public boolean onLoad(Object entity, Serializable id,
                          Object[] state, String[] propertyNames, Type[] types) {
        // do nothing
        return true;
    }




    // This method is called when Employee object gets updated.
    public boolean onFlushDirty(Object entity, Serializable id,
                                Object[] currentState, Object[] previousState, String[] propertyNames,
                                Type[] types) {
        if ( entity instanceof Admin) {
            System.out.println("Update Operation");
            return true;
        }
        return false;
    }



    public boolean onSave(Object entity, Serializable id,
                          Object[] state, String[] propertyNames, Type[] types) {
        if ( entity instanceof Admin ) {
            System.out.println("Create Operation");
            return true;
        }
        return false;
    }

    public void preFlush(Iterator iterator) {

        System.out.println("preFlush");
    }

    //called after committed into database
    public void postFlush(Iterator iterator) {

        System.out.println("postFlush");
    }


    @Override
    public void afterTransactionBegin(Transaction tx) {

        System.out.println("executing : afterTransactionBegin() ");
    }

    @Override
    public void afterTransactionCompletion(Transaction tx) {
        System.out.println("executing : afterTransactionCompletion() ");
    }

    @Override
    public void beforeTransactionCompletion(Transaction tx) {
        System.out.println("executing : beforeTransactionCompletion() ");
    }
}
