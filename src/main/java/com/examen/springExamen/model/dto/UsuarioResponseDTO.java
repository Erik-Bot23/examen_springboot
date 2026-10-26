package com.examen.springExamen.model.dto;

import java.time.LocalDate;
import java.time.Period;

import com.examen.springExamen.model.entity.Domicilio;
import com.examen.springExamen.model.entity.Usuarios;

public class UsuarioResponseDTO {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombreUsuario;
    private LocalDate nacimiento;
    private int edad;
    private Domicilio domicilio;

    //Constructor que calcula la edad
    public UsuarioResponseDTO(Usuarios u){
        this.nombre = u.getNombre();
        this.nacimiento = u.getNacimiento();

        if(u.getNacimiento() != null){
            this.edad = Period.between(u.getNacimiento(), LocalDate.now()).getYears(); // Calcula la edad
        }

        this.domicilio = u.getDomicilio();
    }

    //Getter y setter de nombre
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    //Getter y setter de apellidoPaterno
    public String getApellidoPaterno(){
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno=apellidoPaterno;
    }

    //Getter y setter de apellidoMaterno
    public String getApellidoMaterno(){
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno=apellidoMaterno;
    }

    //Getter y setter de nombreUsuario
    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario=nombreUsuario;
    }

    //Getter y setter de nacimiento
    public LocalDate getNacimiento(){
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento){
        this.nacimiento=nacimiento;
    }

    //Getter y setter de edad
    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    //Getter y setter de domicilio
    public Domicilio getDomicilio(){
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio){
        this.domicilio=domicilio;
    }
}
