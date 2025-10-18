import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Person's Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Person's Age: ");
        int age = sc.nextInt();
        Person p1 = new Person(name , age);
        int menuValue = (int) (name.length() + Math.log(age) + 22);
        for(int i = 0; i < menuValue; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Person: Name: " + p1.getName() + " | Age: " + p1.getAge());
        if(p1.underAge()) System.out.println("This person is underAged!");
        for(int i = 0; i < menuValue; i++) {
            System.out.print("=");
        }
    }
}
