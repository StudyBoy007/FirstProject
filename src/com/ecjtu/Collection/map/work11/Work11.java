package com.ecjtu.Collection.map.work11;

import java.util.*;

/**
 * Create by czq
 * time on 2019/6/24  16:10
 */
public class Work11 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2006, "意大利");
        map.put(2002, "巴西");
        map.put(1998, "法国");
        map.put(1994, "巴西");
        map.put(1990, "德国");
        map.put(1986, "阿根廷");
        map.put(1982, "意大利");
        map.put(1978, "阿根廷");
        map.put(1974, "德国");
        map.put(1970, "巴西");
        map.put(1966, "英格兰");
        map.put(1962, "巴西");
        map.put(1958, "巴西");
        map.put(1954, "德国");
        map.put(1950, "乌拉圭");
        map.put(1938, "意大利");
        map.put(1934, "意大利");
        map.put(1930, "乌拉圭");
        Set<Integer> set = map.keySet();
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个年份，查看该年是否有有举办世界杯：");
        int num = input.nextInt();
        System.out.println(set.contains(num));
        if (set.contains(num)) {
            System.out.println("该年获得世界杯冠军的国家是：" + map.get(num));
            System.out.println(map.get(num) + "至今获得冠军的年份有：");
            Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
            List<Map.Entry<Integer, String>> list = new ArrayList<>(entrySet);
            list.sort(new yearCompare());
            for (Map.Entry<Integer, String> entry : list) {
                if (entry.getValue() == map.get(num)) {
                    System.out.println(entry.getKey());
                }
            }
        }

    }
}
