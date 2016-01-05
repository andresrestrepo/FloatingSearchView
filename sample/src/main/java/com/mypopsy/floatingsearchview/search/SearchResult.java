package com.mypopsy.floatingsearchview.search;

public class SearchResult {
    public String description;
    public String name;
    public String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SearchResult(String name, String description){
        this.name = name;
        this.description = description;
    }

    public SearchResult(String error){
        this.name = error;
    }

}
