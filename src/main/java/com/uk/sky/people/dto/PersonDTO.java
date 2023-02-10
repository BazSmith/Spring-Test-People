package com.uk.sky.people.dto;

import javax.persistence.criteria.CriteriaBuilder;

public class PersonDTO {

    private String fullname;

    private Integer oldness;

    private String occupation;

    public PersonDTO(String fullname, Integer oldness, String occupation) {
        this.fullname = fullname;
        this.oldness = oldness;
        this.occupation = occupation;
    }

    public PersonDTO(){

    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getOldness() {
        return oldness;
    }

    public void setOldness(Integer oldness) {
        this.oldness = oldness;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
