package strings;

public class DnaStrand  {
    public static String makeComplement(String dna) {
//        String newDna = "";
        StringBuilder newDna = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            if (dna.contains("A")) {
                dna.replace("A", "T");
            }
        }

        return dna;
    }
    public static void main(String[] args) {
        String dna = "ATTGC";

        System.out.println(makeComplement(dna));
    }
}
