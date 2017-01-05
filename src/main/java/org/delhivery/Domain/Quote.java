package org.delhivery.Domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private int id;
    private String content;

    public Quote(){
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content=content;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id='" + id + '\'' +
                ", content=" + content +
                '}';
    }
}
