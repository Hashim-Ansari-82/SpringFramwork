package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("com/test/hiber.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

		/* Student Class Object */
        
        Student s1=new Student();
        s1.setStudentId(1244);
        s1.setStudentAge(23);
        s1.setStudentName("Mohsin khan");
        s1.setStudentAddress("Mumbai Sakinaka Kaju pada");
        
        Student s2=new Student();
        s2.setStudentId(1245);
        s2.setStudentAge(22);
        s2.setStudentName("Raiyyan khan");
        s2.setStudentAddress("Uttar Pradesh Semariyawan");
        
        Student s3=new Student();
        s3.setStudentId(1246);
        s3.setStudentAge(25);
        s3.setStudentName("Zuhaib khan");
        s3.setStudentAddress("Mumbai Sakinaka Wajid Ali compound");
        
        Student s4=new Student();
        s4.setStudentId(1247);
        s4.setStudentAge(19);
        s4.setStudentName("Faheem khan");
        s4.setStudentAddress("Uttar pradesh Mahuari sant kabir nagar");
        
        Student s5=new Student();
        s5.setStudentId(1248);
        s5.setStudentAge(20);
        s5.setStudentName("Hashim Ansari");
        s5.setStudentAddress("Mumbai sakinaka Wajid Ali compound ");
        
        Student s6=new Student();
        s6.setStudentId(1249);
        s6.setStudentAge(17);
        s6.setStudentName("Rani Ansari");
        s6.setStudentAddress("Nallasopara east Maharastra");

		/* Certificate Class Object */
        
        Certificate c1=new Certificate();
        c1.setCertiNo(987655);
        c1.setCertiName("Software Developer");
        c1.setCourse("Full Stack Java Developer");
        
        Certificate c2=new Certificate();
        c2.setCertiNo(987656);
        c2.setCertiName("Software Developer");
        c2.setCourse("Full Stack Java Developer");
        
        Certificate c3=new Certificate();
        c3.setCertiNo(987657);
        c3.setCertiName("Software Developer");
        c3.setCourse("Full Stack Java Developer");
        
        Certificate c4=new Certificate();
        c4.setCertiNo(987658);
        c4.setCertiName("Software Developer");
        c4.setCourse("Full Stack Java Developer");
        
        Certificate c5=new Certificate();
        c5.setCertiNo(987659);
        c5.setCertiName("Software Developer");
        c5.setCourse("Full Stack Java Developer");
        
        Certificate c6=new Certificate();
        c6.setCertiNo(987660);
        c6.setCertiName("Software Developer");
        c6.setCourse("Full Stack Java Developer");
        
        s1.setCert(c1);
        s2.setCert(c2);
        s3.setCert(c3);
        s4.setCert(c4);
        s5.setCert(c5);
        s6.setCert(c6);
        
        session.persist(s1);
        session.persist(s2);
        session.persist(s3);
        session.persist(s4);
        session.persist(s5);
        session.persist(s6);
        
//        session.persist(c1);
//        session.persist(c2);
//        session.persist(c3);
//        session.persist(c4);
//        session.persist(c5);
        
        tx.commit();
        session.close();
        factory.close();

        System.out.println("Data inserted successfully ✅✅");
    }
}
