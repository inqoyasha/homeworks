package org.azamat.homeworks.OOP.book;

public class Main {
    public static void main(String[] args) {
        Author jonathonManning = new Author("Jonathon Manning", "jonathon.manning@mail.com", 'm');
        Author parisAddison = new Author("Paris Buttfield-Addison", "addison@mail.com", 'm');
        Author timNugent = new Author("Tim Nugent", "tim_1@mail.com", 'm');
        Author[] authorsLearningSwift = new Author[]{jonathonManning, parisAddison, timNugent};
        Book learningSwift = new Book("Learning Swift: Building Apps for macOS, iOS, and Beyond", authorsLearningSwift, 29.99);

        Author craigGrummitt = new Author("Craig Grummitt", "craig_1337@mail.com", 'm');
        Author[] authorsIOSDevelopmentWithSwift = new Author[]{craigGrummitt};
        Book iOSDevelopment = new Book("iOS Development With Swift",authorsIOSDevelopmentWithSwift, 24.99);

        System.out.println(learningSwift.toString());
        System.out.println(learningSwift.getAuthorNames());
        System.out.println(iOSDevelopment.toString());
        System.out.println(iOSDevelopment.getAuthorNames());
    }
}
