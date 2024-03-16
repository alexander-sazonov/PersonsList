package com.example.personslist;

public class Person {
    private long id;
    private String name;
    private String companyName;
    private String photo;
    private boolean isLiked;

    public Person(long id, String name, String companyName, String photo, boolean isLiked) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.photo = photo;
        this.isLiked = isLiked;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }
}
