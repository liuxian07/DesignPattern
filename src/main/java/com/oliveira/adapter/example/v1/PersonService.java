package com.oliveira.adapter.example.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 适配器模式-excel导出格式转换适配器-员工信息数据类
 */
public class PersonService {

    /**
     * 根据组织机构id获取员工列表
     */
    public List<String> getPersonList(String orgId) {
        // 模拟员工数据，实际从数据库中查询
        List<String> personList = new ArrayList<>();
        personList.add("张三");
        personList.add("李四");
        personList.add("王五");
        return personList;
    }

}
