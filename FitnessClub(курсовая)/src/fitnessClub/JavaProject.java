package fitnessClub;

import java.util.LinkedList;

public class JavaProject {
    public static void main(String[] args) {

        String mem;

        MembershipManagment mm = new MembershipManagment();
        FileHandler start = new FileHandler();
        LinkedList<Member> members = start.readFile();
        int choice = mm.getChoice();
        while (choice != -1)
        {
            switch (choice)
            {
                case 1:
                    mem = mm.addMembers(members);
                    start.appendFile(mem);
                    break;
                case 2:
                    mm.removeMembers(members);
                    start.overwriteFile(members);
                    break;
                case 3:
                    mm.printMemberInfo(members);
                    break;
                default:
                    System.out.println("ERROR, please try again.");
            }
            choice = mm.getChoice();
        }
        System.out.println("Have a nice day!");
        
    }
}
