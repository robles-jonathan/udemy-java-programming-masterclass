package codingExercises;

public class MegaBytesConverter {
    
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        // needs to print "XX KB = YY MB and ZZ KB"
        // XX = original value kiloBytes
        // YY = calculated megaBytes
        // ZZ = calculated remaining kiloBytes

        // IF kiloBytes is less than 0 print "Invalid Value"

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes +" MB and " + remainder + " KB");
        }
    }
}
