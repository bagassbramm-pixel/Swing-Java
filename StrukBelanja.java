import java.util.Locale;
import java.util.Scanner;

public class StrukBelanja {
    // Konstanta tarif PPN 11%
    static final double PPN = 0.11;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        // Input: nama barang, harga satuan, jumlah
        System.out.print("Nama barang   : ");
        String nama = in.nextLine();
        System.out.print("Harga satuan  : ");
        double harga = in.nextDouble();
        System.out.print("Jumlah        : ");
        int jumlah = in.nextInt();

        // Hitung subtotal, PPN, dan total
        double subtotal = harga * jumlah;
        double pajak = subtotal * PPN;
        double total = subtotal + pajak;

        // Tampilkan struk rapi dengan printf
        System.out.println();
        System.out.println("=== STRUK BELANJA ===");
        System.out.printf(Locale.US, "%-10s x%d%n", nama, jumlah);
        System.out.printf(Locale.US, "Subtotal : %12.2f%n", subtotal);
        System.out.printf(Locale.US, "PPN 11%%  : %12.2f%n", pajak);
        System.out.printf(Locale.US, "Total    : %12.2f%n", total);
    }
}