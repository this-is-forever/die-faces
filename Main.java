
public class Main {

    private static String[] DIE_FACES = { null, 
        " ---------\n|         |\n|    o    |\n|         |\n ---------",
        " ---------\n| o       |\n|         |\n|       o |\n ---------",
        " ---------\n|       o |\n|    o    |\n| o       |\n ---------",
        " ---------\n| o     o |\n|         |\n| o     o |\n ---------",
        " ---------\n| o     o |\n|    o    |\n| o     o |\n ---------",
        " ---------\n| o     o |\n| o     o |\n| o     o |\n ---------"
    };

    /**
     * Prints an ASCII die to the console! Fun!
     * @param side The face to print, 1-6.
     */
    private static void printDieFace(int side) {
        System.out.println(DIE_FACES[side]);
    }

    /**
     * Tests the die face printer! Should show the 6 sides of a 6-sided die.
     * @param args
     */
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++)
            printDieFace(i);
    }
}
