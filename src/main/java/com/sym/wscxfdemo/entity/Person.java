package com.sym.wscxfdemo.entity;

import lombok.*;

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
public class Person {
    private String name;
    private int age;
    private String description;
}
