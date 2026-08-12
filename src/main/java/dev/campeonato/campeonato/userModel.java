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

    private String nome;
    private String email;
    private int idade;
    private String nick;
    private String sexo;
    private int win;
    private int los;
    private int jgDisp;
    private int campDisp;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getLos() {
        return los;
    }

    public void setLos(int los) {
        this.los = los;
    }

    public int getJgDisp() {
        return jgDisp;
    }

    public void setJgDisp(int jgDisp) {
        this.jgDisp = jgDisp;
    }

    public int getCampDisp() {
        return campDisp;
    }

    public void setCampDisp(int campDisp) {
        this.campDisp = campDisp;
    }

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public userModel(String nome, String email, int idade, String nick, int win, String sexo, int los, int jgDisp,
            int campDisp) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.nick = nick;
        this.win = win;
        this.sexo = sexo;
        this.los = los;
        this.jgDisp = jgDisp;
        this.campDisp = campDisp;
    }
}
