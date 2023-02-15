package Challenge140;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedList<Town> placesToVisit = new LinkedList<>();
        makeAussieTowns(placesToVisit);
        boolean flagQuit = true;
        ListIterator<Town> townsIterator = placesToVisit.listIterator();
        townsIterator.next();//move to position 1
        System.out.println("You are now in Sydney");
        while (flagQuit){
            System.out.println("""
                    \nAvailable Actions (Select Word or Letter):
                    (F)orward
                    (B)ackward
                    (L)ist Places
                    (M)enu
                    (Q)uit""");
            String input = (scan.nextLine()).toLowerCase();
            switch (input){
                case "f":
                case "forward":
                    try {
                        System.out.println(townsIterator.next());
                    } catch (NoSuchElementException NSEerr){
                        System.out.println("There's nowhere left to go!");
                        townsIterator.previous(); //adjust back the cursors
                    }
                    break;
                case "b":
                case "backward":
                    try {
                        System.out.println(townsIterator.previous());
                    } catch (NoSuchElementException NSEerr){
                        System.out.println("There's nowhere left to go!");
                        townsIterator.next();
                    }
                    break;
                case "l":
                case "list places":
                    int i= 0;
                    for( Town towns : placesToVisit) {
                        System.out.println(placesToVisit.get(i).getName());
                        i++;
                    }
                    break;
                case "m":
                case "menu":
                    break;
                case "q":
                case "quit":
                    flagQuit = false;
                    break;
                default:
                    System.out.println("Invalid Selection");


            }


        }
    }

    public static void makeAussieTowns(LinkedList<Town> towns){

        towns.add(new Town("Sydney",0));
        towns.add(new Town("Adelaide",1374));
        towns.add(new Town("Alice Springs",2771));
        towns.add(new Town("Brisbane",917));
        towns.add(new Town("Darwin",3972));
        towns.add(new Town("Melbourne",877));
        towns.add(new Town("Perth",3923));


    }

}

