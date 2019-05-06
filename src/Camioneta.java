/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Camioneta extends Auto{
    private int CapacidadCarga;
    private int Ejes;
    private int Rodadas;

    public Camioneta(int CapacidadCarga, int Ejes, int Rodadas, String placa, int nuserie, String marca, int year, double precio) {
        super(placa, nuserie, marca, year, precio);
        this.CapacidadCarga = CapacidadCarga;
        this.Ejes = Ejes;
        this.Rodadas = Rodadas;
    }

    public int getCapacidadCarga() {
        return CapacidadCarga;
    }

    public int getEjes() {
        return Ejes;
    }

    public int getRodadas() {
        return Rodadas;
    }

    public void setCapacidadCarga(int CapacidadCarga) {
        this.CapacidadCarga = CapacidadCarga;
    }

    public void setEjes(int Ejes) {
        this.Ejes = Ejes;
    }

    public void setRodadas(int Rodadas) {
        this.Rodadas = Rodadas;
    }

    
}
