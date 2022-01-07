package main.java.model;

import java.util.Date;

public class Giocatore {
    private Integer id;

    private String nome;

    private String cognome;

    private Date dataNascita;

    private Long idSquadra;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome == null ? null : nome.trim();
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome == null ? null : cognome.trim();
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Long getIdSquadra() {
        return idSquadra;
    }

    public void setIdSquadra(Long idSquadra) {
        this.idSquadra = idSquadra;
    }
}