/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.LopHoc;
import model.SinhVien;

/**bn 
 *
 * @author Acer
 */
public interface svInterface {
        public List<SinhVien> getList();
        public List<SinhVien> getListSearch(int ma);
        public void Insert(SinhVien sv);
        public void Update(SinhVien sv,int ma);
        public void Delete(int ma);
        public LopHoc getByID(int ma);
                 
    
}
