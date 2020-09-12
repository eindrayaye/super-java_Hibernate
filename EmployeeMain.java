import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class EmployeeMain 
    {
			public static void main(String args[])
	     {
			SessionFactory fact=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
			Session ses=fact.openSession();
			Transaction tx=ses.beginTransaction();
			
			Employee e=new Employee();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter your Employee ID: ");
	        e.setEmpid(sc.nextInt());
			//e.setEmpid(1001);
	        System.out.println("Enter your name: ");
	        e.setEmpname(sc.next());
			//e.setEmpname("Namita");
	        System.out.println("Salary: ");
	        e.setSalary(sc.nextDouble());
			//e.setSalary(23433.33);
	        System.out.println("Enter your address: ");
	        e.setAddress(sc.next());
			//e.setAddress("USA");
			ses.save(e);
			tx.commit();
			System.out.println("Data saved in the Database");

	      }
}
