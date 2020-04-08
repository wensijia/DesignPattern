package com.www.chainOfResponsibility.chain_v3;

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
    int index = 0;

    public FilterChain add(Filter f) {
        filters.add(f);
        return this;
    }

    public boolean doFilter(Request request, Response response, FilterChain chain) {
        if(index == filters.size()) return false;
        Filter f = filters.get(index);
        index ++;

        return f.doFilter(request, response, chain);
    }
}
