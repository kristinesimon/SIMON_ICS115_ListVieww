package com.example.kristine.simon_ics115_listvieww.Model;

/**
 * Created by Kristine on 9/13/2017.
 */

public class College {

    private int logo;
    private String college;
    private String year;


    public College(int logo, String college, String year){
        this.logo = logo;
        this.college = college;
        this.year = year;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public String getCollege() {
        return college;
    }

    public int getLogo() {
        return logo;
    }
}
