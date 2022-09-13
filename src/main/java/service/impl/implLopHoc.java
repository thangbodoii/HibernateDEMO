/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import model.LopHoc;
import org.hibernate.Session;
import repository.Hibernate;
import repository.Hibernate;
import service.LopHocInterface;


public class implLopHoc implements LopHocInterface{
    List<LopHoc> ds;

    @Override
    public List<LopHoc> getList() {
        
        Session session = Hibernate.getFACTORY().openSession();
        Query query = session.createQuery("FROM  LopHoc");//hql
        List<LopHoc> list = query.getResultList();
        session.close();
        return list;
    }

    @Override
    public LopHoc findLop(int ma) {
        
   
           LopHoc lopHoc = new LopHoc();
           Session session = Hibernate.getFACTORY().openSession();
           lopHoc = session.get(LopHoc.class, ma);
           
           session.close();
         return lopHoc;
    
    }

    @Override
    public void Insert(LopHoc lophoc) {
        Session session = Hibernate.getFACTORY().openSession();
        LopHoc lop = new LopHoc();
        lop.setTenlop(lophoc.getTenlop());
        session.save(lop);
        session.close();
    }

    @Override
    public void Update(LopHoc lophoc, int ma) {
        Session session = Hibernate.getFACTORY().openSession();
        LopHoc lop = session.get(LopHoc.class, ma);
        lop.setTenlop(lophoc.getTenlop());
        session.getTransaction().begin();
        session.save(lop);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void Delete(int ma) {
        Session session = Hibernate.getFACTORY().openSession();
        
        LopHoc lop = session.get(LopHoc.class, ma);
        session.getTransaction().begin();
        session.delete(lop);
        session.getTransaction().commit();
        
        session.close();
        
        
    }
    
}
