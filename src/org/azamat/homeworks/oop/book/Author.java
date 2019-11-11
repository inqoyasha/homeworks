package org.azamat.homeworks.oop.book;

import java.util.Objects;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author() {
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "Author[" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return gender == author.gender &&
                Objects.equals(name, author.name) &&
                Objects.equals(email, author.email);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = (int)gender;
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();

        return result;
    }
}
