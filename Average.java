public class Average {
    public static void main(String[] args) {
        int[] zahlen = { 4, 6, 8, 10 };

        double mittelwert = berechneMittelwert(zahlen);

        System.out.println("Mittelwert: " + mittelwert);
    }

    public static double berechneMittelwert(int[] zahlen) {
        int summe = 0;

        for (int zahl : zahlen) {
            summe += zahl;
        }

        return (double) summe / zahlen.length;
    }
}