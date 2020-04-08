package com.www.chainOfResponsibility.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.chainOfResponsibility
 * @ClassName: FilterChain
 * @Description: 链式拦截
 * @Author: wensijia
 * @CreateDate: 2020/4/8 20:31
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/8 20:31
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<Filter>();

    public FilterChain add(Filter f) {
        filters.add(f);
        return this;
    }

    public boolean doFilter(Request request) {
        for(Filter f : filters ){
            f.doFilter(request);
        }
        return true;
    }
}
