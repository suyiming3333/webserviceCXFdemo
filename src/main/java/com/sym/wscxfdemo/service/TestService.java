package com.sym.wscxfdemo.service;

import com.sym.wscxfdemo.entity.Person;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @ClassName: TestService
 * @Auther: Suyiming3333
 * @Date: 2019/1/3 0003 11:03
 * @Description: webservice 服务的接口
 * @Version:
 */

/**
 * 命名空间的定义
 */
@WebService(targetNamespace = "http://service.wscxfdemo.sym.com")
public interface TestService {

    /**
     * 生命接口方法以及方法参数
     * @param name
     * @return
     */
    @WebMethod
    String sayHello(@WebParam(name = "userName")String name);

    @WebMethod
    Person getPerson(@WebParam(name = "personName")String personName,@WebParam(name = "age")int age);
}
