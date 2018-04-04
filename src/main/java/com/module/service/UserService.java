package com.module.service;

import com.module.bean.Myuser;
import com.module.dao.MyuserDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserService
{
    @Resource
    private MyuserDAO myuserDao;

    public MyuserDAO getMyuserDao() {
        return this.myuserDao;
    }

    public void setMyuserDao(MyuserDAO myuserDao) {
        this.myuserDao = myuserDao;
    }

    public boolean login(Myuser myuser)
    {
        List<Myuser> list = this.myuserDao.login(myuser);
        if(list.size()==0){
            return false;
        }
        else{
            return true;
        }
    }
}
