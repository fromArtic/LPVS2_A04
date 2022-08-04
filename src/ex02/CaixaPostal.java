package ex02;

/**
 *
 * @author Jv Loreti
 */

public class CaixaPostal{
    public String conta;
    public Email email;
    
    public CaixaPostal(String c){
        this.conta = c;
    }
    
    @Override
    public String toString(){
        String ret = "";
        ret += ">>> Caixa Postal de " + conta + "<<<\n";
        if(email != null){
            ret += "De: " + email.remetente + "\n";
            ret += "Para: [" + email.destinatarios[0] + ", " + email.destinatarios[1] + "]\n";
            ret += email.assunto + "\n";
            ret += email.mensagem + "\n";
        }
        return ret;
    }

    public void setEmail(Email email){
        this.email = email;
    }
}
