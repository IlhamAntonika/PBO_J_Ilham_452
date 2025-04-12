import java.util.Scanner;

class Admin {
    String username;
    String password;
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("\nLogin Admin berhasil!");
        } else {
            System.out.println("\nLogin Admin gagal! Username atau password salah.");
        }
    }
}
class Mahasiswa {
    String nama;
    String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    public void login(String nama, String nim) {
        if (this.nama.equals(nama) && this.nim.equals(nim)) {
            displayInfo();
        } else {
            System.out.println("\nLogin Mahasiswa gagal! Nama atau NIM salah.");
        }
    }
    public void displayInfo() {
        System.out.println("\nLogin Mahasiswa berhasil!");
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM : " + this.nim);
    }
}
public class LoginSystem {
    public static void main(String[] args) {
        Admin admin = new Admin("Admin452", "Password452");
        Mahasiswa mahasiswa = new Mahasiswa("Ilham Antonika Wijaya", "202410370110452");

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== SELAMAT DATANG DI SISTEM LOGIN ==========");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih 1 jika login sebagai admin, pilih 2 jika login sebagai mahasiswa: ");
        String pilihan = scanner.nextLine();

        if (pilihan.equals("1")) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();
            admin.login(username, password);
        } else if (pilihan.equals("2")) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            mahasiswa.login(nama, nim);
        } else {
            System.out.println("\nPilihan tidak valid!");
        }

        scanner.close();
    }
}
