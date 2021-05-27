package day18_conditions_practice_strings_intro;

public class CarLeasingOptions {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "E";
        double leasePrice = 0;

//        if (make.equals("Mercedes") && model.equals("E")){
//            leasePrice = 500.0;
//        }else if(make.equals("Mercedes") &&  model.equals("A")){
//            leasePrice = 400.00;
//        }
//
//        System.out.println("make = " + make);
//        System.out.println("model = " + model);
//        System.out.println("leasePrice = " + leasePrice);

        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500.0;
            } else if (model.equals("A")) {
                leasePrice = 400.0;
            }
        }else if(make.equals("Audi")){
            if(model.equals("C")){
                leasePrice = 350.0;
            }else if(model.equals("R")){
                leasePrice = 200.0;
            }
            System.out.println("make = " + make);
            System.out.println("model = " + model);
            System.out.println("leasePrice = " + leasePrice);
        }
    }
}
