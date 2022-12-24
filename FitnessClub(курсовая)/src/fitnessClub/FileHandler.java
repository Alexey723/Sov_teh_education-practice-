package fitnessClub;

import java.io.*;
import java.util.LinkedList;

public class FileHandler {

    public LinkedList<Member> readFile(){
        LinkedList<Member> m = new LinkedList ();
        String lineRead;
        String[] splitLine;
        Member mem;
        try (BufferedReader reader = new BufferedReader(new FileReader("members.csv")))
        {
            lineRead = reader.readLine();
            while (lineRead != null)
            {
                splitLine = lineRead.split(", ");
                if (splitLine[0].equals("S")){
                    mem = new SingleClubMember('S', Integer.parseInt(splitLine[1]), splitLine[2],
                            Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4]));
                } else {
                    mem = new MiltiClubMember('M', Integer.parseInt(splitLine[1]), splitLine[2],
                            Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4]));
                }
                m.add(mem);
                lineRead = reader.readLine();
            }
            
        }
        catch (IOException e) {
            e.printStackTrace();}

        return m;
    }

    public void appendFile(String mem) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("members.csv", true)))
            {
            writer.write(mem + "\n");
             }
        catch (IOException e) {
            e.printStackTrace();
            }
    }

    public void overwriteFile(LinkedList<Member> m){
        String line;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("members.temp", false)))
            {
            for (int i = 0; i < m.size(); i++) {
                line  = m.get(i).toString();
                writer.write(line + "\n");
            }

        }
        catch (IOException e)
            {
            e.printStackTrace();
            }
        try
        {
            File first = new File("members.csv");
            File temp = new File("members.temp");
            first.delete();
            temp.renameTo(first);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
