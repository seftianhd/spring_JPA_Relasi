package com.relasi_jpa.dto;

import javax.validation.constraints.NotEmpty;

public class CategoryData {
    
    @NotEmpty(message = "name is required")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
