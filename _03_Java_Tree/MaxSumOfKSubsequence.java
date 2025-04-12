// Avem un nr de incasari pe zile si vrem sa calculam celemai mari incasari pe k zile consecutive

public class MaxSumOfKSubsequence {
    public static int sumaMaximaIncasari(int[] incasari, int nrZileConsecutive) {
        if (incasari.length < nrZileConsecutive) {
            System.out.println("Inputul e prea mic");
            return -1;
        }

        int sumaCurenta = 0;
        for (int i = 0; i < nrZileConsecutive; i++)
            sumaCurenta += incasari[i];

        int sumaMaxima = sumaCurenta;

        for (int i = nrZileConsecutive; i <= incasari.length - 1; i++) {
            sumaCurenta = sumaCurenta + incasari[i] - incasari[i - nrZileConsecutive];
            if (sumaCurenta > sumaMaxima)
                sumaMaxima = sumaCurenta;
        }
        return sumaMaxima;
    }

    public static void main(String[] args) {
        int[] incasari = {100, 200, 300, 500, 200, 10, 1000, 200, 5};
        System.out.println(sumaMaximaIncasari(incasari, 3));
    }
}