package exec8;

import java.util.Scanner;

public class Acesso {
    
    Scanner sc = new Scanner(System.in);
    private String correctPassword;
    private String login;

    public Acesso() {}

    public Acesso(String correctPassword, String login) {
        this.correctPassword = correctPassword;
        this.login = login;
    }

    public String getPassword() {
        return correctPassword;
    }

    public String getLogin() {
        return login;
    }

    public void setUserLogin() {
        System.out.print("Login: ");
        this.login = sc.next();
    }

    public void correctPassword() {
        System.out.print("Senha correta: ");
        this.correctPassword = sc.next();
    }

    public void loginAcess() {
        int count = 0;
        while (count < 3) {
            System.out.print("Tentativas: ");
            String passwordAcess = sc.next();
            if (setNewPassword(passwordAcess)) {
                System.out.println("Login bem sucedido!");
                break;
            } else {
                System.out.println("Acesso não concedido");
                count += 1;
            }
        }
    
    }

    private Boolean setNewPassword(String newPassword) {
        if (!newPassword.equals(getPassword())) {
            return false;
        } else {   
            this.correctPassword = newPassword;
            return true; 
        }
    }

 
}
