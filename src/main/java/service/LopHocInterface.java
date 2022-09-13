/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.LopHoc;

/**
 *
 * @author Acer
 */
public interface LopHocInterface {
    public List<LopHoc> getList();
    public LopHoc findLop(int ma);
    public void Insert(LopHoc lophoc);
    public void Update(LopHoc lophoc,int ma);
    public void Delete(int ma);
    
}

