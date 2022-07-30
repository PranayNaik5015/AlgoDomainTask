package com.AlgoDomain.TechnicalTask.dao.Impl;

import com.AlgoDomain.TechnicalTask.dao.SellerDao;
import com.AlgoDomain.TechnicalTask.model.SellerModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SellerDaoImpl implements SellerDao {

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public Boolean postSellerDataDao(SellerModel sellerModel) {

        Session session = null;

        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(sellerModel);
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
