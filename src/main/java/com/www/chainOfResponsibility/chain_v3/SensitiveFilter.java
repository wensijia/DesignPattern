package com.www.chainOfResponsibility.chain_v3;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.chainOfResponsibility
 * @ClassName: SensitiveFilter
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/8 20:30
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/8 20:30
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class SensitiveFilter implements Filter {
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        request.str = request.str.replaceAll("996", "955") + " ++++ SensitiveFilter()";
        chain.doFilter(request, response, chain);
        response.str += "--SensitiveFilter()";
        return true;
    }
}
