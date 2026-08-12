package dev.campeonato.campeonato;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")

public class userModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String nome;
    String email;
    int idade;
    String nick;
    String sexo;
    int win;
    int los;
    int jgDisp;
    int campDisp;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public userModel(String nome, String email, String idade, String nick, int vitorias) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.nick = nick;
        this.vitorias = vitorias;
    }
}
