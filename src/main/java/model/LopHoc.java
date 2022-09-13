/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 *
 * @author Acer
 */
@Entity
@Table(name = "lop_hoc")
public class LopHoc implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_lop")
    private int malop;
    @Column(name = "ten_lop")
    private String tenlop;
    @OneToMany(mappedBy = "lophoc")
    private List<SinhVien> sv;

    public LopHoc() {
    }

    public LopHoc(String tenlop) {
        this.tenlop = tenlop;
      
    }
   public int getMalop() {
        return malop;
    }

    public void setMalop(int malop) {
        this.malop = malop;
    }
    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    /**
     * @return the sv
     */
    public List<SinhVien> getSv() {
        return sv;
    }

    /**
     * @param sv the sv to set
     */
    public void setSv(List<SinhVien> sv) {
        this.sv = sv;
    }

 

}
