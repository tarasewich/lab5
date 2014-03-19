package ru.tarasevich.lab5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Body implements Comparable <Body>, Volumable,Squareable 
{
    public String name="Тело"; 
    public int id;
    private static int nextId=1;
    public double hight,lenght,width;
    public double square;
    public double volume;

    { id = nextId++; }
    
    public abstract void print();
    
    public  int getId(){
        return id;
    }
        
    public String getTime() 
    {
	DateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY HH:mm:ss");
	Date date = new Date();
        return dateFormat.format(date);
    }
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    
    public abstract double getHig();
    
    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return square;
    }

    public double getVolume() {
        return volume;
    }

    
   
  
}
