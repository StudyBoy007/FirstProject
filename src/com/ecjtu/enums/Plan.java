package com.ecjtu.enums;

/**
 * Create by czq
 * time on 2019/6/28  10:59
 */
public enum Plan {
    Monday("课程  java综合项目"),
    Tuesday("课程  http协议,web基础"),
    Wedneday("课程  内置对象（-）"),
    Thursday("课程  数据结构"),
    Friday("课程  离散数学"),
    Saturday("课程  大学英语"),
    Sunday("课程  大学数学");
    private String classPlan;

    Plan(String classPlan) {
        this.classPlan = classPlan;
    }

    public String getClassPlan() {
        return classPlan;
    }
}
