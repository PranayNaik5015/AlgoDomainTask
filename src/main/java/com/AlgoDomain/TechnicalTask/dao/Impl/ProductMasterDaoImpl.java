package com.AlgoDomain.TechnicalTask.dao.Impl;

import com.AlgoDomain.TechnicalTask.dao.ProductMasterDao;
import com.AlgoDomain.TechnicalTask.dto.ProductMasterDto;
import com.AlgoDomain.TechnicalTask.dto.ProductResponseDto;
import com.AlgoDomain.TechnicalTask.model.ProductMasterModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductMasterDaoImpl implements ProductMasterDao {

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public Boolean insertProductDataDao(ProductMasterModel productMasterModel) {

        Session session = null;

        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(productMasterModel);
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

    @Override
    public List getInsertProductDataDao() {

        Session session = null;

        List list = null;

        try {
            session = sessionFactory.openSession();

            Query query = session.createQuery("from ProductMasterModel as product" +
                    " where product.isActive = 'Y'");

            list = query.list();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
        }
        return list;
    }

    @Override
    public Boolean updateProductDataDao(ProductMasterModel productMasterModel) {

        Session session = null;

        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.update(productMasterModel);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public Boolean deleteProductDataByIdDao(Integer id) {
        Session session = null;

        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("delete from ProductMasterModel as product where product.id=:paramId");
            query.setParameter("paramId", id);
            query.executeUpdate();
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

    @Override
    public List<ProductMasterDto> ProductResponseDao(ProductResponseDto productResponseDto) {

        Session session = null;

        List<ProductMasterDto> list = null;

        try {
            session = sessionFactory.openSession();

            Query query = session.createQuery("select product.id as id, product.type as type, product.category as category, product.name as name, product.price as price, product.isActive as isActive " +
                    " from ProductMasterModel as product " +
                    " where product.category=:category and product.type=:type and product.price between :startprice and :endprice ");
            query.setParameter("category",productResponseDto.getCategory());
            query.setParameter("type",productResponseDto.getType());
            query.setParameter("startprice",productResponseDto.getStartprice());
            query.setParameter("endprice",productResponseDto.getEndprice());
            query.setResultTransformer(Transformers.aliasToBean(ProductMasterDto.class));

            list = query.list();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
        }
        return list;
    }

    @Override
    public Boolean productStatusByIdDao(Integer id) {

        Session session = null;

        ProductMasterDto productMasterDto = null;

        try{

            session = sessionFactory.openSession();

            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery(" update ProductMasterModel as product set product.isActive='N' " +
                    " where product.id=:paramId ");

            query.setParameter("paramId" , id);

            query.executeUpdate();

            transaction.commit();

            return true;

        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
        }
        return false;
    }
}
