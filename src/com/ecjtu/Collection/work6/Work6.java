package com.ecjtu.Collection.work6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Create by czq
 * time on 2019/6/21  17:38
 */
public class Work6 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("斗破苍穹", 100));
        books.add(new Book("武动乾坤", 110));
        books.add(new Book("斗罗大陆", 90));
        Collections.sort(books);
        for (Book b : books) {
            System.out.println(b.toString());
        }
        Book book = new Book("武动乾坤", 110);
        int index = 0;
        for (Book b : books) {
            index++;
            if (b.equals(book)) {
                System.out.println(b.name + "的识别价格相同，具体价格为：" + b.price);
                break;
            }
            if (index == books.size() && b.equals(book) == false) {
                System.out.println("抱歉,书库中没有你要查找的图书!");
            }
        }
    }
}
