package com.oliveira.adapter.example.v1;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * 适配器模式-excel导出格式转换适配器-List转Map适配器
 *
 * @param <K>
 * @param <V>
 */
public class ListToMapAdapter<K, V> extends LinkedHashMap<K, V> {
    private static final long serialVersionUID = 1L;
    private final List<String> list;

    public ListToMapAdapter(List<String> list) {
        this.list = list;
    }

    @Override
    public int size() {
        return list.size();
    }

    @SuppressWarnings("unchecked")
    @Override
    public V get(Object i) {
        return (V) list.get((Integer) i);
    }

}
