package singleton;
import java.util.Scanner;

public class SingletonTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if(CurrentUser.isLoggedIn()) {
            System.out.println("User "
                    + CurrentUser.user().getUsername()
                    + "telah login");
        } else {
            System.out.println("Belum ada user yang login");
            System.out.println("Masukkan Email: ");
            String username = input.nextLine();
            System.out.println("Masukkan password: ");
            String password = input.nextLine();
            CurrentUser.login(username, password);
        }
        System.out.println("\nUser yang telah login:");
        System.out.println("Email: " + CurrentUser.user().getUsername());
        System.out.println("Password: " + CurrentUser.user().getPassword());
        System.out.println("\nUser akan logout...");
        CurrentUser.logout();
        System.out.println("User telah logout!");
        if(CurrentUser.isLoggedIn()) {
            System.out.println("Masih ada user yang login");
        } else {
            System.out.println("Tidak ada user yang login");
        }
    }
}

