package com.sym.wscxfdemo;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.sym.wscxfdemo.service.PersenSerivceImpl;
import com.sym.wscxfdemo.service.TestService;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;
import java.util.Arrays;

/**
 * @ClassName: CxfConfig
 * @Auther: Suyiming3333
 * @Date: 2019/1/3 0003 11:18
 * @Description:
 * @Version:
 */

@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;

    @Autowired
    private TestService testService;

//    @Bean
//    public Endpoint endpoint(){
//        EndpointImpl endpoint = new EndpointImpl(bus,testService);
//        endpoint.publish("/TestService");//发布服务
//        return endpoint;
//    }

    @Bean
    public ServletRegistrationBean myDispatcherServlet(){
        return new ServletRegistrationBean(new CXFServlet(),"/person/*");
    }


     //配置一个对象与json转换的工具
    @Bean
    public JacksonJaxbJsonProvider jacksonJaxbJsonProvider() {
        return new JacksonJaxbJsonProvider();
    }

    @Bean
    public Server server(){
        JAXRSServerFactoryBean bean = new JAXRSServerFactoryBean();
        bean.setBus(bus);
        bean.setProvider(new JacksonJaxbJsonProvider());//json格式转换器
        bean.setAddress("/rest");
        bean.setServiceBean(Arrays.asList(new PersenSerivceImpl()));
        return bean.create();
    }
}
