package fitnessClub;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MembershipManagment{
    final private Scanner reader = new Scanner(System.in);
    private int getIntInput(){
    	while (true){
            String number = reader.nextLine();
            try {
                int choice = Integer.parseInt(number);
                return choice;
            }
            catch (Exception e){
                System.out.println("ERROR, please try again. ");
            }
            }
    };

    private void printClubOptions(){
        System.out.println(
                "1) Club Mercury\n" +
                "2) Club Neptune\n" +
                "3) Club Jupiter\n" +
                "4) Multi Clubs");
    };

    public int getChoice(){
        int choice;
        System.out.println(
                "WELCOME TO OZONE FITNESS CENTER\n" +
                "================================\n" +
                "1) Add Member\n" +
                "2) Remove Member\n" +
                "3) Display Member Information\n"
                );
        System.out.print("Please select an option (or Enter -1 to quit): ");

        return choice = getIntInput();

    };

    public String addMembers(LinkedList <Member> m){
        String name;
        int club;
        String mem;
        double fees;
        int memberID;
        Member mbr;
        Calculator<Integer> cal;

            System.out.print("Please enter the name of Member: ");
            name = reader.nextLine();


            printClubOptions();

            System.out.print("\nPlease choise the club: ");
            club = getIntInput();
            
            while (club < 1 || club > 4){
                System.out.println("ERROR, please try again.");
                club = getIntInput();
            }
            if(m.size() > 0)
                memberID = m.getLast().getMemberId()+1;
            else memberID = 1;

            if(club != 4) {
                cal = (n) -> {
                    switch (n) {
                        case 1:
                            return 900;
                        case 2:
                            return 950;
                        case 3:
                            return 1000;
                        default:
                            return -1;
                    }
                };
                fees = cal.calculateFees(club);

                mbr = new SingleClubMember('S', memberID, name, fees, club);
                m.add(mbr);
                mem = mbr.toString();
                System.out.println("\nSingle Club`s Member added.\n");
            }
            else
            {
                cal = (n) -> {
                    switch (n) {
                        case 4:
                            return 1200;
                        default:
                            return -1;
                    }
                };
                fees = cal.calculateFees(club);
                mbr = new MiltiClubMember('M', memberID, name, fees, 100);
                m.add(mbr);
                mem = mbr.toString();
                System.out.println("\nMulti Club`s Member added.\n");
            };
            return  mem;
    };

    public void removeMembers(LinkedList<Member> m){
        int memberID;
        System.out.println("Please enter the Member ID: ");
        memberID = getIntInput();
        for (int i = 0; i < m.size(); i++) {
            if(m.get(i).getMemberId() == memberID) {
            m.remove(i);
                System.out.println("Remove of member success.");
                return;
            }
        }
        System.out.println("Member ID not found.");
    };

    public void printMemberInfo(LinkedList<Member> m){
        int memberID;
        System.out.print("Please enter the Member ID: ");
        memberID = getIntInput();
        for (int i = 0; i < m.size(); i++) {
            if(m.get(i).getMemberId() == memberID) {
                String[] memberInfo = m.get(i).toString().split(", ");
                System.out.println("\nMember Type = " + memberInfo[0]);
                System.out.println("Member ID = " + memberInfo[1]);
                System.out.println("Member Name = " + memberInfo[2]);
                System.out.println("Membership Fees = " + memberInfo[3]);
                if (memberInfo[0].equals("S")){
                    System.out.println("Club ID = " + memberInfo[4]);
                    System.out.println();
                } else {
                    System.out.println("Membership points = " + memberInfo[4]);
                    System.out.println();
                }
                return;
            }
        }
        System.out.println("\nMember ID not found.\n");
    };



}





