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
            System.out.println("1. Iniciar juego rapido");
            System.out.println("2. Entrar como admin");
            System.out.println("3. Juega con tu personaje");
            System.out.println("4. Salir");
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
                    /* podras seleccionar un personaje guardado en la base de datos y posteriormente tendras la
                    * posibilidad de iniciar una batalla con el, el poder total sera aumentado si ganas y sera
                    * registrado en la base de datos */
                    partida.pExistente();
                    break;
            }

        }while (opcion!=4);
    }
}

