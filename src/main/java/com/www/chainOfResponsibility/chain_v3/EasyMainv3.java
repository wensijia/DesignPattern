package com.www.chainOfResponsibility.chain_v3;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.chainOfResponsibility.easy
 * @ClassName: EasyMain
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/8 20:34
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/8 20:34
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class EasyMainv3 {
    public static void main(String[] args) {
        Request request = new Request();
        request.str = "大家好:)，<script>，欢迎访问本测试main ，大家都是251 ";
        Response response = new Response();
        response.str = "response";

        FilterChain chain = new FilterChain();
        chain.add(new HTMLFilter()).add(new SensitiveFilter());
        chain.doFilter(request, response, chain);
        System.out.println(request.str);
        System.out.println(response.str);
    }
}
