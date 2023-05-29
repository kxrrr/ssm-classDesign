//package kxr.design.ssm.config;
//
//import kxr.design.ssm.realm.UserRealm;
//import org.apache.shiro.mgt.DefaultSecurityManager;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//@Configuration
//public class ShiroConfig {
//
//    //ShiroFilterFactoryBean
//    @Bean
//    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultSecurityManager defaultSecurityManager) {
//        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
//        //设置安全管理器
//        bean.setSecurityManager(defaultSecurityManager);
//
//        //设置shiro的内置过滤器
//        /*
//            anon: 无需认证就可以访问
//            authc: 必须认证了才能访问
//            user: 必须拥有 记住我 功能才能用
//            perms: 拥有对某个资源的权限才能访问
//            roles: 拥有某个角色权限
//         */
//
//        Map<String, String> filterMap = new LinkedHashMap<>();
//
//        filterMap.put("/static/**", "anon");
//
//        bean.setFilterChainDefinitionMap(filterMap);
//
//        bean.setLoginUrl("/static/index");
//
//        return bean;
//    }
//    //DefaultSecurityManager
//    @Bean(name="securityManager")
//    public DefaultSecurityManager getDefaultSecurityManager(@Qualifier("userRealm") UserRealm userRealm) {
//        DefaultSecurityManager securityManager = new DefaultSecurityManager();
//        //关联UserRealm
//        securityManager.setRealm(userRealm);
//        return securityManager;
//    }
//
//    //创建 realm 对象 ， 需要自定义类
//    @Bean
//    public UserRealm userRealm() {
//        return new UserRealm();
//    }
//}
