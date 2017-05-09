/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author SENA
 */
public class Aprendiz extends Persona {

    private Taxi taxi1;
    private Bus bus1;
    private Moto moto1;
    private Bicicleta bici1;

    public void setTaxi1(Taxi taxi1P) {
        this.taxi1 = taxi1P;
    }

    public Taxi getTaxi1() {
        return taxi1;
    }

    public void setBus1(Bus bus1P) {
        this.bus1 = bus1P;
    }

    public Bus getBus1() {
        return bus1;
    }

    public void setMoto1(Moto moto1P) {
        this.moto1 = moto1P;
    }

    public Moto getMoto1() {
        return moto1;
    }
   
    public void setBici1(Bicicleta bici1P){
        this.bici1=bici1P;
    }
    public Bicicleta getBicicleta1(){
    return bici1;
    }   
}
