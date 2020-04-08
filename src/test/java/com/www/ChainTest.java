package com.www;

import com.www.chainOfResponsibility.*;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www
 * @ClassName: ChainTest
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/8 21:32
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/8 21:32
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class ChainTest {

    public static void main(String[] args) throws InterruptedException {
        User user1 = new User("wen", false, false),
                user2 = new User("jia", true, false),
                user3 = new User("www", false, true),
                user4 = new User("w", true, true);

        Filter<User> loginFilter = new LoginFilter(),
                roleFilter = new RoleFilter();

        FilterChain<User> filterChain = new FilterChain<>();
        filterChain.addFilter(loginFilter).addFilter(roleFilter);

        new Thread(() -> filterChain.doFilter(user1)).start();
        Thread.sleep(500);
        System.out.println("-----------------");

        new Thread(() -> filterChain.doFilter(user2)).start();
        Thread.sleep(500);
        System.out.println("-----------------");

        new Thread(() -> filterChain.doFilter(user3)).start();
        Thread.sleep(500);
        System.out.println("-----------------");

        new Thread(() -> filterChain.doFilter(user4)).start();

    }

}
