package com.example.myapplication;

public class Revision {

    private String revisionId;
    private String description;
    private String date;
    private String duree;
    private double longitude, latitude;
    private String place;

    public Revision(String revisionId, String description, String date, String duree, double longitude, double latitude, String place) {
        this.revisionId = revisionId;
        this.description = description;
        this.date = date;
        this.duree = duree;
        this.longitude = longitude;
        this.latitude = latitude;
        this.place = place;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
