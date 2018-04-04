package com.module.action;

import com.module.bean.Myuser;
import com.module.service.UserService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import javax.annotation.Resource;

@Results({ @Result(name="success", location="/result.jsp"),
                 @Result(name="error",location="/error.jsp") })
public class LoginAction extends baseAction
{

    private Myuser myuser;

    @Resource
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public Myuser getMyuser() {
        return myuser;
    }
    public void setMyuser(Myuser myuser) {
        this.myuser = myuser;
    }

    @Override
    @Action(value="login")
    public String execute() throws Exception {

        if(this.userService.login(myuser)){
            return SUCCESS;
        }

        return ERROR;
    }
}
