package day41_arraylist_continue;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        ArrayList<String>cities = new ArrayList<>();
        cities.add("Washington DC"); //0  --- indexes
        cities.add("New York"); //1
        cities.add("St.Louis"); //2
        cities.add("Baku"); //3
        cities.add("Istanbul"); //4

        //add Ashgabat to the first index
        cities.add(0,"Ashgabat");
        //print all values in the same line
        System.out.println(cities);
        //print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("second city = " + cities.get(cities.size()-1));

        //print count of items in arraylist
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("There are " + size + " cities in the list");

        //for loop and print all values in the same line
        for(int i = 0; i<cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }

        //for each loop
        System.out.println();
        for (String eachCity: cities){
            System.out.print(eachCity+ " ");
            }
        //delete item from arrayList

        System.out.println();

        //1)remove using index. delete value at index 3
        cities.remove(3);
        //2)remove using object/value
        cities.remove("Washington DC");
        System.out.println("after remove " + cities);

        //delete/remove all value from list
        cities.clear();

        //make sure it is clear
        //1)print|spit (mains the same thing as print, at work you can here it) it  out
        System.out.println("size = " + size);

        //2)using isEmpty
        if(cities.isEmpty()){
            System.out.println("list is empty");

        //3) check size() == 0
            if(cities.size()==0){
                System.out.println("list is empty now");
            }
            }
        }
    }


