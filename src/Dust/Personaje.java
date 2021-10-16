package Dust;

public class Personaje{
    private String raza,nombre;
    private int vida, velocidad, fuerza, resistencia, poderTotal,especial,moneda;

    public Personaje(){}

    public Personaje(String raza,String nombre){
        this.nombre = nombre;
        this.raza=raza;
    }

    public int getMoneda() {
        return moneda;
    }
    public int setMoneda(int moneda) {
        this.moneda = moneda;
        return moneda;
    }
    public String getRaza() {
        return raza;
    }
    public String setRaza(String raza) {
        this.raza = raza;
        return raza;
    }
    public int getEspecial() {
        return especial;
    }
    public int setEspecial(int especial) {
        this.especial = especial;
        return especial;
    }
    public int getPoderTotal() {
        return poderTotal;
    }
    public String getNombre() { return nombre; }
    public int getVida() {
        return vida;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public int getFuerza() {
        return fuerza;
    }
    public int getResistencia() {
        return resistencia;
    }
    public int setPoderTotal(int poderTotal) {
        this.poderTotal = poderTotal;
        return poderTotal;
    }
    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }
    public int setVida(int vida) {
        this.vida = vida;
        return vida;
    }
    public int setVelocidad(int velocidad) {
        this.velocidad = velocidad;
        return velocidad;
    }
    public int setFuerza(int fuerza) { this.fuerza = fuerza;
        return fuerza;
    }
    public int setResistencia(int resistencia) {
        this.resistencia = resistencia;
        return resistencia;
    }

}
