import jdk.management.jfr.RecordingInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String songPlayed = "";
        String artistPlayed = "";
        double songDuration = 0.0;
        ArrayList<Recording> recordingList = null;
        Recording recording;
        menu();
        int userChoice = scanner.nextInt();
        while (userChoice != 4){
            if (userChoice == 1){
                scanner.nextLine();
                System.out.print("Song played? ");
                 songPlayed = scanner.nextLine();

                System.out.print("Name of artist from song?");
                 artistPlayed = scanner.nextLine();

                System.out.print("Duration of song?");
                 songDuration = scanner.nextDouble();
                 recording = new Recording(songPlayed, artistPlayed, songDuration);
                recordingList = new ArrayList<>();
                recordingList.add(recording);
                menu();
                userChoice = scanner.nextInt();
            }
            if (userChoice == 2){

            }
            if (userChoice == 3){
                assert recordingList != null;
                displayRecords(recordingList);
                menu();
                userChoice = scanner.nextInt();
            }
        }

    }
    public static void menu(){
        System.out.println("Welcome to KJAVA radio station");
        System.out.println("1. Record");
        System.out.println("2. Sort Records");
        System.out.println("3. Display Records");
        System.out.println("4. Exit");
        System.out.print("Choice > ");
    }
    public static void displayRecords(ArrayList<Recording> recordingList){
        for(Recording record: recordingList ){
            System.out.println(record);
        }
    }
}