package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1");//此处需要系统说明
        System.out.println("2");//此处需要选项说明
        String chose=scan.next();
        option:while (true)
        {
            switch (chose)
            {
             //此处需要选项

                case "5"->{
                    System.out.println("exit");
                    break option;//用标识符跳出while循环 也可以是System.exit()
                }
                default -> System.out.println("Do not have this option");
            }
        }

    }
    public void cancelEvent(Event event) {

    }
    public void createEvent(int EventID,String name, String Data, String Location,String Organizer) {
        Scanner scan = new Scanner(System.in);

        Event event = new Event();
        event.setID(scan.nextInt());
        event.setDate(scan.nextLine());
        event.setName(scan.nextLine());
        event.setLocation(scan.nextLine());
        event.setOrganizer(scan.nextLine());
        System.out.println("Please input the information of organizer");
        Organizer organizer=new Organizer();
        organizer.setID(scan.nextInt());
        organizer.setName(scan.nextLine());
        organizer.setEmail(scan.nextLine());
        //为完工方法 如何自由的将organizer（不是event中的organizer数组而是organizer对象）与event连接


    }


    public void viewRegisteredAttendees(Event event) {
        //获取Event中装Attendee的集合

        ArrayList<Attendee> Attendee = event.getAttendee();
        //遍历集合
        for (int i = 0; i < Attendee.size(); i++) {
            Attendee attendee = Attendee.get(i);
            System.out.println(attendee.getName() + "\t" + attendee.getEmail() + "\t" + attendee.getID());
        }
    }
}
