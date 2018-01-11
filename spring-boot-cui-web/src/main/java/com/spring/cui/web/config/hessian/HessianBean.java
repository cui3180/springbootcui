package com.spring.cui.web.config.hessian;

import com.spring.cui.fs.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

/**
 * Created by cjs
 * Date： 2018/1/3.
 * Time： 16:48.
 */
@ComponentScan("com.spring.cui.service.impl")
@Configuration
public class HessianBean {

    @Autowired
    private TestService testService;

    @Bean(name = "/service/collageService")
    public HessianServiceExporter accountService() {
        CustomHessianServiceExporter exporter = new CustomHessianServiceExporter();
        exporter.setService(testService);
        exporter.setServiceInterface(TestService.class);
        return exporter;
    }

}
