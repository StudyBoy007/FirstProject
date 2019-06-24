package com.BigHomeWork.FirstHomeWork.Test1Bank.bean;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by czq
 * time on 2019/5/31  21:48
 */
public class CustomerReport {
    private List<String> reports = new ArrayList<>();

    public List<String> getReports() {
        return reports;
    }

    public void setReports(List<String> reports) {
        this.reports = reports;
    }

    public void displayReport() {
        System.out.println("CUSTOMERS REPORT");
        System.out.println("==================");
        for (String report : reports) {
            System.out.println(report);
        }
    }
}
