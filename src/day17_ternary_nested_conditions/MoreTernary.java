package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {

        int hourlyrate = 50;
        String reply = (hourlyrate>40) ? "accept" : "reject";
        System.out.println("reply = " + reply);

        String toDaysClass = "java";
        String teacher = (toDaysClass.equals("java"))? "Saim/Murodil": "Nadir";
        System.out.println("teacher = " + teacher);

        boolean ifEligibleToDrive = true;
        String driving = ifEligibleToDrive ? "yes, have Dl, Can Drive" : "No Cannot drive";
        System.out.println("driving = " + driving);

    }
}
