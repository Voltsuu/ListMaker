import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ListMaker {
    public static ArrayList<String> list = new ArrayList<String>();
    public static Scanner scan = new Scanner(System.in);
    public static boolean done = false;


    public static void main(String[] args) {

        String option = "";
        list.addAll(Arrays.asList("amongus", "JulioGamor897", "prashun is gold 2", "solo leveling", "DJ KHALED", "mr. gorg", "mr. corgumm", "so silly", "wings??", "reckoners"));
        while (!done) {

            option = InputHelper.getRegExString(scan, "Options: \nA – Add an item to the list \nD – Delete an item from the list \nP – Print the list \nQ – Quit the program", "[AaDdPpQq]");
            if (option.equalsIgnoreCase("A")) {
                add();
            } else if (option.equalsIgnoreCase("D")) {
                delete();
            } else if (option.equalsIgnoreCase("P")) {
                print();
            } else if (option.equalsIgnoreCase("Q")) {
                quit();
            }
        }
    }

    public static void print(){
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i));
        }
    }

    public static void add() {
        String teehee = InputHelper.getNonZeroLenString(scan, "Add something :)");
        list.add(teehee);
    }

    public static void delete(){
        int index = InputHelper.getRangedInt(scan, "ENTER AN INDEX NOW BEFORE I GET REALLY MAD!!! NOW!", 0, list.size());
        list.remove(index);
    }

    public static void quit(){
        done = InputHelper.getYNConfirm(scan, "Are you sure you want to quit? [Y/N]");
    }
}