package com.example.Gestion_Alumnos.controllers.Alumnos;

import com.example.Gestion_Alumnos.domain.Alumno;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/Alumnos")

public class AlumnosControllers {

    //Lista de recursos
    private List<Alumno> alumnos = new ArrayList<>(Arrays.asList(
            new Alumno(1,"laura garcia", "email1", 1,"ciencia de la computacion1"),
            new Alumno(2,"laura garcia2", "email2", 2,"ciencia de la computacion2"),
            new Alumno(3,"laura garcia3", "email3", 3,"ciencia de la computacion3"),
            new Alumno(4,"laura garcia4", "email4", 4,"ciencia de la computacion4")

    ));
    @GetMapping
    public List<Alumno> getAlumnos(){
        return alumnos;
    }

    @GetMapping("/{email}")
    public Alumno getAlumno(@PathVariable String email){

        for(Alumno a: alumnos){
            if(a.getEmail().equalsIgnoreCase(email)){
                return a;
            }
        }
        return null;
    }
    @PostMapping
    public Alumno postAlumno(@RequestBody Alumno a){
        alumnos.add(a);
        return a;
    }
    @PutMapping
    public Alumno putAlumno(@RequestBody Alumno a){

        for(Alumno alu: alumnos){
            if(alu.getId() == a.getId()){
                alu.setNombre(a.getNombre());
                alu.setEmail(a.getEmail());
                alu.setEdad(a.getEdad());
                alu.setCourso(a.getCourso());
                return a;
            }
        }
        return null;
    }
    @PatchMapping
    public Alumno patchAlumno(@RequestBody Alumno a){
        for(Alumno alu: alumnos){
            if(alu.getId() == a.getId()){
                if(alu.getNombre() != null) {
                  alu.setNombre(a.getNombre());
                }
                if(alu.getEmail() != null) {
                    alu.setEmail(a.getEmail());
                }
                if(alu.getEdad() != 0) {
                    alu.setEdad(a.getEdad());
                }
                if(alu.getCourso() !=  null) {
                alu.setCourso(a.getCourso());
                }
                return a;
            }
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public Alumno deletAlumno(@PathVariable int id){

        for(Alumno alu: alumnos){
           if(alu.getId()== id){
               alumnos.remove(alu);
               return alu;
           }
        }
        return null;
    }

}
