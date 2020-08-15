package com.example.luism.carofit20.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Alimento implements Serializable {

    private String nombre;
    private String porcion;
    private String tipo;
    private String peso;

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Alimento(String tipo, String nombre, String porcion, String peso){
        this.tipo=tipo;
        this.nombre=nombre;
        this.porcion=porcion;
        this.peso=peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPorcion() {
        return porcion;
    }

    public void setPorcion(String porcion) {
        this.porcion = porcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
