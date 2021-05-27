package day43_list_custom_classes;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class Employee {

        public static void main(String[] args) {
            Company accountant1 = new Company();
            accountant1.name = "Elvira";
            accountant1.jobTitle = "Accounting Specialist";
            System.out.println();
            accountant1.work();
            System.out.print(accountant1.name + "\t\t" + accountant1.jobTitle);

            System.out.println();

            Company accountant2 = new Company();
            accountant2.name = "Yulduz";
            accountant2.jobTitle = "Accounting Specialist";
            System.out.println();
            accountant2.work();
            System.out.print(accountant2.name + "\t\t" + accountant2.jobTitle);

            System.out.println();

            Company accountant3 = new Company();
            accountant3.name = "Said";
            accountant3.jobTitle = "Accounting manager";
            System.out.println();
            accountant3.work();
            System.out.print(accountant3.name + "\t\t" + accountant3.jobTitle);

            System.out.println();
            System.out.println();
        }
    }

