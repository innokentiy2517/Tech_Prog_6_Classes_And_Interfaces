package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Human> humanArrayList = new ArrayList<>();
        boolean flag = false;
        while (!flag)
        {
            System.out.println("\n\tWelcome ot the HumanDB v0.0001" +
                    "\nChoose Option:" +
                    "\n{1} - Add" +
                    "\n{2} - Edit" +
                    "\n{3} - Show" +
                    "\n{4} - Get Salary" +
                    "\n{5} - Exit");

            int switchCase = Input.inputInteger("");

            Menu menu = new Menu(humanArrayList);

            switch (switchCase)
            {
                case 1:
                    menu.addHuman();
                    break;
                case 2:
                    menu.editHuman();
                    break;
                case 3:
                    menu.viewWholeList();
                    break;
                case 4:
                    System.out.println(menu.getSalaryThroughInterface());
                    break;
                case 5:
                    flag = true;
                    break;
                default:
                    System.out.println("No such option!");
                    break;
            }
        }
    }
}