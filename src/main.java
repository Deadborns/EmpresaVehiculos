/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.HashMap;
public class main {
    public static void main(String[] args){
        Empresa empresa = new Empresa();
        Camioneta camioneta = 
                new Camioneta(10,4, 5, "HBN490", 56989451, "MercedesBenz", 2017, 60000000);
        Vagoneta vagoneta =
                new Vagoneta(8, "UIF684", 16416198, "Volkswagen", 2005, 45000000);
        empresa.RegisAuto(camioneta);
        empresa.RegisAuto(vagoneta);
        HashMap<String,Auto> autos =
                empresa.ListarAutos();
        
        for (Auto auto: autos.values()){
            System.out.println(auto.getNuSerie());
            System.out.println(auto.getPlaca());
        }
 
    }
}
