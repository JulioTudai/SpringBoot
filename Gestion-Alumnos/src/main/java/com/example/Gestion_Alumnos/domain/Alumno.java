package com.example.Gestion_Alumnos.domain;

public class Alumno {
    //atributlos
    private int id;
    private String nombre;
    private String email;
    private int edad;
    private String courso;

    //constructor
    public Alumno(int id, String nombre, String email, int edad, String courso) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.courso = courso;
    }

    //getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCourso() {
        return courso;
    }

    public void setCourso(String courso) {
        this.courso = courso;
    }
}
