package com.company;

public class House {

    private String adress;
    private int level;
    private int number_of_rooms;
    private int area;

    public House (String adress,int level,int number_of_rooms, int area){
        this.adress = adress;
        this.level = level;
        this.number_of_rooms = number_of_rooms;
        this.area = area;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setLevel(int level) {
         if (level >= 0) {
             this.level = level;
        } else {
            System.out.println("Ошибка!Этаж не может быть отрицательным числом!");
        }
    }

    public int getLevel() {
        return level;
    }

    public void setNumber_of_rooms(int number_of_rooms) {
        if (number_of_rooms >= 0) {
            this.number_of_rooms = number_of_rooms;
        } else {
            System.out.println("Ошибка! Кол-во комнат не может быть отрицательным числом!");
        }

    }

    public int getNumber_of_rooms() {
        return number_of_rooms;
    }

    public void setArea(int area) {
        if (area >= 0) {
            this.area = area;
        } else {
            System.out.println("Ошибка! Площадь не может быть отрицательным числом!");
        }
    }

    public int getArea() {
        return area;
    }

    public void showHouse(){
    System.out.println("Адрес дома: "+ adress +", Этаж: " + level + " ,Кол-во комнат: " + number_of_rooms +" ,Площадь квартиры: " + area);
    }

}
