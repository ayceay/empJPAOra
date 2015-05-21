/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empjpaora;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



/**
 *
 * @author Administrator
 */
public class EmployeeOwnQuery {
    
    public static void main(String[] args) {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmpJPAOraPU");
        EntityManager em = emf.createEntityManager();
        
        Query query = em.createQuery("select UPPER(e.ename) from Employee e");
        List<String> aList = query.getResultList();
        for (String aList1 : aList) {
            System.out.println(aList1);
        }
    }
        
        
       
       
        
        
    
}
