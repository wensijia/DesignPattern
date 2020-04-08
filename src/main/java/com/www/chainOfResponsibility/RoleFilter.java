package com.www.chainOfResponsibility;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.chainOfResponsibility
 * @ClassName: RoleFilter
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/8 21:28
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/8 21:28
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class RoleFilter implements Filter<User> {
    public void doFilter(User user, FilterChain<User> filterChain) {
        if (user.isManager()) {
            System.out.println("管理员您好！");
            filterChain.doFilter(user);
        } else {
            System.out.println("您不是管理员！");
        }
    }
}
