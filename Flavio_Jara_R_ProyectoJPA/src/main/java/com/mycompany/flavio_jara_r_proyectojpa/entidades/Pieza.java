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
public class Pieza implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre_pieza;
    private String color_pieza;
    private int precio;
    private int cat_pieza;
    private int prov_pieza;
    
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
        if (!(object instanceof Pieza)) {
            return false;
        }
        Pieza other = (Pieza) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.flavio_jara_r_proyectojpa.entidades.Pieza[ id=" + id + " ]";
    }

    /**
     * @return the nombre_pieza
     */
    public String getNombre_pieza() {
        return nombre_pieza;
    }

    /**
     * @param nombre_pieza the nombre_pieza to set
     */
    public void setNombre_pieza(String nombre_pieza) {
        this.nombre_pieza = nombre_pieza;
    }

    /**
     * @return the color_pieza
     */
    public String getColor_pieza() {
        return color_pieza;
    }

    /**
     * @param color_pieza the color_pieza to set
     */
    public void setColor_pieza(String color_pieza) {
        this.color_pieza = color_pieza;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the cat_pieza
     */
    public int getCat_pieza() {
        return cat_pieza;
    }

    /**
     * @param cat_pieza the cat_pieza to set
     */
    public void setCat_pieza(int cat_pieza) {
        this.cat_pieza = cat_pieza;
    }

    /**
     * @return the prov_pieza
     */
    public int getProv_pieza() {
        return prov_pieza;
    }

    /**
     * @param prov_pieza the prov_pieza to set
     */
    public void setProv_pieza(int prov_pieza) {
        this.prov_pieza = prov_pieza;
    }
    
}
