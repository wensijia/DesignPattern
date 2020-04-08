package com.www.chainOfResponsibility;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.chainOfResponsibility
 * @ClassName: User
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/8 21:28
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/8 21:28
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class User {
    private String name;

    private boolean isLogin;

    private boolean isManager;

    public User(String name, boolean isLogin, boolean isManager) {
        super();
        this.name = name;
        this.isLogin = isLogin;
        this.isManager = isManager;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }
}
