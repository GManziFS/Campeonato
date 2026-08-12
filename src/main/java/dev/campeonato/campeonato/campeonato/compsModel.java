package dev.campeonato.campeonato.campeonato;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table (name = "tb_comps")

public class compsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_camp;

    private String nomeCamp;
    private String jogo;
    private int qtdJogadores;
    private int qtdRodadas;
    private String premio;
    private String winner;
    private String descricao;
    private String status;
    private LocalDate datInicio;
    private LocalTime hora;

    public long getId_camp() {
        return id_camp;
    }

    public void setId_camp(long id_camp) {
        this.id_camp = id_camp;
    }

    public String getNomeCamp() {
        return nomeCamp;
    }

    public void setNomeCamp(String nomeCamp) {
        this.nomeCamp = nomeCamp;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public int getQtdJogadores() {
        return qtdJogadores;
    }

    public void setQtdJogadores(int qtdJogadores) {
        this.qtdJogadores = qtdJogadores;
    }

    public int getQtdRodadas() {
        return qtdRodadas;
    }

    public void setQtdRodadas(int qtdRodadas) {
        this.qtdRodadas = qtdRodadas;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDatInicio() {
        return datInicio;
    }

    public void setDatInicio(LocalDate datInicio) {
        this.datInicio = datInicio;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public compsModel() {
    }

    public compsModel(String nomeCamp, String jogo, int qtdJogadores, int qtdRodadas, String premio, String winner,
            String descricao, String status, LocalDate datInicio, LocalTime hora) {
        this.nomeCamp = nomeCamp;
        this.jogo = jogo;
        this.qtdJogadores = qtdJogadores;
        this.qtdRodadas = qtdRodadas;
        this.premio = premio;
        this.winner = winner;
        this.descricao = descricao;
        this.status = status;
        this.datInicio = datInicio;
        this.hora = hora;
    }
}
