package com.studytex.hacketex;

public class list_post_books {
    String title;
    String descripition;

    public list_post_books() {
    }

    @Override
    public String toString() {
        return "list_post_books{" +
                "title='" + title + '\'' +
                ", descripition='" + descripition + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }
}
