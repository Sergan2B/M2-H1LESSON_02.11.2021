package com.company;

public class Main {

    public static void main(String[] args) {
	// (Дэдлайн 2 дня)
        //Основное
        //a) Доделать все пункты практического задания по презентации
        //Сделано
        //b) Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии), последний 3й класс сделать не наследуемым
        //Сделано
        //c) Все поля классов должны быть приватными, одно из полей должно быть сложного типа созданного вами же (4й класс),+
        // одно из полей сделать сложного типа (enum)
        //Сделано
        //d) В классах не должно быть setter-ов, только getter-ы и конструкторы
        //Сделано
        //e) Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии, один из них сделать неперезаписываемым
        //Сделано
        //f) В классе 3-го уровня перезаписать один из методов родителя
        //Сделано
        //g) В главном классе (Main) Создать объект класса 2-го уровня (objectA) и 2 +
        // объекта класса 3-го уровня (objectB, objectC), также распечатать все свойства объектов и +
        // вызвать перегруженные методы через каждый из экземпляров ваших объектов.
        //Сделано

        Shelter koza = new Shelter("Koza", "Kozovskaya");
        Dog masha = new Dog("Masha", "Dvornyaga",new String[]{"Сидеть", "Лежать"}, Color.BROWN, koza );
        System.out.println(masha.getInfo());
        masha.makeVoice("gav", 4);

        Dog palkan = new Dog("Palkan", "Dvornyaga", Color.WHITE, koza);
        System.out.println(palkan.getInfo());
        palkan.makeVoice("Wo1f");

        SecondClass objectA = new SecondClass("USA", "Texas", "Texas", "Ari", ForthClass.BLUE);
        System.out.println(objectA.getInfo());
        System.out.println("_________________________________");

        ThirdClass objectB = new ThirdClass("Russia", "Kaliningrad", "Korvo", "Bob", ForthClass.BLACK, "Голубь");
        System.out.println(objectB.getInfo());
        System.out.println("_________________________________");

        ThirdClass objectC = new ThirdClass("Russia", "Moscow", "Chernysh", ForthClass.WHITE, "Попугай", new String[]{"Ya bez imeni", "Mike lzhets"});
        System.out.println(objectC.getInfo());
    }
}
