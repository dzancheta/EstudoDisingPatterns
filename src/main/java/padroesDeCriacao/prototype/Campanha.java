package padroesDeCriacao.prototype;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by daniel on 11/09/17.
 */
public class Campanha implements Prototype<Campanha>{
    private String nome;
    private Calendar vencimento;
    private Set<String> palavraChave;

    public Campanha(String nome, Calendar vencimento, Set<String> palavraChave) {
        this.nome = nome;
        this.vencimento = vencimento;
        this.palavraChave = palavraChave;
    }

    public String getNome(){
        return nome;
    }

    public Calendar getVencimento(){
        return vencimento;
    }
    public Set<String> getPalavraChave(){
        return palavraChave;
    }

    public Campanha clone() {
        String nome = "Cópia da Campanha:" + this.nome;
        Calendar vencimento = (Calendar) this.vencimento.clone();
        Set<String> palavraChave = new HashSet<String>(this.palavraChave);
        Campanha campanha = new Campanha(nome,vencimento,palavraChave);

        return campanha;
    }
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("------------");
        buffer.append("\n");
        buffer.append("Nome da Campanha: ");
        buffer.append(this.nome);
        buffer.append("\n");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String format = simpleDateFormat.format(this.vencimento.getTime());
        buffer.append("Vencimento: " + format);
        buffer.append("\n");

        buffer.append("Palavra-chave:  \n");
        for (String palavraChave : this.palavraChave){
            buffer.append(" - " + palavraChave);
            buffer.append("\n");
        }
        buffer.append("------------");
        buffer.append("\n");

        return buffer.toString();

    }
}
