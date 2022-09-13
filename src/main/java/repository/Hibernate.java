/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repository;

import java.util.Properties;
import model.LopHoc;
import model.MonHoc;
import model.SinhVien;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Acer
 */
public class Hibernate {

    private static final SessionFactory FACTORY;
    static{
        Configuration conf = new Configuration();
        
        Properties prop = new Properties();
        prop.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        prop.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        prop.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=hibernateDemo");
        prop.put(Environment.USER, "sa");
        prop.put(Environment.PASS, "0868975265t");
        prop.put(Environment.SHOW_SQL, "true");
        
        
        conf.setProperties(prop);
        conf.addAnnotatedClass(LopHoc.class);
        conf.addAnnotatedClass(MonHoc.class);
        conf.addAnnotatedClass(SinhVien.class);
        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);
        
    }
    
    /**
     * @return the FACTORY
     */
    public static SessionFactory getFACTORY() {
        return FACTORY;
    }
    
    
    
}
