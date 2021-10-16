package Dust;

public final class Jugador {
   private Personaje personaje1, personaje2;

    public Jugador(){}

    public Jugador(Personaje personaje1, Personaje personaje2) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
    }
    public void addStatsPlayer1(){
        int velocidad,resistencia,fuerza,vida,poderTotal,especialP1;
        velocidad = 5 + (int) (Math.random()*21);
        resistencia = 5 + (int) (Math.random()*21);
        fuerza = 5 + (int) (Math.random()*21);
        vida = 5 + (int) (Math.random()*21);
        especialP1=20+(int)(Math.random()*30);
        poderTotal = velocidad+resistencia+fuerza+vida+especialP1;
        getPersonaje1().setVelocidad(velocidad); //VELOCIDAD
        getPersonaje1().setResistencia(resistencia); //RESISTENCIA
        getPersonaje1().setFuerza(fuerza); //FUERZA
        getPersonaje1().setVida(vida); //VIDA
        getPersonaje1().setEspecial(especialP1);
        getPersonaje1().setPoderTotal(poderTotal);
        getPersonaje1().setMoneda(10);

    }
    public void addStatsPlayer2(){
        int velocidad,resistencia,fuerza,vida,poderTotal,especialP1;
        velocidad = 5 + (int) (Math.random()*21);
        resistencia = 5 + (int) (Math.random()*21);
        fuerza = 5 + (int) (Math.random()*21);
        vida = 5 + (int) (Math.random()*21);
        especialP1=20+(int)(Math.random()*30);
        poderTotal = velocidad+resistencia+fuerza+vida+especialP1;
        getPersonaje2().setVelocidad(velocidad); //VELOCIDAD
        getPersonaje2().setResistencia(resistencia); //RESISTENCIA
        getPersonaje2().setFuerza(fuerza); //FUERZA
        getPersonaje2().setVida(vida); //VIDA
        getPersonaje2().setEspecial(especialP1);
        getPersonaje2().setPoderTotal(poderTotal);
        getPersonaje2().setMoneda(10);
    }

    public Personaje getPersonaje1() {
        return personaje1;
    }
    public void setPersonaje1(Personaje personaje1) {
        this.personaje1 = personaje1;
    }
    public Personaje getPersonaje2() {
        return personaje2;
    }
    public void setPersonaje2(Personaje personaje2) {
        this.personaje2 = personaje2;
    }

}
