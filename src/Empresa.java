/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.*;

public class Empresa {
    private HashMap<String,Auto> autos;
    
   public Empresa(){
this.autos = new HashMap<>();
}
   public  void RegisAuto (Auto auto){
   this.autos.put(auto.getPlaca(), auto);
}
   public HashMap ListarAutos(){
return this.autos;
}
}
