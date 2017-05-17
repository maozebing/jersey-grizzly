package com.example;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 描述 ：
 *
 * @author : maozebing
 * @version : v1.00
 * @CreationDate : 17-5-16 下午4:30
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
@XmlRootElement
public class TestEntity {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
