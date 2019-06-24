package com.ecjtu.Collection.work6;

/**
 * Create by czq
 * time on 2019/6/21  19:58
 */
public class Book implements Comparable<Book> {
    public String name;
    public double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        if (this.price > o.price) {
            return 1;
        } else if (this.price < o.price) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return name + "的价格为：" + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (Double.compare(book.price, price) != 0) return false;
        return name != null ? name.equals(book.name) : book.name == null;
    }


}
