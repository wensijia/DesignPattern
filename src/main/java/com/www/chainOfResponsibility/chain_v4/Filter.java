package com.www.chainOfResponsibility.chain_v4;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.chainOfResponsibility
 * @ClassName: Filter
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/8 20:27
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/8 20:27
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public interface Filter {
    boolean doFilter(Request request, Response response, FilterChain chain);
}
