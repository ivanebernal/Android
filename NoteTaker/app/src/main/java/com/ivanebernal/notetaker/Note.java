package com.ivanebernal.notetaker;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Iván on 13/05/2016.
 */
public class Note implements Serializable{

    public Note(String title, String note, Date date){
        this.title = title;
        this.note = note;
        this.date = date;
    }

    private String title;
    private String note;
    private Date date;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setNote(String note){
        this.note = note;
    }

    public String getNote(){
        return this.note;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }




}
