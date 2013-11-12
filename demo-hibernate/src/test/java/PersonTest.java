import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.keep.model.Product;
import com.keep.util.HibernateUtil;


@RunWith(JUnit4.class)
public class PersonTest {
	
	@BeforeClass
	public static void init() {
		Product p = new Product();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		//p.setId(1L);
		Transaction t=session.beginTransaction();
		p.setName("ABC");
		p.setBrand("");
		session.save(p);
		t.commit();
	}
	@Test
	public void testVersion() {
     	SessionFactory sf = HibernateUtil.getSessionFactory();
     	Session session1 = sf.openSession();
//     	List<Product> ls = session1.createQuery("from Product").list();
//     	for(Product p:ls) {
//     		System.out.println(p.getId());
//     	}
     	Product p1 = (Product)session1.createQuery("from Product").uniqueResult();
     	Session session2 = sf.openSession();
     	Product p2 = (Product)session2.createQuery("from Product").uniqueResult();
     	System.out.println("P1 : " + p1.getVersion());
     	System.out.println("P2 : " + p2.getVersion());
     	
     	Transaction t1=session1.beginTransaction();
     	p1.setName("p1");
     	session1.update(p1);
     	t1.commit();
     	System.out.println("P1 : " + p1.getVersion());
     	
     	Transaction t2=session2.beginTransaction();
     	p2.setName("p2");
     	session2.update(p2);
     	t2.commit();
     	System.out.println("P2 : " + p2.getVersion());
	}
	@Test
	public void testFind() {
		 ExecutorService service = Executors.newFixedThreadPool(3);
		 for (int i = 0; i < 10; i++) {
//	            System.out.println("创建线程" + i);
//	            Runnable run = new Runnable() {
//	                @Override
//	                public void run() {
//	                	SessionFactory sf = HibernateUtil.getSessionFactory();
//	                	Session session = sf.openSession();
//	                	Product p = (Product) session.get(Product.class, 1L);
//	                	p.setName(Thread.currentThread().getName());
//	                	session.update(p);
//	                    System.out.println("启动线程");
//	                }
//	            };
//	            service.execute(run);
	    }
	}
	
	@AfterClass
	public static void  after() {
		Product p = new Product();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction t=session.beginTransaction();
		session.createQuery("delete from Product").executeUpdate();
		t.commit();
	}
}
