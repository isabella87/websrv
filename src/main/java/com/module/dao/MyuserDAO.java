package com.module.dao;


import com.module.bean.Myuser;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

@Repository
public class MyuserDAO implements Serializable
{

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public List<Myuser> login(Myuser myuser)
    {

        Session session = sessionFactory.getCurrentSession();
//        session.beginTransaction();

        String sql = " from Myuser as user where user.username='"+myuser.getUsername()+"' and user.password='"+myuser.getPassword() +"'"  ;
        Query query = session.createQuery(sql);
        List<Myuser> list = (List<Myuser>) query.list();

//        session.getTransaction().commit();
//        session.close();

        return list;
    }
}
