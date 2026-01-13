package com.test;

import java.util.Date;

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
        
        Student1st s1=new Student1st();
        s1.setStudentId(1244);
        s1.setStudentAge(23);
        s1.setStudentName("Mohsin khan");
        s1.setStudentAddress("Mumbai Sakinaka Kaju pada");
        
        Student1st s2=new Student1st();
        s2.setStudentId(1245);
        s2.setStudentAge(22);
        s2.setStudentName("Raiyyan khan");
        s2.setStudentAddress("Uttar Pradesh Semariyawan");
        
        Student1st s3=new Student1st();
        s3.setStudentId(1246);
        s3.setStudentAge(25);
        s3.setStudentName("Zuhaib khan");
        s3.setStudentAddress("Mumbai Sakinaka Wajid Ali compound");
        
        Student1st s4=new Student1st();
        s4.setStudentId(1247);
        s4.setStudentAge(19);
        s4.setStudentName("Faheem khan");
        s4.setStudentAddress("Uttar pradesh Mahuari sant kabir nagar");
        
        Student1st s5=new Student1st();
        s5.setStudentId(1248);
        s5.setStudentAge(20);
        s5.setStudentName("Hashim Ansari");
        s5.setStudentAddress("Mumbai sakinaka Wajid Ali compound ");
        
        Student1st s6=new Student1st();
        s6.setStudentId(1249);
        s6.setStudentAge(17);
        s6.setStudentName("Rani Ansari");
        s6.setStudentAddress("Nallasopara east Maharastra");

		/* Certificate Class Object */
        
        Certificate1st c1=new Certificate1st();
        c1.setStudentName("Suhaib Ansari");
        c1.setCertiNo(7);
        c1.setDate(new Date());
        c1.setCertiName("Software Developer");
        c1.setCourse("Full Stack Java Developer");
        
        Certificate1st c2=new Certificate1st();
        c2.setStudentName("Hashim Ansari");
        c2.setCertiNo(8);
        c2.setDate(new Date());
        c2.setCertiName("Software Developer");
        c2.setCourse("Full Stack Java Developer");
        
        Certificate1st c3=new Certificate1st();
        c3.setCertiName("Salim Ansari");
        c3.setCertiNo(9);
        c3.setDate(new Date());
        c3.setCertiName("Software Developer");
        c3.setCourse("Full Stack Java Developer");
        
        Certificate1st c4=new Certificate1st();
        c4.setStudentName("Asim Ansari");
        c4.setCertiNo(10);
        c4.setDate(new Date());
        c4.setCertiName("Software Developer");
        c4.setCourse("Full Stack Java Developer");
        
        Certificate1st c5=new Certificate1st();
        c5.setStudentName("Qasim Ansari");
        c5.setCertiNo(11);
        c5.setDate(new Date());
        c5.setCertiName("Software Developer");
        c5.setCourse("Full Stack Java Developer");
        
        Certificate1st c6=new Certificate1st();
        c6.setStudentName("Tahir Ansari");
        c6.setCertiNo(12);
        c6.setDate(new Date());
        c6.setCertiName("Software Developer");
        c6.setCourse("Full Stack Java Developer");
      
        session.persist(c1);
        session.persist(c2);
        session.persist(c3);
        session.persist(c4);
        session.persist(c5);
        session.persist(c6);
        
        session.persist(s1);
        session.persist(s2);
        session.persist(s3);
        session.persist(s4);
        session.persist(s5);
        session.persist(s6);
        
        tx.commit();
        session.close();
        factory.close();

        System.out.println("Data inserted successfully ✅✅");
    }
}
