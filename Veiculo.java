/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nuno
 */
public class Veiculo {
    int id_condutor;

    public Veiculo(int id_condutor) {
        this.id_condutor = id_condutor;
        Contadores.nVeiculos++;
    }
  
}
