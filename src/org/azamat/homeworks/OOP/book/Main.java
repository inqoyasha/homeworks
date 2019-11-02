package org.azamat.homeworks.OOP.book;

public class Main {
    public static void main(String[] args) {
        Author erik = new Author("Erik Gover", "erik.gover@mail.com", 'm');
        Author lisa = new Author("Lisa Ester", "lisa_ester1@mail.com", 'f');
        Author[] authors = new Author[]{new Author("Erik Gover", "erik.gover@mail.com", 'm'),new Author("Lisa Ester", "lisa_ester1@mail.com", 'f')};
        for (int i=0; i< authors.length;++i) {
            System.out.println(authors[i]);
        }
        Book book = new Book("Alisa in wonderland", authors, 2.33);

        System.out.println(book.toString());

    }
}
