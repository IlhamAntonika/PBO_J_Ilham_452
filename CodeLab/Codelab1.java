public class Codelab1 {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}
class Hewan {
    String nama;
    String jenis;
    String suara;

    public Hewan(String n, String j, String s) {
        nama = n;
        jenis = j;
        suara = s;
    }

    public void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
        System.out.println("Suara : " + suara);
        System.out.println();
    }
}
