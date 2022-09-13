/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import javax.persistence.Query;
import model.MonHoc;
import org.hibernate.Session;
import repository.Hibernate;
import repository.Hibernate;
import service.MonHocInterface;

/**
 *
 * @author Acer
 */
public class implMonHoc implements MonHocInterface{
    List<MonHoc> ds;
    @Override
    public List<MonHoc> getList() {
        Session session = Hibernate.getFACTORY().openSession();
        Query query = session.createQuery("From MonHoc");
        List<MonHoc> list = query.getResultList();
        session.close();
        return list;
    }

    @Override
    public void Insert(MonHoc monhoc) {
        Session session = Hibernate.getFACTORY().openSession();
        MonHoc mh = new MonHoc();
        mh.setTenmon(monhoc.getTenmon());
        session.save(mh);
        session.close();
         
        
    }

    @Override
    public void Update(MonHoc monhoc, int ma) {
        Session session = Hibernate.getFACTORY().openSession();
        MonHoc mh = session.get(MonHoc.class, ma);
        mh.setTenmon(monhoc.getTenmon());
        session.getTransaction().begin();
        session.save(mh);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void Delete(int ma) {
        Session session = Hibernate.getFACTORY().openSession();
        
        MonHoc mh = session.get(MonHoc.class, ma);
        session.getTransaction().begin();
        session.delete(mh);
        session.getTransaction().commit();
        session.close();
        
    }
    
    
}
