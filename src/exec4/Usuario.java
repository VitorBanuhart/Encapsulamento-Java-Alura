package exec4;

public class Usuario {

    private String psw;
    private boolean pswAlter = true;

    public Usuario(String psw) {
        this.psw = psw;
    }

    public void setPsw(String oldPsw, String newPsw) {
        if (this.psw.equals(oldPsw)) {
            this.psw = newPsw;
        } else {
            pswAlter = false;
        }
}

    @Override
    public String toString() {
        if (pswAlter == true) {
            return "Senha alterada com sucesso\n" + this.psw + " " + this.pswAlter;
        }
        return "Senha atual incorreta. A senha não foi alterada" + this.psw + " " + this.pswAlter;
    }
    
    
}