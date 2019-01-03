package com.sym.wscxfdemo;

import com.sym.wscxfdemo.service.TestService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

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

    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus,testService);
        endpoint.publish("/TestService");//发布服务
        return endpoint;
    }
}
