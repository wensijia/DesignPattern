package com.www.chainOfResponsibility;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.chainOfResponsibility
 * @ClassName: LoginFilter
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/8 21:27
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/8 21:27
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class LoginFilter implements Filter<User> {
    public void doFilter(User user, FilterChain filterChain) {
        if (user.isLogin()) {
            System.out.println("欢迎您！");
            filterChain.doFilter(user);
        } else {
            System.out.println("您尚未登录！");
        }
    }
}
