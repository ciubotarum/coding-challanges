package strings.codewars;

import java.util.Arrays;

public class DnaStrand  {
    public static String makeComplement(String dna) {

        return dna.replace("A", "t").replace("T", "A").replace("t", "T")
                .replace("G", "c").replace("C", "G").replace("c", "C");
    }
    public static void main(String[] args) {
        String dna = "ATTGC";

        System.out.println(makeComplement(dna));
    }
}
