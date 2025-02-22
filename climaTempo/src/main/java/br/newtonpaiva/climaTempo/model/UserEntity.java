package br.newtonpaiva.climaTempo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clima")
public class UserEntity {
    @Id
    private String country;
    private String date;

    private String text;

    public UserEntity(String country, String date, String text) {
        this.country = country;
        this.date = date;
        this.text = text;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
