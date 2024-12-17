package com.oliveira.adapter.example.v1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 适配器模式-excel导出格式转换适配器-测试类
 */
public class Test {

    /**
     * 使用适配器模式将List转换为Map，然后导出excel
     */
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        List<String> personList = personService.getPersonList("1");
        ListToMapAdapter<String, Object> adapterMap = new ListToMapAdapter<>(personList);
        ExcelExport.export(adapterMap);
    }

//    /**
//     * 适配器传统模式-需要循环遍历List，这样就需要在每次导出的地方都要写循环遍历的代码
//     */
//    public static void main(String[] args) {
//        PersonService personService = new PersonService();
//        List<String> personList = personService.getPersonList("1");
//        Map<String, Object> map = new LinkedHashMap<>();
//        for (int i = 0; i < personList.size(); i++) {
//            map.put(String.valueOf(i), personList.get(i));
//        }
//        ExcelExport.export(map);
//    }

}
