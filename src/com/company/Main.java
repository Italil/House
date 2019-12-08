package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //House house = new House("г. Москва, Андропова 7",7,2,50);
        Scanner sc = new Scanner(System.in);
        int room;
        int level1,level2;
        int nextArea;
        int variant;
        House[] houses = new House[8];
        houses[0] = new House("г. Москва, Андропова 7",7,2,50);
        houses[1] = new House("г.Москва, Молодежная 7", 6,3,78);
        houses[2] = new House("г.Москва, Тверская улица, дом 13",13,3,97);
        houses[3] = new House("г.Москва, Темирязьевская, дом 52",3,2,59);
        houses[4] = new House("г.Москва, шоссе Энтузиастов 135",5,3,105);
        houses[5] = new House("г.Москва, Крымская набережная, 15",15,1,34);
        houses[6] = new House("г.Москва, улица Полякова, дом 64к3",21,2,54);
        houses[7] = new House("г.Москва, улица Профсоюзная, дом 14",11,1,38);

        System.out.println("Выберите то что вам необходимо: ");
        System.out.println("1 - список квартир, имеющих заданное число комнат;");
        System.out.println("2 - список квартир, имеющих заданное число конат и находящихся в определенном промежутке этажей;");
        System.out.println("3 - список квартир, имеющих площадь, превосходящую заданную.");

        variant = sc.nextInt();

        switch (variant) {

            case 1:

                System.out.println("Введите необходимое вам кол-во комнат: ");
                 room = sc.nextInt();

                if (room > 0) {
                } else {
                System.out.println("Ошибка!Кол-во комнат не может быть 0 или отрицательным числом!");
                break;
                }

                for (House hou : houses) {
                    if (hou.getNumber_of_rooms() == room)
                    { hou.showHouse(); }
                }

            break;

            case 2:

                System.out.println("Введите необходимое вам кол-во комнат: ");
                room = sc.nextInt();
                if (room > 0) {
                } else {
                    System.out.println("Ошибка!Кол-во комнат не может быть 0 или отрицательным числом!");
                    break;
                }
                System.out.println("Введите нижнюю границу этажей: ");
                level1 = sc.nextInt();
                if (level1 >= 0) {
                } else {
                    System.out.println("Ошибка!Кол-во этажей не может быть отрицательным числом!");
                    break;
                }
                System.out.println("Введите верхнюю границу этажей: ");
                level2 = sc.nextInt();
                if (level2 >= 0) {
                } else {
                    System.out.println("Ошибка!Кол-во этажей не может быть отрицательным числом!");
                    break;
                }

                for (House hou : houses) {
                    if (hou.getNumber_of_rooms() == room && hou.getLevel() >= level1 && hou.getLevel() <= level2)
                    { hou.showHouse();}
                }

            break;

            case 3:

                System.out.println("Введите минимальную необходимую вам площадь: ");
                nextArea = sc.nextInt();
                if (nextArea > 0) {
                } else {
                    System.out.println("Ошибка!Площадь не может быть 0 или отрицательным числом!");
                    break;
                }

                for (House hou : houses) {
                    if (hou.getArea() > nextArea)
                    { hou.showHouse(); }
                }

            break;

            default:

                System.out.println("Ошибка!Такого варианта нет!");

             break;

        }

        sc.close();

    }
}
