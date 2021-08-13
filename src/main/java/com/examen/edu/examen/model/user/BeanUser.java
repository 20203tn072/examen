package com.examen.edu.examen.model.user;

public class BeanUser {
    private String name;
    private String primer_apellido;
    private String segundo_apellido;
    private String pokemon;

    public BeanUser() {
    }

    public BeanUser(String name, String primer_apellido, String segundo_apellido, String pokemon) {
        this.name = name;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.pokemon = pokemon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getPokemon() {
        return pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }
}
