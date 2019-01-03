package com.sym.wscxfdemo.entity;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: Person
 * @Auther: Suyiming3333
 * @Date: 2019/1/3 0003 17:19
 * @Description:
 * @Version:
 */
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "person")//将类或枚举类型映射到 XML 元素。JAXB中的注解，用来根据java类生成xml内容
public class Person {
    private String name;
    private int age;
    private String description;
}
