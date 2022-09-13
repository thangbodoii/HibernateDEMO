/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repository;

import java.util.List;
import javax.persistence.Query;
import model.LopHoc;
import model.SinhVien;
import org.hibernate.Session;

/**
 *
 * @author Acer
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Session session = Hibernate.getFACTORY().openSession();
//        
//        LopHoc lop = new LopHoc();
//        lop.setTenlop("lop 1");
//        session.save(lop);
//        session.close();
//        Session session = Hibernate.getFACTORY().openSession();
//        LopHoc lop = session.get(LopHoc.class, 2);
//        lop.setTenlop("asdae");
//        session.getTransaction().begin();
//        session.save(lop);
//        session.getTransaction().commit();
//        session.close();
//        LopHoc lopHoc = new LopHoc();
//        try (
//                Session session = Hibernate.getFACTORY().openSession()) {
//            lopHoc = session.get(LopHoc.class, 1);
//        } catch (Exception e) {
//        }
//        System.out.println(lopHoc.toString());
        Session session  = Hibernate.getFACTORY().openSession();
        SinhVien sv = new SinhVien();
        
        Query query = session.createQuery("from LopHoc  where  ");
        List<LopHoc> list  = query.getResultList();
        session.close();
        for (LopHoc lopHoc : list) {
            System.out.println(lopHoc.getMalop()+lopHoc.getTenlop()+lopHoc.getSv());
        }
    }
    }
    

