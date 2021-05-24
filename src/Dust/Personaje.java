package Dust;

public class Personaje{
    private String tipo,nombre;
    private int vida, velocidad, fuerza, resistencia, poderTotal,especial;

    public Personaje(){}

    public Personaje(String tipo,String nombre){
        this.nombre = nombre;
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public String setTipo(String tipo) {
        this.tipo = tipo;
        return tipo;
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
