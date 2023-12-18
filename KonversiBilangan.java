import java.util.Scanner;

public class KonversiBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Pilih menu konversi:");
            System.out.println("1. Biner");
            System.out.println("2. Oktal");
            System.out.println("3. Desimal");
            System.out.println("4. Heksadesimal");
            System.out.println("0. Keluar");

            System.out.print("Masukkan pilihan menu: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    konversiBiner();
                    break;
                case 2:
                    konversiOktal();
                    break;
                case 3:
                    konversiDesimal();
                    break;
                case 4:
                    konversiHeksadesimal();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    break;
            }
        } while (menu != 0);
    }

    public static void konversiBiner() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan biner: ");
        String bilangan = input.nextLine();
        int desimal = Integer.parseInt(bilangan, 2);
        System.out.println("Hasil konversi ke desimal: " + desimal);
        System.out.println("Hasil konversi ke oktal: " + Integer.toOctalString(desimal));
        System.out.println("Hasil konversi ke heksadesimal: " + Integer.toHexString(desimal));
    }

    public static void konversiOktal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan oktal: ");
        String bilangan = input.nextLine();
        int desimal = Integer.parseInt(bilangan, 8);
        System.out.println("Hasil konversi ke desimal: " + desimal);
        System.out.println("Hasil konversi ke biner: " + Integer.toBinaryString(desimal));
        System.out.println("Hasil konversi ke heksadesimal: " + Integer.toHexString(desimal));
    }

    public static void konversiDesimal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan desimal: ");
        int desimal = input.nextInt();
        System.out.println("Hasil konversi ke biner: " + Integer.toBinaryString(desimal));
        System.out.println("Hasil konversi ke oktal: " + Integer.toOctalString(desimal));
        System.out.println("Hasil konversi ke heksadesimal: " + Integer.toHexString(desimal));
    }

    public static void konversiHeksadesimal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan heksadesimal: ");
        String bilangan = input.nextLine();
        int desimal = Integer.parseInt(bilangan, 16);
        System.out.println("Hasil konversi ke desimal: " + desimal);
        System.out.println("Hasil konversi ke biner: " + Integer.toBinaryString(desimal));
        System.out.println("Hasil konversi ke oktal: " + Integer.toOctalString(desimal));
    }
}