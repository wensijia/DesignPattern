package com.www.chainOfResponsibility;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.chainOfResponsibility
 * @ClassName: Filter
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/8 21:25
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/8 21:25
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public interface Filter<T> {
    void doFilter(T t, FilterChain<T> filterChain);
}
