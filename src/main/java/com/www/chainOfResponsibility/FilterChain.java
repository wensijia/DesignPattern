package com.www.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.chainOfResponsibility
 * @ClassName: FilterChain
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/8 21:24
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/8 21:24
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class FilterChain<T> {
    /**
     * 过滤器集合
     */
    private List<Filter<T>> filters = new ArrayList<>();

    /**
     * 线程隔离的下一个要执行的过滤器所在集合位置
     */
    private static final ThreadLocal<Integer> NEXT_FILTER_NO = new ThreadLocal<Integer>() {
        protected Integer initialValue() {
            return 0;
        }
    };

    /**
     * 执行下个过滤器
     * @param t
     */
    public void doFilter(T t) {
        Integer no = NEXT_FILTER_NO.get();
        if (no < filters.size()) {
            NEXT_FILTER_NO.set(no + 1);
            filters.get(no).doFilter(t, this);
        }
    }

    /**
     * 添加过滤器，支持链式调用
     * @param filter
     * @return 当前FilterChain
     */
    public FilterChain<T> addFilter(Filter<T> filter) {
        this.filters.add(filter);
        return this;

    }
}
