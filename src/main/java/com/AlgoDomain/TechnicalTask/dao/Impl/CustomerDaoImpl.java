package com.AlgoDomain.TechnicalTask.dao.Impl;

import com.AlgoDomain.TechnicalTask.dao.CustomerDao;
import com.AlgoDomain.TechnicalTask.model.CustomerModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public Boolean insertCustDataService(CustomerModel customerModel) {
        Session session = null;

        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(customerModel);
            transaction.commit();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
        }
        return false;
    }
}
