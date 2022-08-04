package ex02;

/**
 *
 * @author Jv Loreti
 */

public class ServidorEmails{
    private CaixaPostal caixasPostais[] = new CaixaPostal[4];
    
    public boolean adicionaCaixa(CaixaPostal conta){
        for(int i = 0; i < 4; i++){
            if(this.caixasPostais[i] == null){
                this.caixasPostais[i] = conta;
                return true;
            }
        }
        return false;
    }
    
    public void enviaEmail(Email email){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 2; j++){
                if(this.caixasPostais[i].conta == email.destinatarios[j]){
                   this.caixasPostais[i].setEmail(email);
                }
            }
        }
    }
    
    public void encaminhaEmail(Email email, String encaminhado){
        for(int i = 0; i < 4; i++){
            if(this.caixasPostais[i].conta == encaminhado){
                this.caixasPostais[i].setEmail(email);
            }
        }
    }
}
