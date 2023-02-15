package Challenge135;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList <String> groceryList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                Collections.sort(groceryList);
                System.out.println("Your Grocery List:");
                printGrocery(groceryList);
                System.out.print("Input Selection: 0, 1, 2 >> ");
                int select = Integer.parseInt(sc.nextLine());
                switch (select) {
                    case 0 -> System.exit(9);
                    case 1 -> {
                        System.out.print("Input Item: ");
                        String item = sc.nextLine();
                        addGrocery(groceryList, item);
                    }
                    case 2 -> {
                        System.out.print("Input Item Number: ");
                        int index = Integer.parseInt(sc.nextLine());
                        delGrocery(groceryList,index);
                    }
                }
            } catch (NumberFormatException IMErr) {
                System.out.print("Usage: <int> : 0, 1, 2");
            }
        }
    }

    public static void printGrocery(ArrayList <String> grocery){
        if(grocery.size() == 0){
            System.out.println("List is Empty");
        }
        int i = 1;
        for(String item : grocery){
            System.out.printf("%d. %s\n",i, item);
            i++;
        }
    }

    public static void addGrocery(ArrayList <String> grocery, String item){
        if(!grocery.contains(item)){
            grocery.add(item);
        } else{
            System.out.println("You have this in your list!");
        }
    }

    public static void delGrocery(ArrayList <String> grocery, int index){
        if((index >0 ) && (index<grocery.size()+1)){
            System.out.printf("%s has been removed \n", grocery.remove(index-1));
        } else{
            System.out.println("Wrong Index in List");
        }
    }

}

