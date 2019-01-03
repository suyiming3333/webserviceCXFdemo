package com.sym.wscxfdemo.service;

import com.sym.wscxfdemo.entity.Person;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * @ClassName: TestServiceImpl
 * @Auther: Suyiming3333
 * @Date: 2019/1/3 0003 11:10
 * @Description: 接口的实现
 * @Version:
 */

@WebService(serviceName = "TestServices"//服务名
            ,targetNamespace = "http://service.wscxfdemo.sym.com"//命名空间，跟接口定义的一致
            ,endpointInterface = "com.sym.wscxfdemo.service.TestService")//提供服务的接口
@Component
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String name) {
        return "hello , "+ name;
    }

    @Override
    public Person getPerson(String personName, int age) {
        Person person = Person.builder().age(age).name(personName).description("from server").build();
        return person;
    }


}
