import java.util.Locale;
import java.util.Scanner;
public class AccountTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu  número ");
        String number = scanner.next();
        
        System.out.println("Digite sua agencia");
        String agency = scanner.next();

        System.out.println("Digite seu nome");
        String name = scanner.next();
        scanner.next();
        
        System.out.println("Digite seu saldo da conta");
        double balance = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque");  
    }
}
