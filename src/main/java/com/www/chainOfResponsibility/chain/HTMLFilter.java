package com.www.chainOfResponsibility.chain;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.chainOfResponsibility
 * @ClassName: HTMLFilter
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/8 20:29
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/8 20:29
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class HTMLFilter implements Filter {
    public boolean doFilter(Request request) {
        request.str = request.str.replaceAll("<", "[").replaceAll(">", "]");
        return true;
    }
}
