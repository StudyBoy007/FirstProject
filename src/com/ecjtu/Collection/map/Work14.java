package com.ecjtu.Collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Create by czq
 * time on 2019/6/24  19:01
 */
public class Work14 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "科特迪瓦");
        map.put(2, "阿根廷");
        map.put(3, "澳大利亚");
        map.put(4, "塞尔维亚");
        map.put(5, "荷兰");
        map.put(6, "尼日利亚");
        map.put(7, "日本");
        map.put(8, "美国");
        map.put(9, "中国");
        map.put(10, "新西兰");
        map.put(11, "巴西");
        map.put(12, "比利时");
        map.put(13, "韩国");
        map.put(14, "喀麦隆");
        map.put(15, "洪都拉斯");
        map.put(16, "意大利");
        List<String[]> list = new ArrayList<>();
        list.add(new String[4]);
        list.add(new String[4]);
        list.add(new String[4]);
        list.add(new String[4]);
        List<Integer> nums = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < 16; i++) {
            do {
                num = (int) (Math.random() * 16) + 1;
            } while (nums.contains(num));
            nums.add(num);
        }
        int index = 0;
        for (int i = 0; i < 4; i++) {
            String[] group = list.get(i);
            for (int i1 = 0; i1 < 4; i1++) {
                group[i1] = map.get(nums.get(index++));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("第" + (i + 1) + "组的国家有如下：");
            String[] group = list.get(i);
            for (int i1 = 0; i1 < group.length; i1++) {
                System.out.print(group[i1] + "  ");
            }
            System.out.println();
        }
    }
}
