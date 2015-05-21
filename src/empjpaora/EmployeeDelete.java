/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empjpaora;

import com.empjpaora.entities.Employee;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Administrator
 */
public class EmployeeDelete {
    
    public static void main(String[] args) {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmpJPAOraPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Employee emp1 = em.find(Employee.class,51);
         System.out.println(emp1);
        em.remove(emp1);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
