package Dust;

import java.sql.SQLException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) throws SQLException {

        Scanner teclado = new Scanner(System.in);
        Juego partida = new Juego("x2123v");
        Admin admin = new Admin("vwa");
        int opcion = 0;
        do {
            System.out.println("1. Iniciar juego rapido"); //Usuario
            System.out.println("2. Entrar como admin"); //Administrador
            System.out.println("3. Juega con tu personaje"); //Usuario
            System.out.println("4. Arcade");
            System.out.println("5. Guardar tu personaje en un fichero");
            System.out.println("6. Ver los personajes guardos en el fichero");
            System.out.println("7. Salir");
            System.out.println("Introduce opción: ");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    /** IMPORTANTE SE EJECUTA FUERA DEL INTELLIJ **/
                    System.out.println("Minimiza intelliJ para jugar");
                    /* partida rapida tendras que crear dos personajes a los cuales se les asignaran stats aleatorias
                    * con posibilidad de almacenar el personaje cuando termine la batalla */

                    partida.jugar();
                    break;
                case 2:
                    int opcion2 = 0;
                    do {
                        System.out.println("1. Crear personaje y añadirlo a base de datos");
                        System.out.println("2. Ver personaje agregado recientemente");
                        System.out.println("3. Ver personajes agregados a la base de datos");
                        System.out.println("4. Salir del modo admin");
                        System.out.println("Introduce opción: ");
                        opcion2 = teclado.nextInt();
                        switch (opcion2){
                            case 1:
                                /* podras crear un personaje desde 0 siempre y cuando sea tipo orco, humano o mago
                                * a estos podras darles la vida,resistencia,fuerza,velocidad que desees
                                * (el poder total sera la suma de todas la habilidades)*/
                                admin.addPersonajeBD();
                                break;
                            case 2:
                                /* mostrara los personajes agregados recientemente*/
                                admin.verPersonaje();
                                System.out.println("\n");
                                break;

                            case 3:
                                /* mostrara los personajes almacenados en la base de datos*/
                                admin.mostrarPersonajesDB();
                                System.out.println("\n");
                                break;
                        }
                    }while (opcion2!=4);
                    break;

                case 3:
                    int opcion3 = 0;
                    do {

                        System.out.println("1. Ingresa con tu personaje");
                        System.out.println("2. Crear nuevo personaje");
                        System.out.println("3. Salir");

                        System.out.println("Introduce opción: ");
                        opcion3 = teclado.nextInt();
                        switch (opcion3){
                            case 1:
                                /*Se pedira el nombre de tu personaje guardado en base de datos, una vez iniciado te dara la opcion de
                                * ver sus stats y posteriormente iniciar una batalla contra la cpu 'la batalla sera dependiendo de tu
                                * poder total si tienes un poder alto te enfrentaras a oponentes de mayor nivel. luego de de la batalla
                                * podras entrenar, hay dos tipos de entrenamiento basico y avanzado, basico coste de 8 monedas y avanzado de
                                * 16 ganaras monedas por cada batalla que ganes. si no tienes un personaje te dara la posibilidad de crear
                                * uno nuevo con stats ramdon '*/
                                partida.pExistente();
                                break;
                            case 2:
                                partida.crearPerToDB();
                                break;
                        }
                    }while (opcion3!=3);
                    break;

                case 4:
                    partida.modoArcade();
                    break;

                case 5:
                    partida.personajeWriter();

                    break;
                case 6:
                    partida.personajeRead();
                    break;
            }

        }while (opcion!=7);
    }
}

