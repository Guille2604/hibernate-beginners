
package com.research24x7.hibernate.beginners.test;


import java.util.Date;
import java.util.List;

import com.research24x7.hibernate.beginners.entity.Employee;
import com.research24x7.hibernate.beginners.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HibernateAnnotationTest {


    private static SessionFactory sessionFactory;

    private static final Logger logger = LoggerFactory.getLogger (HibernateAnnotationTest.class);


    public HibernateAnnotationTest () {

        super ();
    }


    @BeforeAll
    public static void setup () {

        sessionFactory = HibernateUtil.getSessionFactory ();
    }

    @AfterAll
    public static void destroy () {

        sessionFactory.close ();
    }


    @Test
    @DisplayName ("Create New Records")
    public void m1 () {
        Employee e = new Employee();

    }


}