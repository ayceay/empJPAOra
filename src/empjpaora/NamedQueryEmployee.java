/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empjpaora;

import com.empjpaora.entities.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



/**
 *
 * @author Administrator
 */
public class NamedQueryEmployee {
    
    public static void main(String[] args) {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmpJPAOraPU");
        EntityManager em = emf.createEntityManager();
        
        Query query = em.createNamedQuery("findBySalary");
        query.setParameter("maas", 183.4);
        List<Employee> aList = query.getResultList();
        for (Employee aList1 : aList) {
            System.out.println(aList1);
        }
        
        em.close();
        emf.close();
    }
        
        
       
       
        
        
    
}
