package com.phone.erp.websocket.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * [Druid监控配置类]
 *
 * @author Chris li[黎超]
 * @create [2017-04-12]
 */
@Configuration
public class DruidMonitorConfig {

    @Value("${druid.monitor.config.login.username}")
    private String loginUsername;

    @Value("${druid.monitor.config.login.password}")
    private String loginPassword;

    @Value("${druid.monitor.config.reset.enable}")
    private String resetEnable;

    @Value("${druid.monitor.config.allow.ip}")
    private String allow;

    @Value("${druid.monitor.config.deny.ip}")
    private String deny;

    @Value("${project.url.prefix}")
    private String projectUrlPrefix;

    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new StatViewServlet());
        servletRegistrationBean.addUrlMappings(projectUrlPrefix + "/druid/*");
        Map<String, String> initParameters = new HashMap<String, String>();
        initParameters.put("loginUsername", loginUsername);// 用户名
        initParameters.put("loginPassword", loginPassword);// 密码
        initParameters.put("resetEnable", resetEnable);// 是否禁用HTML页面上的重置功能
        initParameters.put("allow", allow); // IP白名单 (没有配置或者为空，则允许所有访问)
        initParameters.put("deny", deny);// IP黑名单(存在共同时，deny优先于allow)
        servletRegistrationBean.setInitParameters(initParameters);
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }

}
