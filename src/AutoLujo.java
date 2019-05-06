/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class AutoLujo extends Auto{
    private int NoPasajeros;

    public AutoLujo(int NoPasajeros, String placa, int nuserie, String marca, int year, double precio) {
        super(placa, nuserie, marca, year, precio);
        this.NoPasajeros = NoPasajeros;
    }

    public int getNoPasajeros() {
        return NoPasajeros;
    }

    public void setNoPasajeros(int NoPasajeros) {
        this.NoPasajeros = NoPasajeros;
    }
    
    
}
