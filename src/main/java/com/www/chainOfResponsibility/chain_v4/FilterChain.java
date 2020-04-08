package com.www.chainOfResponsibility.chain_v4;

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
public class FilterChain{
    List<Filter> filters = new ArrayList<Filter>();
    int index = 0;

    public FilterChain add(Filter f) {
        filters.add(f);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if(index == filters.size()) return;
        Filter f = filters.get(index);
        index ++;
        f.doFilter(request, response ,this);
    }
}
