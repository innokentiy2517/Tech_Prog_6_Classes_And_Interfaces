package com.company;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Human> humanArrayList;

    public Menu(ArrayList<Human> humanArrayList){this.humanArrayList = humanArrayList;}

    public Human fillHuman(){
        String name = Input.inputString("Input name: ");
        int age = Input.inputInteger("Input age: ");

        int type = Input.inputInteger("Input {1} if this is student and {2} if employee: ");
        if (type == 1){
            double scholarship = Input.inputDouble("Input Scholarship: ");
            int course = Input.inputInteger("Input Course: ");
            return new Student(name, age,course,scholarship);
        }
        else
        {
            double salary = Input.inputDouble("Input salary ");
            return new Employee(name,age,salary);
        }
    }

    public void addHuman() {
        Human human = fillHuman();
        humanArrayList.add(human);
    }

    public void editHuman(){
        int idHuman = searchHuman();
        Human humanThatIsEdited = fillHuman();
        humanArrayList.set(idHuman,humanThatIsEdited);
    }

    public int searchHuman(){
        int idHuman = Input.inputInteger("Input Identification number of Person: ");
        if (idHuman > humanArrayList.size()){
            idHuman = Input.inputInteger("No such id. Try again: ");
        }
        System.out.println(humanArrayList.get(idHuman-1).info());

        return idHuman-1;
    }

    public void viewWholeList(){
        int i = 0;
        for (Human hum: humanArrayList){
            i++;
            System.out.println(i + ")\t"+hum.info());
        }
    }

    public String getSalaryThroughInterface(){
        getMoneyRequest request = extractHuman();
        return "Salary is" + request.getMoney();
    }

    private Human extractHuman() {
        int id = searchHuman();
        return humanArrayList.get(id);
    }

    /*public void writeXMLFile(ArrayList<Human> humanArrayList){
        XMLEncoder e = new XMLEncoder(BufferedOutputStream(new FileOutputStream("HumanDB.xml")));
        e.writeObject(humanArrayList);
        e.close();
    }*/
}
