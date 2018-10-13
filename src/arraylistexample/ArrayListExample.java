package arraylistexample;

import java.util.ArrayList;

public class ArrayListExample 
{
    public static void main(String[] args) 
    {
        ArrayList <Person> list = new ArrayList();
        list.add(new Person("Sandra", "yo@sandra.com", 6598794, 001, 35));
        list.add(new Person("Julius", "yo@julius.com", 6598794, 002, 43));
        list.add(new Person("Pendrive", "yo@pendrive.com", 6598794, 003, 22));
        list.add(new Person("Vanessa", "yo@vanessa.com", 6598794, 004, 19));
        System.out.println("Largo= " + list.size() + " elementos.");
        System.out.println("----- Recorro el arreglo con un foreach -----");
        int cont = 0;
        for (Person l : list) 
        {
            System.out.println((cont+=1) + ". Id: " + l.getId());
            System.out.println((cont+=1) + ". Nombre: " + l.getName());
            System.out.println((cont+=1) + ". Email: " + l.getEmail());
            System.out.println((cont+=1) + ". Mobil: " + l.getPhone());
            System.out.println((cont+=1) + ". Edad: " + l.getAge());
            System.out.println("####################################");
        }
        System.out.println("----- Recorro el arreglo con un for -----");
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(i + ". Id: " + list.get(i).getId());
            System.out.println(i + ". Nombre: " + list.get(i).getName());
            System.out.println(i + ". Email: " + list.get(i).getEmail());
            System.out.println(i + ". Mobil: " + list.get(i).getPhone());
            System.out.println(i + ". Edad: " + list.get(i).getAge());
            System.out.println("####################################");
        }
    } 
}