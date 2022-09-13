/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import model.LopHoc;
import model.SinhVien;
import org.hibernate.Session;
import repository.Hibernate;
import repository.Hibernate;
import service.svInterface;

/**
 *
 * @author Acer
 */
public class implSinhVien implements svInterface {

    @Override
    public void Insert(SinhVien sv) {
        Session session = Hibernate.getFACTORY().openSession();
        SinhVien sinhvien = new SinhVien();
       
        sinhvien.setHoten(sv.getHoten());
        sinhvien.setDiachi(sv.getDiachi());
        sinhvien.setLophoc(sv.getLophoc());
        session.save(sinhvien);
        session.close();
    }

    @Override
    public void Update(SinhVien sv, int ma) {
        Session session = Hibernate.getFACTORY().openSession();
        
        SinhVien sinhvien = session.get(SinhVien.class, ma);
        sinhvien.setHoten(sv.getHoten());
        sinhvien.setDiachi(sv.getDiachi());
        sinhvien.setLophoc(sv.getLophoc());
        session.getTransaction().begin();
        session.save(sinhvien);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void Delete(int ma) {
        Session session = Hibernate.getFACTORY().openSession();
        SinhVien sv = session.get(SinhVien.class, ma);
        session.getTransaction().begin();
        session.delete(sv);
        session.getTransaction().commit();
        session.close();
    }
    @Override
    public LopHoc getByID(int ma) {
        Session session = Hibernate.getFACTORY().openSession();
        LopHoc lopHoc = new LopHoc();
        lopHoc = session.get(LopHoc.class, ma);
        session.close();
        return lopHoc;
    }
    @Override
    public List<SinhVien> getList() {
        Session session = Hibernate.getFACTORY().openSession();
        Query query = session.createQuery("From SinhVien ");
        List<SinhVien> list = query.getResultList();
        session.close();
        return list;

    }

    @Override
    public List<SinhVien> getListSearch(int ma) {
        Session session  = Hibernate.getFACTORY().openSession();
        SinhVien sv = new SinhVien();
        
        Query query = session.createQuery("from SinhVien sv where  sv.lophoc.malop = "+ma);
        List<SinhVien> list  = query.getResultList();
        session.close();
        return list;
       
                
                }

    

}
