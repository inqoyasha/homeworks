package org.azamat.homeworks.OOP.book;

public class Main {
    public static void main(String[] args) {
        Author alisha = new Author();
        Author sara = new Author();
        Author[] authors = new Author[]{alisha,sara};
        Book book = new Book("Alisa in wonderland", authors, 2.33);

        System.out.println(book.toString());
        System.out.println(book.getAuthorNames());
    }
}
