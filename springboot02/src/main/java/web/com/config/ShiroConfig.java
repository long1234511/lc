package web.com.config;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

import javax.servlet.DispatcherType;
import java.util.HashMap;
import java.util.Map;

/**
 * @version V1.0.1
 * @classname ShiroConfig
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-09-26  14:08
 **/
@Configuration
public class ShiroConfig {
    /**
     * FilterRegistrationBean
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
        filterRegistration.setFilter(new DelegatingFilterProxy("shiroFilter"));
        filterRegistration.setEnabled(true);
        filterRegistration.addUrlPatterns("/*");
        filterRegistration.setDispatcherTypes(DispatcherType.REQUEST);
        return filterRegistration;
    }
    @Bean(name = "shiroFilter")
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        bean.setSecurityManager(securityManager);
        bean.setLoginUrl("/login"); //设置登录方法
        bean.setSuccessUrl("/index.html");
        bean.setUnauthorizedUrl("/login.html"); //设置没有权限跳转的页面
        Map<String, String> chains = new HashMap();
        chains.put("/login", "anon");
        chains.put("/login.html", "anon");
        //chains.put("/index.html", "anon");
        chains.put("/logout", "anon");
        chains.put("/statics/**", "anon");
        //chains.put("/views/**", "anon");
        chains.put("/**", "authc");
        bean.setFilterChainDefinitionMap(chains);
        return bean;
    }
    /**
     * @see SecurityManager
     * @return
     */
    @Bean(name="securityManager")
    public SecurityManager securityManager(MyRealm myRealm) {
        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
        manager.setRealm(myRealm());
        manager.setSessionManager(SessionManager());
        return manager;
    }

    /**
     * @see DefaultWebSessionManager
     * @return
     */
    @Bean(name="sessionManager")
    public SessionManager SessionManager() {
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        //sessionManager.setCacheManager(cacheManager());
        sessionManager.setGlobalSessionTimeout(1800000);
        sessionManager.setDeleteInvalidSessions(true);
        sessionManager.setSessionValidationSchedulerEnabled(true);
        sessionManager.setDeleteInvalidSessions(true);
        return sessionManager;
    }

    /**
     * @see MyRealm --->AuthorizingRealm
     * @return
     */
    @Bean
    public MyRealm myRealm() {
        return new MyRealm();
    }

   /* @Bean
    public URLPermissionsFilter urlPermissionsFilter() {
        return new URLPermissionsFilter();
    }*/

      /*  @Bean
        public EhCacheManager cacheManager() {
            EhCacheManager cacheManager = new EhCacheManager();
            cacheManager.setCacheManagerConfigFile("classpath:ehcache.xml");
            return cacheManager;
        }*/

  /*  @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }*/
}
