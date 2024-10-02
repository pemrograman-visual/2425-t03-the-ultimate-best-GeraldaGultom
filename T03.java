// 12S24044 DIANITA LORENSIA BR GINTING
// 12S24051 GERALDA NATALI GULTOM
import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, jenisdiskon, conclusion, margin;
        String judul;
        String penulis;
        String tahunTerbit;
        String penerbit;
        String formatBukuElektronik;
        double hargaPembelian;
        double minimumMargin;
        int stok;
        double rating;
        String kategori, bestPick, mustRead, recommended, average, low, kualitasBuku;

        iSBN = input.nextLine();
        while (!iSBN.equals("---")) {
            judul = input.nextLine();
            penulis = input.nextLine();
            tahunTerbit = input.nextLine();
            penerbit = input.nextLine();
            formatBukuElektronik = input.nextLine();
            hargaPembelian = input.nextDouble();
            minimumMargin = input.nextDouble();
            if (-(minimumMargin / hargaPembelian) > 0.4) {
                jenisdiskon = "Once in a lifetime";
            } else {
                if (0.2 < -(minimumMargin / hargaPembelian) && minimumMargin / hargaPembelian < 0.4) {
                    jenisdiskon = "Never come twice";
                } else {
                    if (-(minimumMargin / hargaPembelian) <= 0.2 && -(minimumMargin / hargaPembelian) > 0) {
                        jenisdiskon = "No regret";
                    } else {
                        jenisdiskon = "---";
                    }
                }
            }
            stok = input.nextInt();
            rating = input.nextDouble();
            if (rating >= 4.7 && rating <= 5.0) {
                kategori = "Best Pick";
            } else {
                if (rating >= 4.5 && rating <= 4.69) {
                    kategori = "Must Read";
                } else {
                    if (rating >= 4.0 && rating <= 4.49) {
                        kategori = "Recommended";
                    } else {
                        if (rating >= 3.0 && rating <= 3.99) {
                            kategori = "Average";
                        } else {
                            if (rating < 3.0 && rating <= 5.0) {
                                kategori = "Low";
                            } else {
                                kategori = "Error";
                            }
                        }
                    }
                }
            }
            if (jenisdiskon.equals("Once in a lifetime") && kategori.equals("Best Pick")) {
                conclusion = "The ultimate best";
            } else {
                conclusion = "---";
            }
            System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektronik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + kategori + "|" + jenisdiskon + "|" + conclusion);
            iSBN = input.nextLine();
        }
    }
}
