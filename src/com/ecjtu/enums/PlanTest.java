package com.ecjtu.enums;

/**
 * Create by czq
 * time on 2019/6/28  11:06
 */
public class PlanTest {
    public static void main(String[] args) {
        Plan plan = Plan.Monday;
        switch (plan) {
            case Monday:
                System.out.println(plan.getClassPlan());
                break;
            case Tuesday:
                System.out.println(plan.getClassPlan());
                break;
            case Wedneday:
                System.out.println(plan.getClassPlan());
                break;
            case Thursday:
                System.out.println(plan.getClassPlan());
                break;
            case Friday:
                System.out.println(plan.getClassPlan());
                break;
            case Saturday:
                System.out.println(plan.getClassPlan());
                break;
            case Sunday:
                System.out.println(plan.getClassPlan());
                break;
        }
    }
}
