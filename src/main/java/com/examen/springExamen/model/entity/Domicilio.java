package com.examen.springExamen.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "domicilios")
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String calle;
    private String numeroExterior;
    private String numeroInterior;
    private String colonia;
    private String codigoPostal;
    private String ciudad;

    //Getter y setter de id
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    //Getter y setter de calle
    public String getCalle(){
        return calle;
    }

    public void setCalle(String calle){
        this.calle=calle;
    }

    //Getter y setter de numeroExterior
    public String getNumeroExterior(){
        return numeroExterior;
    }

    public void setNumeroExterior(String numeroExterior){
        this.numeroExterior=numeroExterior;
    }

    //Getter y setter de numeroInterior
    public String getNumeroInterior(){
        return numeroInterior;
    }

    public void setNumeroInterior(String numeroInterior){
        this.numeroInterior=numeroInterior;
    }

    //Getter y setter de colonia
    public String getColonia(){
        return colonia;
    }

    public void setColonia(String colonia){
        this.colonia=colonia;
    }

    //Getter y setter de codigoPostal
    public String codigoPostal(){
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal){
        this.codigoPostal=codigoPostal;
    }

    //Getter y setter de ciudad
    public String getCiudad(){
        return ciudad;
    }

    public void setCiudad(String ciudad){
        this.ciudad=ciudad;
    }
}
