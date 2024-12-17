package com.oliveira.adapter.example.v1;

import java.util.Map;

/**
 * 适配器模式-excel导出格式转换适配器-导出工具类
 */
public class ExcelExport {

    public static void export(Map<String, Object> data) {
        // 模拟导出excel代码
        data.forEach((k, v) -> {
            System.out.println("key: " + k + ", value: " + v);
        });
    }
}
