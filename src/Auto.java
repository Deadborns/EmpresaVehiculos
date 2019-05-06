/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Auto {
    protected String placa;
    protected int nuserie;
    protected String marca;
    protected int year;
    protected double precio;       

    public Auto(String placa, int nuserie, String marca, int year, double precio) {
        this.placa = placa;
        this.nuserie = nuserie;
        this.marca = marca;
        this.year = year;
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public int getNuserie() {
        return nuserie;
    }

    public String getMarca() {
        return marca;
    }

    public int getYear() {
        return year;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setNuserie(int nuserie) {
        this.nuserie = nuserie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
