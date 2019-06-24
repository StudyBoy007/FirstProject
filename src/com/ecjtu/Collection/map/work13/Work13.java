package com.ecjtu.Collection.map.work13;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Create by czq
 * time on 2019/6/24  18:50
 */
public class Work13 {
    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account(10.00, "1234"));
        accountList.add(new Account(15.00, "5678"));
        accountList.add(new Account(00.00, "1010"));
        HashMap<Integer, Account> map = new HashMap<>();
        for (Account account : accountList) {
            map.put(account.getId(), account);
        }
        Set<Integer> keySet = map.keySet();
        for (Integer i : keySet) {
            System.out.println("ID:"+i + "-->账户余额为：" + map.get(i).getBalance());
        }
    }

}
