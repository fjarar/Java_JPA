/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flavio_jara_r_proyectojpa.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Intr4Snak3
 */
@Entity
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre_prov;
    private String direccion_prov;
    private String ciudad;
    private String provincia;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.flavio_jara_r_proyectojpa.entidades.Proveedor[ id=" + id + " ]";
    }

    /**
     * @return the nombre_prov
     */
    public String getNombre_prov() {
        return nombre_prov;
    }

    /**
     * @param nombre_prov the nombre_prov to set
     */
    public void setNombre_prov(String nombre_prov) {
        this.nombre_prov = nombre_prov;
    }

    /**
     * @return the direccion_prov
     */
    public String getDireccion_prov() {
        return direccion_prov;
    }

    /**
     * @param direccion_prov the direccion_prov to set
     */
    public void setDireccion_prov(String direccion_prov) {
        this.direccion_prov = direccion_prov;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
}
