// main.java
// Diego Grisales
// 11/24/21
// Integration Project - Milestone 2 Using Java

package com.diego;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String employee_name;
        double new_accounts_sold = 0;
        double upgrades_sold = 0;
        double accessories_sold = 0;
        int goal_reached = 0;
        int type_of_employee = 0;
        int loop_decision = 0;
        Scanner inp = new Scanner(System.in);

        do {

            System.out.print("Enter employee name: ");
            employee_name = inp.nextLine();

            try {
                System.out.print("Enter number of new accounts sold: ");
                new_accounts_sold = inp.nextDouble();

                System.out.print("Enter number of upgrades sold: ");
                upgrades_sold = inp.nextDouble();

                System.out.print("Enter dollar amount of accessories sold: ");
                accessories_sold = inp.nextDouble();

                System.out.print("Enter sales goal reached (1 or 2): ");
                goal_reached = inp.nextInt();

                // while loop will run until user enters 1 or 2
                while (goal_reached < 1 || goal_reached > 2) {
                    System.out.print("Enter sales goal reached (1 or 2): ");
                    goal_reached = inp.nextInt();
                }

                System.out.print("If employee is a manager enter 1, if employee is a sales associate enter 2: ");
                type_of_employee = inp.nextInt();

                // while loop will run until user enters 1 or 2
                while (type_of_employee < 1 || type_of_employee > 2) {
                    System.out.print("If employee is a manager enter 1, if employee is a sales associate enter 2: ");
                    type_of_employee = inp.nextInt();
                }

            }
            catch (Exception e) {
                inp.nextLine();
                System.out.println("Incorrect data type entered. \n");
            }

            System.out.print("\n");

            if (type_of_employee == 1) {
                // If employee type == 1, instance (object) of Manager class is created
                Manager manager = new Manager (employee_name, new_accounts_sold, upgrades_sold, accessories_sold,
                        goal_reached);

                manager.GetTotalCommissions();
            }
            else if (type_of_employee == 2) {
                // If employee type == 2, instance (object) of SalesAssociate class is created
                SalesAssociate sales_associate = new SalesAssociate(employee_name, new_accounts_sold, upgrades_sold,
                        accessories_sold, goal_reached);

                sales_associate.GetTotalCommissions();
            }

            try {
                System.out.print("To calculate another employee's commissions enter 1, otherwise enter 2: ");
                loop_decision = inp.nextInt();
                while (loop_decision < 1 || loop_decision > 2) {
;                   System.out.print("To calculate another employee's commissions enter 1, otherwise enter 2: ");
                    loop_decision = inp.nextInt();
                }
            }
            catch (Exception e) {
                inp.nextLine();
                System.out.println("Incorrect data type entered. \n");
            }


        } while (loop_decision == 1);
    }
}
