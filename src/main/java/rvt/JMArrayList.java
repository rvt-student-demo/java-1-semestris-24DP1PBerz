package rvt;
import java.util.*;

public class JMArrayList {
    public static void main(String[] args) {
        onlyTheseNumbers();
        listSize();
        onTheList();

        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }
    public static void onlyTheseNumbers() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int sk = Integer.valueOf(scanner.nextLine());
        while (sk != -1) {
            list.add(sk);
            sk = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("from where?");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int end = Integer.valueOf(scanner.nextLine());

        for(; start < (end+1);start++){
            System.out.println(list.get(start));

        }

    }
    public static void listSize() {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            list.add(name);
        }
        System.out.println("In total: " + list.size());
    }
    public static void onTheList() {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            list.add(name);
        }
        System.out.print("Search for? ");
        String find = scanner.nextLine();
        if(list.contains(find)){
            System.out.println(find + " was found!");
        } else{
            System.out.println(find + " was not found!");
        }
    }
    public static void removeLast(ArrayList<String> strings) {
        if(strings.size() == 0){
            return;
        }
        strings.remove(strings.size()-1);
    }

    
}
