/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Acer
 */
@Entity
@Table(name = "sinh_vien")
public class SinhVien implements Serializable{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ma_sinh_vien")
        private int masv;
        @Column(name = "ho_ten")
        private String hoten;
        @Column(name = "dia_chi")
        private String diachi;
        @ManyToOne
        @JoinColumn(name = "ma_lop")
        private LopHoc  lophoc;

    public SinhVien() {
    }
    
    public SinhVien(String hoten, String diachi,LopHoc lopHoc) {

        this.hoten = hoten;
        this.diachi = diachi;
        this.lophoc = lopHoc;
        
      
      
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    /**
     * @return the lophoc
     */
    public LopHoc getLophoc() {
        return lophoc;
    }

    /**
     * @param lophoc the lophoc to set
     */
    public void setLophoc(LopHoc lophoc) {
        this.lophoc = lophoc;
    }
   
   

    
    

    
        
        
    
}
