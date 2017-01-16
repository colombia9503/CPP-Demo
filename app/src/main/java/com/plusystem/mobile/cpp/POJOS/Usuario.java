package com.plusystem.mobile.cpp.POJOS;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Santiago U. on 12/01/17.
 */

public class Usuario {
    private int codigo;
    private String cedula;
    private String nombre;
    private String usuario;
    private String clave;
    private String salt;
    private String rol;
    private int activo;
    private int borrado;

    public Usuario() {
    }

    public Usuario(int codigo, String cedula, String nombre, String usuario, String clave, String salt, String rol, int activo, int borrado) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
        this.salt = salt;
        this.rol = rol;
        this.activo = activo;
        this.borrado = borrado;
    }

    public Usuario(JSONObject object) {
        try {
            this.codigo = object.getInt("Codigo");
            this.cedula = object.getString("Cedula");
            this.nombre = object.getString("Nombre");
            this.usuario = object.getString("Usuario");
            this.clave = object.getString("Clave");
            this.salt = object.getString("Salt");
            this.rol = object.getString("Rol");
            this.activo = object.getInt("Activo");
            this.borrado = object.getInt("Borrado");
        }catch(JSONException ex) {
            ex.printStackTrace();
        }

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public int getBorrado() {
        return borrado;
    }

    public void setBorrado(int borrado) {
        this.borrado = borrado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "codigo=" + codigo +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", usuario='" + usuario + '\'' +
                ", clave='" + clave + '\'' +
                ", salt='" + salt + '\'' +
                ", rol='" + rol + '\'' +
                ", activo=" + activo +
                ", borrado=" + borrado +
                '}';
    }
}


