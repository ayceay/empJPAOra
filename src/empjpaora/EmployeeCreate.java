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
public class EmployeeCreate {
    
    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("EmpJPAOraPU");
        EntityManager em = emfactory.createEntityManager();
        
        em.getTransaction().begin();
        Employee emp1 = new Employee();
        //emp1.setEid(1);
        emp1.setEname("murat2");
        emp1.setSalary(183.4);
        emp1.setDegree("Emekli");
        
        em.persist(emp1);
        
        em.getTransaction().commit();
        
        em.close();
        emfactory.close();
    }
    
}
