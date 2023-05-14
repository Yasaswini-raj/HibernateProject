package com.it.HybernateDemo;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class AppDao {
	
	public void saveStudentData(Student student) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(student);
		session.getTransaction().commit();
		session.close();
		System.out.println("1 Result Updated.");
	}
	
	public void getStudentData(int id) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.getTransaction().begin();
		Student student = session.get(Student.class, id);
		System.out.println(student.toString());
		session.getTransaction().commit();;
	}
	
	public void getStudentDataBasedonPrimaryKeys() {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.getTransaction().begin();
		Query query = session.createQuery("FROM Student");
		
		
		
		List<Student> students = query.list();
		for(Student student: students) {
			System.out.println(student.getStudentId()+" "+student.getStudentName()+" "+student.getStudentPhoneNumber());
		}
	}

}
