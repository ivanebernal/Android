package com.ivanebernal.databindingexample;

/**
 * Created by ivan on 23/05/16.
 */
public class DataSource {

    private String name;

    public String getMessage(){ return String.format("Hello %s!", name);}

    public static DataSource get(String s) {return new DataSource(s);}

    public DataSource(String name){this.name = name;}
}
