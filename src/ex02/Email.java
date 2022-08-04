package ex02;

/**
 *
 * @author Jv Loreti
 */

public class Email{
    public String remetente;
    public String destinatarios[] = new String[2];
    public String assunto;
    public String mensagem;
    
    public Email(String rmt, String[] dst, String ass, String msg){
        this.remetente = rmt;
        this.destinatarios[0] = dst[0];
        this.destinatarios[1] = dst[1];
        this.assunto = ass;
        this.mensagem = msg;
    }
}
