package dev.campeonato.campeonato.campeonato;

import dev.campeonato.campeonato.user.userModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_userCamp")

public class userCampModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private userModel usuario;

    @ManyToOne
    @JoinColumn(name = "id_camp")
    private compsModel campeonato;

    public userModel getUsuario() {
        return usuario;
    }

    public void setUsuario(userModel usuario) {
        this.usuario = usuario;
    }

    public compsModel getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(compsModel campeonato) {
        this.campeonato = campeonato;
    }

    private int posicao;
    private int pontos;
    private int win;
    private int los;

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLos() {
        return los;
    }

    public void setLos(int los) {
        this.los = los;
    }

    public userCampModel() {
    }

    public userCampModel(userModel usuario, compsModel campeonato, int posicao, int pontos, int win, int los) {
        this.usuario = usuario;
        this.campeonato = campeonato;
        this.posicao = posicao;
        this.pontos = pontos;
        this.win = win;
        this.los = los;
    }
}
