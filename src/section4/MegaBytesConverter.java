package section4;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes, remainingKB;
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            megaBytes = kiloBytes/1024;
            remainingKB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKB + " KB");
        }

    }
}