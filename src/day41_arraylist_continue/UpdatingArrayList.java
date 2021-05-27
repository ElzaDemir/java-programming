package day41_arraylist_continue;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List <String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Tesla");
        myCars.add("Jaguar");
        myCars.add("Ferrari");
        myCars.add("McLaren Speedtail");
        myCars.add(1, "Bentley");
        myCars.add(0, "07");

        //Toyota, Tesla, Jaguar, Ferrari, McLaren Speedtail, Bentley, 07
        System.out.println(myCars.toString());//prints all cars
        String allCarsIn1Str = myCars.toString(); //saves all cars in 1 string variable

        //change index to Lamborghini
        myCars.set(1, "Lamborghini");
        System.out.println("after set = " + myCars.toString());

        //change 4 to Honda
        myCars.set(4,"Maserati");
        System.out.println("After set Maserati = " + myCars);

        /**
         * How would you do that if myCars was Array:
         * myCars[4] = "Maserati";
         */
        //find the index number of "ford"
        System.out.println("Index of Ferrari = " + myCars.indexOf("Maserati"));
        int index07 = myCars.indexOf("07");
        System.out.println("index07 = " + index07);

        myCars.set(index07, "Bugatti");
        System.out.println("after set to Bugatti = " + myCars);


        myCars.set(myCars.indexOf("Tesla"), "Jaguar");

        System.out.println("Index of Tesla = " + myCars);

        if(myCars.contains("Bentley")){
            myCars.set(myCars.indexOf("Bentley"), "BMW");
            System.out.println(myCars);
        }else{
            System.out.println("There is not such a car");
        }
        System.out.println("After set BMW = " + myCars);

        for(int i = 0; i<myCars.size(); i++){
            if(myCars.get(i).equals("Lamborghini")){
                myCars.set(i,"Tesla ");

            }else if(myCars.get(i).equals("Ferrari")){
                myCars.set(i,"lexus");
            }else if(myCars.get(i).equals("BMW")){
                myCars.set(i,"Audi");
            }
        }
        System.out.println("after loop - " + myCars);



    }
}
