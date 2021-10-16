package Dust;

import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public final class Juego implements InterfcDB {
    private String nombrePartida;
    private ArrayList<Jugador> listaJugador;
    private ArrayList<Personaje> listaPesonaje;
    Scanner teclado = new Scanner(System.in);
    Connection connection = null;

    public Juego() {
    }
    public Juego(String nombre) {
        this.nombrePartida = nombrePartida;
        listaJugador = new ArrayList();
    }

    private void agregarPersonajes(ArrayList<Personaje> personajes) {
        this.listaPesonaje = personajes;
        for (int i = 0; i < personajes.size(); i++) {
            for (int x = i + 1; x < personajes.size(); x++) {
                listaJugador.add(new Jugador(personajes.get(i), personajes.get(x)));
            }
        }
    }
    private void addStats() {
        for (int j = 0; j < listaJugador.size(); j++) {
            Jugador jugador = listaJugador.get(j);
            for (int i = 1; i < 2; i++) {
                for (int x = 2; x < 3; x++) {
                    jugador.addStatsPlayer1();
                    jugador.addStatsPlayer2();
                }
            }
        }
    }

    public void jugar() throws SQLException {
        Juego partida1 = new Juego("acth");
        ArrayList<Personaje> listaJugador = new ArrayList();
        Object[] oPersonajes = {"Orco", "Humano", "Mago", "Salir"};
        Object[] oStats = {"Ver stats"};
        String seleccion = "";
        String nombre;
        seleccion = (String) JOptionPane.showInputDialog(
                null
                , "Jugador 1 elije un personaje"
                , "Dust"
                , JOptionPane.QUESTION_MESSAGE
                , null
                , oPersonajes
                , 0);
        if (seleccion == "Humano") {
            listaJugador.add(new Personaje("Humano", nombre = JOptionPane.showInputDialog("Introduce nombre")));
            partida1.agregarPersonajes(listaJugador);
            seleccion = (String) JOptionPane.showInputDialog(null, "Jugador 2 elije un personaje", "Dust"
                    , JOptionPane.QUESTION_MESSAGE, null, oPersonajes, 0);
            if (seleccion == "Humano") {
                listaJugador.add(new Personaje("Humano", nombre = JOptionPane.showInputDialog("Introduce nombre")));
                partida1.agregarPersonajes(listaJugador);
                do {
                    seleccion = (String) JOptionPane.showInputDialog(null, "Jugador", "Dust",
                            JOptionPane.QUESTION_MESSAGE, null, oStats, 0);
                } while (seleccion != "Ver stats");
            } else if (seleccion == "Orco") {
                listaJugador.add(new Personaje("Orco", nombre = JOptionPane.showInputDialog("Introduce nombre")));
                partida1.agregarPersonajes(listaJugador);
                do {
                    seleccion = (String) JOptionPane.showInputDialog(null, "Jugador", "Dust"
                            , JOptionPane.QUESTION_MESSAGE, null, oStats, 0);
                } while (seleccion != "Ver stats");
            } else if (seleccion == "Mago") {
                listaJugador.add(new Personaje("Mago", nombre = JOptionPane.showInputDialog("Introduce nombre")));
                partida1.agregarPersonajes(listaJugador);
                do {
                    seleccion = (String) JOptionPane.showInputDialog(null, "Jugador", "Dust"
                            , JOptionPane.QUESTION_MESSAGE, null, oStats, 0);
                } while (seleccion != "Ver stats");
            }
        } else if (seleccion == "Orco") {
            listaJugador.add(new Personaje("Orco", nombre = JOptionPane.showInputDialog("Introduce nombre")));
            partida1.agregarPersonajes(listaJugador);
            seleccion = (String) JOptionPane.showInputDialog(null, "Jugador 2 elije un personaje", "Dust"
                    , JOptionPane.QUESTION_MESSAGE, null, oPersonajes, 0);
            if (seleccion == "Humano") {
                listaJugador.add(new Personaje("Humano", nombre = JOptionPane.showInputDialog("Introduce nombre")));
                partida1.agregarPersonajes(listaJugador);
                do {
                    seleccion = (String) JOptionPane.showInputDialog(null, "Jugador", "Dust",
                            JOptionPane.QUESTION_MESSAGE, null, oStats, 0);
                } while (seleccion != "Ver stats");

            } else if (seleccion == "Orco") {
                listaJugador.add(new Personaje("Orco", nombre = JOptionPane.showInputDialog("Introduce nombre")));
                partida1.agregarPersonajes(listaJugador);
                do {
                    seleccion = (String) JOptionPane.showInputDialog(null, "Jugador", "Dust",
                            JOptionPane.QUESTION_MESSAGE, null, oStats, 0);
                } while (seleccion != "Ver stats");


            } else if (seleccion == "Mago") {
                listaJugador.add(new Personaje("Mago", nombre = JOptionPane.showInputDialog("Introduce nombre")));
                partida1.agregarPersonajes(listaJugador);
                do {
                    seleccion = (String) JOptionPane.showInputDialog(null, "Jugador", "Dust"
                            , JOptionPane.QUESTION_MESSAGE, null, oStats, 0);
                } while (seleccion != "Ver stats");
            }

        } else if (seleccion == "Mago") {
            listaJugador.add(new Personaje("Mago", nombre = JOptionPane.showInputDialog("Introduce nombre")));
            partida1.agregarPersonajes(listaJugador);
            seleccion = (String) JOptionPane.showInputDialog(null, "Jugador 2 elije un personaje", "Dust"
                    , JOptionPane.QUESTION_MESSAGE, null, oPersonajes, 0);
            if (seleccion == "Humano") {
                listaJugador.add(new Personaje("Humano", nombre = JOptionPane.showInputDialog("Introduce nombre")));
                partida1.agregarPersonajes(listaJugador);
                do {
                    seleccion = (String) JOptionPane.showInputDialog(null, "Jugador", "Dust",
                            JOptionPane.QUESTION_MESSAGE, null, oStats, 0);
                } while (seleccion != "Ver stats");

            } else if (seleccion == "Orco") {
                listaJugador.add(new Personaje("Orco", nombre = JOptionPane.showInputDialog("Introduce nombre")));
                partida1.agregarPersonajes(listaJugador);
                do {
                    seleccion = (String) JOptionPane.showInputDialog(null, "Jugador", "Dust"
                            , JOptionPane.QUESTION_MESSAGE, null, oStats, 0);
                } while (seleccion != "Ver stats");

            } else if (seleccion == "Mago") {
                listaJugador.add(new Personaje("Mago", nombre = JOptionPane.showInputDialog("Introduce nombre")));
                partida1.agregarPersonajes(listaJugador);
                do {
                    seleccion = (String) JOptionPane.showInputDialog(null, "Jugador", "Dust"
                            , JOptionPane.QUESTION_MESSAGE, null, oStats, 0);
                } while (seleccion != "Ver stats");
            }


        }

        System.out.println("Creando personajes...");
        partida1.addStats();
        partida1.mostrarStats();
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Desea guardar personaje 1?");
        System.out.println("pulse 1 para continuar \npulse 0 para cancelar: ");
        opcion = teclado.nextInt();
        if (opcion == 1) {
            partida1.addToBddPersonaje1();
        } else {
            System.out.println("!personaje 1 no guardado");
        }
        System.out.println("Desea guardar personaje 2?");
        System.out.println("pulse 1 para continuar \npulse 0 para cancelar: ");
        opcion = teclado.nextInt();
        if (opcion == 1) {
            partida1.addToBddPersonaje2();
        } else {
            System.out.println("!personaje 2 no guardado");
        }
        partida1.verBatalla();
    }
    private void mostrarStats() {
        for (int i = 0; i < listaJugador.size(); i++) {
            JOptionPane.showMessageDialog(null,
                    "Tipo: " + listaJugador.get(i).getPersonaje1().getRaza()
                            + "\n" + "Nombre: " + listaJugador.get(i).getPersonaje1().getNombre()
                            + "\n" + "Vida: " + listaJugador.get(i).getPersonaje1().getVida()
                            + "\n" + "Velocidad: " + listaJugador.get(i).getPersonaje1().getVelocidad()
                            + "\n" + "Fuerza: " + listaJugador.get(i).getPersonaje1().getFuerza()
                            + "\n" + "Resistencia: " + listaJugador.get(i).getPersonaje1().getResistencia()
                            + "\n" + "Especial: " + listaJugador.get(i).getPersonaje1().getEspecial()
                            + "\n" + "Poder total: " + listaJugador.get(i).getPersonaje1().getPoderTotal()
                    , "Estadistica Jugador 1", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,
                    "Tipo: " + listaJugador.get(i).getPersonaje2().getRaza()
                            + "\n" + "Nombre: " + listaJugador.get(i).getPersonaje2().getNombre()
                            + "\n" + "Vida: " + listaJugador.get(i).getPersonaje2().getVida()
                            + "\n" + "Velocidad: " + listaJugador.get(i).getPersonaje2().getVelocidad()
                            + "\n" + "Fuerza: " + listaJugador.get(i).getPersonaje2().getFuerza()
                            + "\n" + "Resistencia: " + listaJugador.get(i).getPersonaje2().getResistencia()
                            + "\n" + "Especial: " + listaJugador.get(i).getPersonaje2().getEspecial()
                            + "\n" + "Poder total: " + listaJugador.get(i).getPersonaje2().getPoderTotal()
                    , "Estadistica Jugador 2", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,
                    "La batalla sera mostrada en consola: ", "!", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    private void verBatalla() {
        int[] surrogates = {0x2694, 0xFE0F};
        String vs = new String(surrogates, 0, surrogates.length);
        for (Jugador p : listaJugador) {
            int p1Plus = p.getPersonaje1().getPoderTotal();
            int p2Plus = p.getPersonaje2().getPoderTotal();
            int pPlus = p1Plus + p2Plus;
            System.out.printf("%s %s nivel %d   %s %s %s nivel %d %n", p.getPersonaje1().getRaza(), p.getPersonaje1().getNombre()
                    , p.getPersonaje1().getPoderTotal(),
                    vs, p.getPersonaje2().getRaza(), p.getPersonaje2().getNombre(), p.getPersonaje2().getPoderTotal());

            if (p.getPersonaje1().getPoderTotal() > p.getPersonaje2().getPoderTotal()) {
                System.out.printf("%s %s HA GANADO! ", p.getPersonaje1().getRaza(), p.getPersonaje1().getNombre());
                p.getPersonaje1().setPoderTotal(pPlus - 30);
                System.out.println("Upgrade de poder: " + (pPlus - 30));
                try {
                    String queryInsertPat = "UPDATE %s SET %s = ? WHERE %s = ? ";
                    String connectionURL = "jdbc:mysql://127.0.0.1/juego";
                    connection = DriverManager.getConnection(connectionURL, "root", "");
                    PreparedStatement prepareStetement = connection.prepareStatement(
                            String.format(queryInsertPat,
                                    InterfcDB.DB_TAB_CHR,
                                    InterfcDB.COL_TP_CHR_TAB,
                                    InterfcDB.COL_NAME_CHR_TAB));
                    prepareStetement.setInt(1, p.getPersonaje1().getPoderTotal());
                    prepareStetement.setString(2, p.getPersonaje1().getNombre());
                    prepareStetement.executeUpdate();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } else if (p.getPersonaje1().getPoderTotal() < p.getPersonaje2().getPoderTotal()) {
                System.out.printf("%s %s HA GANADO! ", p.getPersonaje2().getRaza(), p.getPersonaje2().getNombre());
                p.getPersonaje2().setPoderTotal(pPlus);
                System.out.println("Upgrade de poder: " + (pPlus - 30));
                try {
                    String queryInsertPat = "UPDATE %s SET %s = ? WHERE %s = ? ";
                    String connectionURL = "jdbc:mysql://127.0.0.1/juego";
                    connection = DriverManager.getConnection(connectionURL, "root", "");
                    PreparedStatement prepareStetement = connection.prepareStatement(
                            String.format(queryInsertPat,
                                    InterfcDB.DB_TAB_CHR,
                                    InterfcDB.COL_TP_CHR_TAB,
                                    InterfcDB.COL_NAME_CHR_TAB));
                    prepareStetement.setInt(1, p.getPersonaje2().getPoderTotal());
                    prepareStetement.setString(2, p.getPersonaje2().getNombre());
                    prepareStetement.executeUpdate();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } else {
                System.out.printf("El poder de tu %s es igual al poder de el %s", p.getPersonaje1().getRaza()
                        , p.getPersonaje2().getRaza());
                p.getPersonaje1().setPoderTotal(p1Plus);
                p.getPersonaje2().setPoderTotal(p2Plus);
            }
        }
    }
    public void pExistente() throws SQLException {
        ArrayList<Personaje> lista = new ArrayList<>();
        lista.add(new Personaje("Humano", "BOT"));
        lista.add(new Personaje("Humano", "BOT"));
        agregarPersonajes(lista);
        addStats();

        int option;
        System.out.println("Introduce el nombre de tu personaje");
        String nickname = teclado.next();

        try {
            String connectionURL = "jdbc:mysql://127.0.0.1/juego";
            connection = DriverManager.getConnection(connectionURL
                    , "root", "");

            Statement statement = connection.createStatement();
            String selectPat = "SELECT * FROM %s WHERE %s='%s'";
            ResultSet resultSet = statement.executeQuery(String.format(selectPat, InterfcDB.DB_TAB_CHR,
                    InterfcDB.COL_NAME_CHR_TAB,
                    nickname,
                    InterfcDB.COL_TYP_CHR_TAB));
            if (resultSet.next()) {
                String type = resultSet.getString(InterfcDB.COL_TYP_CHR_TAB);
                String name = resultSet.getString(InterfcDB.COL_NAME_CHR_TAB);
                int vida = resultSet.getInt(InterfcDB.COL_HP_CHR_TAB);
                int velocidad = resultSet.getInt(InterfcDB.COL_VEL_CHR_TAB);
                int fuerza = resultSet.getInt(InterfcDB.COL_STR_CHR_TAB);
                int resistencia = resultSet.getInt(InterfcDB.COL_RES_CHR_TAB);
                int total = resultSet.getInt(InterfcDB.COL_TP_CHR_TAB);
                int especial = resultSet.getInt(InterfcDB.COL_SPE_CHR_TAB);
                int moneda = resultSet.getInt(InterfcDB.COL_MON_CHR_TAB);
                System.out.printf("Bienvenido %s %s %n", type, name);
                System.out.println("Ver stats de tu personaje ");
                System.out.println("pulsa 0 para ver stats");
                System.out.println("pulsa 1 para cancelar");
                int opcionStats = teclado.nextInt();
                if (opcionStats == 0) {
                    System.out.printf("Tu %s llamado %s tiene:" +
                                    " %d vida | %d velocidad | %d fuerza | %d resistencia | %d fuerza Orca | %d Nivel %n",
                            type, name, vida, velocidad, fuerza, resistencia, especial, total);
                    System.out.println("Total monedas: " + moneda);
                    System.out.println("");
                }
                System.out.println("Desea iniciar una batalla vs la cpu?");
                System.out.println("pulsa 0 para iniciar batalla");
                System.out.println("pulsa 1 para abandonar");
                option = teclado.nextInt();
                if (option == 0) {
                    int[] surrogates = {0x2694, 0xFE0F};
                    String vs = new String(surrogates, 0, surrogates.length);
                    for (Jugador p : listaJugador) {
                        p.getPersonaje1().setRaza(type);
                        p.getPersonaje1().setNombre(name);
                        p.getPersonaje1().setVida(vida);
                        p.getPersonaje1().setVelocidad(velocidad);
                        p.getPersonaje1().setFuerza(fuerza);
                        p.getPersonaje1().setResistencia(resistencia);
                        p.getPersonaje1().setEspecial(especial);
                        p.getPersonaje1().setPoderTotal(total);
                        p.getPersonaje1().setMoneda(moneda);

                        int pPlus = total + p.getPersonaje2().getPoderTotal();
                        int vidaplus = vida + p.getPersonaje2().getVida();
                        int velplus = velocidad + p.getPersonaje2().getVelocidad();
                        int res = resistencia + p.getPersonaje2().getResistencia();
                        int f = fuerza + p.getPersonaje2().getFuerza();
                        int es = especial + p.getPersonaje2().getEspecial();


                        if (p.getPersonaje1().getPoderTotal() <= 110 && p.getPersonaje2().getPoderTotal() <= 110) {

                            System.out.printf("%s %s nivel %d   %s %s %s nivel %d %n", p.getPersonaje1().getRaza(), p.getPersonaje1().getNombre()
                                    , p.getPersonaje1().getPoderTotal(),
                                    vs, p.getPersonaje2().getRaza(), p.getPersonaje2().getNombre(), p.getPersonaje2().getPoderTotal());

                            if (p.getPersonaje1().getPoderTotal() > p.getPersonaje2().getPoderTotal()) {
                                System.out.printf("%s %s HA GANADO! ", p.getPersonaje1().getRaza(), p.getPersonaje1().getNombre());
                                p.getPersonaje1().setPoderTotal(pPlus - 30);
                                p.getPersonaje1().setVida(vidaplus);
                                p.getPersonaje1().setVelocidad(velplus);
                                p.getPersonaje1().setFuerza(f);
                                p.getPersonaje1().setResistencia(res);
                                p.getPersonaje1().setEspecial(es);
                                int plM = moneda + 8;
                                System.out.println("Upgrade de poder: " + (pPlus - 40));
                                System.out.println("Dinero ganado: " + (plM));
                                try {
                                    String queryInsertPat = "UPDATE %s SET %s = ?, %s = ? , %s = ?, %s = ?, %s = ?, %s = ?, %s = ? WHERE %s = ? ";
                                    connection = DriverManager.getConnection(connectionURL, "root", "");
                                    PreparedStatement prepareStetement = connection.prepareStatement(
                                            String.format(queryInsertPat,
                                                    InterfcDB.DB_TAB_CHR,
                                                    InterfcDB.COL_TP_CHR_TAB,
                                                    InterfcDB.COL_HP_CHR_TAB,
                                                    InterfcDB.COL_VEL_CHR_TAB,
                                                    InterfcDB.COL_STR_CHR_TAB,
                                                    InterfcDB.COL_RES_CHR_TAB,
                                                    InterfcDB.COL_SPE_CHR_TAB,
                                                    InterfcDB.COL_MON_CHR_TAB,
                                                    InterfcDB.COL_NAME_CHR_TAB
                                            ));
                                    prepareStetement.setInt(1, p.getPersonaje1().setPoderTotal(pPlus - 40));
                                    prepareStetement.setInt(2, p.getPersonaje1().setVida(vidaplus));
                                    prepareStetement.setInt(3, p.getPersonaje1().setVelocidad(velplus));
                                    prepareStetement.setInt(4, p.getPersonaje1().setFuerza(f));
                                    prepareStetement.setInt(5, p.getPersonaje1().setResistencia(res));
                                    prepareStetement.setInt(6, p.getPersonaje1().setEspecial(es));
                                    prepareStetement.setInt(7, p.getPersonaje1().setMoneda(plM));
                                    prepareStetement.setString(8, p.getPersonaje1().getNombre());
                                    prepareStetement.executeUpdate();
                                } catch (SQLException throwables) {
                                    throwables.printStackTrace();
                                }
                            } else if (p.getPersonaje1().getPoderTotal() < p.getPersonaje2().getPoderTotal()) {
                                System.out.println(" HAS PERDIDO! ");


                            } else {
                                System.out.printf("El poder de tu %s es igual al poder de el %s", p.getPersonaje1().getRaza()
                                        , p.getPersonaje2().getRaza());
                                p.getPersonaje1().setPoderTotal(total);
                            }


                        } else if (p.getPersonaje1().getPoderTotal() >= 110 && p.getPersonaje2().getPoderTotal() <= 110) {
                            int tota = 60 + (int) (Math.random() * 80);
                            p.getPersonaje2().setPoderTotal(tota);

                            System.out.printf("%s %s nivel %d   %s %s %s nivel %d %n", p.getPersonaje1().getRaza(), p.getPersonaje1().getNombre()
                                    , p.getPersonaje1().getPoderTotal(),
                                    vs, p.getPersonaje2().getRaza(), p.getPersonaje2().getNombre(), p.getPersonaje2().getPoderTotal());


                            if (p.getPersonaje1().getPoderTotal() > p.getPersonaje2().getPoderTotal()) {
                                System.out.printf("%s %s HA GANADO! ", p.getPersonaje1().getRaza(), p.getPersonaje1().getNombre());
                                p.getPersonaje1().setPoderTotal(pPlus - 30);
                                p.getPersonaje1().setVida(vidaplus);
                                p.getPersonaje1().setVelocidad(velplus);
                                p.getPersonaje1().setFuerza(f);
                                p.getPersonaje1().setResistencia(res);
                                p.getPersonaje1().setEspecial(es);
                                int plM = moneda + 8;
                                System.out.println("Upgrade de poder: " + (pPlus - 40));
                                System.out.println("Dinero ganado: " + (plM));

                                try {
                                    String queryInsertPat = "UPDATE %s SET %s = ?, %s = ? , %s = ?, %s = ?, %s = ?, %s = ?, %s = ? WHERE %s = ? ";
                                    connection = DriverManager.getConnection(connectionURL, "root", "");
                                    PreparedStatement prepareStetement = connection.prepareStatement(
                                            String.format(queryInsertPat,
                                                    InterfcDB.DB_TAB_CHR,
                                                    InterfcDB.COL_TP_CHR_TAB,
                                                    InterfcDB.COL_HP_CHR_TAB,
                                                    InterfcDB.COL_VEL_CHR_TAB,
                                                    InterfcDB.COL_STR_CHR_TAB,
                                                    InterfcDB.COL_RES_CHR_TAB,
                                                    InterfcDB.COL_SPE_CHR_TAB,
                                                    InterfcDB.COL_MON_CHR_TAB,
                                                    InterfcDB.COL_NAME_CHR_TAB));
                                    prepareStetement.setInt(1, p.getPersonaje1().setPoderTotal(pPlus - 40));
                                    prepareStetement.setInt(2, p.getPersonaje1().setVida(vidaplus));
                                    prepareStetement.setInt(3, p.getPersonaje1().setVelocidad(velplus));
                                    prepareStetement.setInt(4, p.getPersonaje1().setFuerza(f));
                                    prepareStetement.setInt(5, p.getPersonaje1().setResistencia(res));
                                    prepareStetement.setInt(6, p.getPersonaje1().setEspecial(es));
                                    prepareStetement.setInt(7, p.getPersonaje1().setMoneda(plM));
                                    prepareStetement.setString(8, p.getPersonaje1().getNombre());
                                    prepareStetement.executeUpdate();
                                } catch (SQLException throwables) {
                                    throwables.printStackTrace();
                                }
                            } else if (p.getPersonaje1().getPoderTotal() < p.getPersonaje2().getPoderTotal()) {
                                System.out.println(" HAS PERDIDO! ");
                            } else {
                                System.out.printf("El poder de tu %s es igual al poder de el %s", p.getPersonaje1().getRaza()
                                        , p.getPersonaje2().getRaza());
                                p.getPersonaje1().setPoderTotal(total);
                            }
                        }
                        //ENTRENAMIENTO

                        System.out.println("Quieres entrenar?");
                        System.out.println("0. si");
                        System.out.println("1. no");
                        int o = teclado.nextInt();
                        if (o == 0) {
                            System.out.println("Que tipo de entrenamiento quieres?");
                            System.out.println("0. entrenamiento basico coste de 8 monedas");
                            System.out.println("1. entrenamiento avanzado coste de 16 monedas");
                            System.out.println("2. salir");
                            int i = teclado.nextInt();
                            if (i == 0) {
                                if (moneda >= 8) {
                                    System.out.println("Iniciando entrenamiento base");
                                    vida += Math.random() * 12;
                                    velocidad += Math.random() * 12;
                                    fuerza += Math.random() * 2;
                                    resistencia += Math.random() * 12;
                                    especial += Math.random() * 12;
                                    total = vida + velocidad + fuerza + resistencia + especial;
                                    System.out.println("vida aumentada a: " + vida);
                                    System.out.println("velocidad aumentada a: " + velocidad);
                                    System.out.println("fuerza aumentada a: " + fuerza);
                                    System.out.println("resistencia aumentada a: " + resistencia);
                                    System.out.println("especial aumentada a: " + especial);
                                    System.out.println("ahora tu poder total es de " + total);
                                    int resta = p.getPersonaje1().setMoneda(moneda - 8);
                                    try {
                                        String queryInsertPat = "UPDATE %s SET %s = ?, %s = ? , %s = ?, %s = ?, %s = ?, %s = ?, %s = ? WHERE %s = ? ";
                                        connection = DriverManager.getConnection(connectionURL, "root", "");
                                        PreparedStatement prepareStetement = connection.prepareStatement(
                                                String.format(queryInsertPat,
                                                        InterfcDB.DB_TAB_CHR,
                                                        InterfcDB.COL_TP_CHR_TAB,
                                                        InterfcDB.COL_HP_CHR_TAB,
                                                        InterfcDB.COL_VEL_CHR_TAB,
                                                        InterfcDB.COL_STR_CHR_TAB,
                                                        InterfcDB.COL_RES_CHR_TAB,
                                                        InterfcDB.COL_SPE_CHR_TAB,
                                                        InterfcDB.COL_MON_CHR_TAB,
                                                        InterfcDB.COL_NAME_CHR_TAB));
                                        prepareStetement.setInt(1, p.getPersonaje1().setPoderTotal(total));
                                        prepareStetement.setInt(2, p.getPersonaje1().setVida(vida));
                                        prepareStetement.setInt(3, p.getPersonaje1().setVelocidad(velocidad));
                                        prepareStetement.setInt(4, p.getPersonaje1().setFuerza(fuerza));
                                        prepareStetement.setInt(5, p.getPersonaje1().setResistencia(resistencia));
                                        prepareStetement.setInt(6, p.getPersonaje1().setEspecial(especial));
                                        prepareStetement.setInt(7, p.getPersonaje1().setMoneda(resta));
                                        prepareStetement.setString(8, p.getPersonaje1().getNombre());
                                        prepareStetement.executeUpdate();
                                    } catch (SQLException throwables) {
                                        throwables.printStackTrace();
                                    }
                                    System.out.println("dinero restante: " + p.getPersonaje1().getMoneda());
                                } else {
                                    System.out.println("monedas insuficientes / agregando monedas ganadas recientemente");
                                }

                            } else if (i == 1) {
                                if (moneda >= 16) {
                                    System.out.println("Inicando entrenamiento avanzado");
                                    vida += 8 + (int) (Math.random() * 19);
                                    velocidad += 8 + (int) (Math.random() * 19);
                                    fuerza += 8 + (int) (Math.random() * 19);
                                    resistencia += 8 + (int) (Math.random() * 19);
                                    especial += 8 + (int) (Math.random() * 19);
                                    total = vida + velocidad + fuerza + resistencia + especial;
                                    System.out.println("vida aumentada a: " + vida);
                                    System.out.println("velocidad aumentada a: " + velocidad);
                                    System.out.println("fuerza aumentada a: " + fuerza);
                                    System.out.println("resistencia aumentada a: " + resistencia);
                                    System.out.println("especial aumentada a: " + especial);
                                    System.out.println("ahora tu poder total es de " + total);
                                } else {
                                    System.out.println("monedas insuficientes / agregando monedas ganadas recientemente");
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("Adios!");
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void crearPerToDB() throws SQLException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quieres crear un personaje?");
        System.out.println("pulsa 0 para continuar");
        System.out.println("pulsa 1 para cancelar");
        int ovp = teclado.nextInt();
        if (ovp == 0) {
            System.out.println("Que tipo de personaje quieres crear ");
            System.out.println("Orco, Humano o Mago");
            System.out.println("pulsa 0 para Orco");
            System.out.println("pulsa 1 para Humano");
            System.out.println("pulsa 2 para Mago");
            int opccion = teclado.nextInt();
            if (opccion == 0) {
                addOrco();
            } else if (opccion == 1) {
                addHumano();
            } else if (opccion == 2) {
                addMago();
            }
        }
    }
    private void addOrco() throws SQLException {
        ArrayList<Personaje> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce nombre de tu nuevo personaje");
        String nombre = teclado.next();
        lista.add(new Personaje("Orco", nombre));
        lista.add(new Personaje("Orco", nombre));
        agregarPersonajes(lista);
        addStats();
        addToBddPersonaje1();
    }
    private void addHumano() throws SQLException {
        ArrayList<Personaje> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce nombre de tu nuevo personaje");
        String nombre = teclado.next();
        lista.add(new Personaje("Humano", nombre));
        lista.add(new Personaje("Humano", nombre));
        agregarPersonajes(lista);
        addStats();
        addToBddPersonaje1();
    }
    private void addMago() throws SQLException {
        ArrayList<Personaje> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce nombre de tu nuevo personaje");
        String nombre = teclado.next();
        lista.add(new Personaje("Mago", nombre));
        lista.add(new Personaje("Humano", nombre));
        agregarPersonajes(lista);
        addStats();
        addToBddPersonaje1();
    }
    private void addToBddPersonaje1() throws SQLException {
        for (Jugador p : listaJugador) {
            try {
                String queryInsertPat = "INSERT INTO %s (%s,%s,%s,%s,%s,%s,%s,%s,%s) VALUES (?,?,?,?,?,?,?,?,?)";
                String connectionURL = "jdbc:mysql://127.0.0.1/juego";
                connection = DriverManager.getConnection(connectionURL, "root", "");

                PreparedStatement prepareStetement = connection.prepareStatement(
                        String.format(queryInsertPat,
                                InterfcDB.DB_TAB_CHR,
                                InterfcDB.COL_TYP_CHR_TAB,
                                InterfcDB.COL_NAME_CHR_TAB,
                                InterfcDB.COL_HP_CHR_TAB,
                                InterfcDB.COL_VEL_CHR_TAB,
                                InterfcDB.COL_STR_CHR_TAB,
                                InterfcDB.COL_RES_CHR_TAB,
                                InterfcDB.COL_TP_CHR_TAB,
                                InterfcDB.COL_SPE_CHR_TAB,
                                InterfcDB.COL_MON_CHR_TAB));
                prepareStetement.setString(1, p.getPersonaje1().getRaza());
                prepareStetement.setString(2, p.getPersonaje1().getNombre());
                prepareStetement.setInt(3, p.getPersonaje1().getVida());
                prepareStetement.setInt(4, p.getPersonaje1().getVelocidad());
                prepareStetement.setInt(5, p.getPersonaje1().getFuerza());
                prepareStetement.setInt(6, p.getPersonaje1().getResistencia());
                prepareStetement.setInt(7, p.getPersonaje1().getPoderTotal());
                prepareStetement.setInt(8, p.getPersonaje1().getEspecial());
                prepareStetement.setInt(9, p.getPersonaje1().getMoneda());
                prepareStetement.executeUpdate();
                System.out.println("Personaje creado");
            } catch (SQLException throwables) {
                throwables.getStackTrace();
            }
        }
    }
    private void addToBddPersonaje2() throws SQLException {
        for (Jugador p : listaJugador) {
            try {
                String queryInsertPat = "INSERT INTO %s (%s,%s,%s,%s,%s,%s,%s,%s,%s) VALUES (?,?,?,?,?,?,?,?,?)";
                String connectionURL = "jdbc:mysql://127.0.0.1/juego";
                connection = DriverManager.getConnection(connectionURL, "root", "");

                PreparedStatement prepareStetement = connection.prepareStatement(
                        String.format(queryInsertPat,
                                InterfcDB.DB_TAB_CHR,
                                InterfcDB.COL_TYP_CHR_TAB,
                                InterfcDB.COL_NAME_CHR_TAB,
                                InterfcDB.COL_HP_CHR_TAB,
                                InterfcDB.COL_VEL_CHR_TAB,
                                InterfcDB.COL_STR_CHR_TAB,
                                InterfcDB.COL_RES_CHR_TAB,
                                InterfcDB.COL_TP_CHR_TAB,
                                InterfcDB.COL_SPE_CHR_TAB,
                                InterfcDB.COL_MON_CHR_TAB));
                prepareStetement.setString(1, p.getPersonaje2().getRaza());
                prepareStetement.setString(2, p.getPersonaje2().getNombre());
                prepareStetement.setInt(3, p.getPersonaje2().getVida());
                prepareStetement.setInt(4, p.getPersonaje2().getVelocidad());
                prepareStetement.setInt(5, p.getPersonaje2().getFuerza());
                prepareStetement.setInt(6, p.getPersonaje2().getResistencia());
                prepareStetement.setInt(7, p.getPersonaje2().getPoderTotal());
                prepareStetement.setInt(8, p.getPersonaje2().getEspecial());
                prepareStetement.setInt(9, p.getPersonaje2().getMoneda());
                prepareStetement.executeUpdate();
                System.out.println("Personaje creado");
            } catch (SQLException throwables) {
                System.out.println("Personaje existente");
            }
        }
    }
    public void personajeWriter() {
        File file = new File("C:/Users/usuario/Desktop/proyecto-final/Proyecto-Java-AdamFerrer/src/resources/personaje.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileWriter fw = null;
        try {
            fw = new FileWriter(file, true);

            System.out.println("Introduce el nombre de tu personaje guardado");
            String nickname = teclado.next();

            String connectionURL = "jdbc:mysql://127.0.0.1/juego";
            connection = DriverManager.getConnection(connectionURL
                    , "root", "");

            Statement statement = connection.createStatement();
            String selectPat = "SELECT * FROM %s WHERE %s='%s'";
            ResultSet resultSet = statement.executeQuery(String.format(selectPat, InterfcDB.DB_TAB_CHR,
                    InterfcDB.COL_NAME_CHR_TAB,
                    nickname,
                    InterfcDB.COL_TYP_CHR_TAB));
            if (resultSet.next()) {
                String type = resultSet.getString(InterfcDB.COL_TYP_CHR_TAB);
                String name = resultSet.getString(InterfcDB.COL_NAME_CHR_TAB);
                int total = resultSet.getInt(InterfcDB.COL_TP_CHR_TAB);

                fw.write(type + " " + " " + name + " " + " poder: " + total);
                fw.write(" ");
                fw.write("\n");
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Personaje guardado");
            }
        } catch (NullPointerException | IOException | SQLException e) {
            System.out.println("eRror");
        }
    }
    public void personajeRead() {
        File file = new File("C:/Users/usuario/Desktop/proyecto-final/Proyecto-Java-AdamFerrer/src/resources/personaje.txt");
        System.out.println(file.exists());
        if (file.exists() && file.canRead()) {
            FileReader rf = null;
            try {
                rf = new FileReader(file);
                String personaje = "";
                int n = 0;
                while (true) {

                    if (!((n = rf.read()) != -1)) break;


                    personaje += (char) n;

                }
                System.out.println(personaje);
            } catch (IOException e) {
                System.out.println("error");
                e.printStackTrace();
            }
        } else {
            System.out.println("Fichero inexistente");
        }
    }
    public void modoArcade() throws SQLException {
        String nombre = "Thrall";

        try {
            String connectionURL = "jdbc:mysql://127.0.0.1/juego";
            connection = DriverManager.getConnection(connectionURL
                    , "root", "");

            Statement statement = connection.createStatement();
            String selectPat = "SELECT * FROM %s WHERE %s='%s'";
            ResultSet resultSet = statement.executeQuery(String.format(selectPat, InterfcDB.DB_TAB_CHR,
                    InterfcDB.COL_NAME_CHR_TAB,
                    nombre,
                    InterfcDB.COL_TYP_CHR_TAB));
            if (resultSet.next()) {
                String raza = resultSet.getString(InterfcDB.COL_TYP_CHR_TAB);
                String name = resultSet.getString(InterfcDB.COL_NAME_CHR_TAB);
                int vida = resultSet.getInt(InterfcDB.COL_HP_CHR_TAB);
                int velocidad = resultSet.getInt(InterfcDB.COL_VEL_CHR_TAB);
                int fuerza = resultSet.getInt(InterfcDB.COL_STR_CHR_TAB);
                int resistencia = resultSet.getInt(InterfcDB.COL_RES_CHR_TAB);
                int total = resultSet.getInt(InterfcDB.COL_TP_CHR_TAB);
                int especial = resultSet.getInt(InterfcDB.COL_SPE_CHR_TAB);
                System.out.println("**************************************************** PROLOGO *******************************************************");
                System.out.println("“El camino hacia la sabiduría se comienza a andar con un «no lo sé». La persona que sea incapaz de reconocer" +
                        "\n que no sabe, nunca será capaz de aprender nada.”\n" +
                        "— Thrall");
                System.out.println("Go'el es hijo de Durotan, antiguo jefe del clan Lobo Gélido y de Draka. Nació en el año 1 después del Portal \n" +
                        "Oscuro en su nuevo hogar en las Montañas de Alterac. Poco después de su nacimiento, Draka y el bebé acompañaron a Durotan \n" +
                        "a una reunión secreta con Orgrim Martillo Maldito en Loch Modan.\n");
                System.out.println("-------------- CAPITULO 1 ----------------");
                System.out.println("-------------- JUVENTUD ---------------\n");

                System.out.println(" " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + "Elige un camino" + " " + " " + " " + " " + " " + " " + " " + " " + " " + " ");
                System.out.println(" " + " " + " " + " " + " " + " " + " " + "LOBO GELIDO " + " " + " " + " " + " " + "LODONEGRO " + " " + " " + " " + " " + " " + " " + " " + " ");
                System.out.println("pulsa 1 para GLADIADOR");
                System.out.println("pulsa 2 para LODONEGRO");
                int op = teclado.nextInt();
                if (op == 1) {
                    System.out.println("** EN PROCESO **");

                } else if (op == 2) {
                    System.out.println("Lamentablemente, Durotan y Draka fueron asesinados a traición, y el bebé fue\n" +
                            "abandonado a la intemperie, sin embargo fue encontrado junto a los cadáveres de sus padres\n" +
                            "por un humano llamado Aedelas Lodonegro.\n\n");
                    System.out.println("Lodonegro se lo llevó al Castillo de Durnholde...");
                    System.out.println("y serias criado como un gerrero");
                    System.out.println("para demostrar tu valia deberas entrar en el coliseo\n");
                    System.out.println("pulsa 1 para continuar");
                    int op2 = teclado.nextInt();
                    if (op2 == 1) {
                        ArrayList<Personaje> lista = new ArrayList<>();
                        lista.add(new Personaje("Orco", "Gul'dan "));
                        agregarPersonajes(lista);
                        addStats();
                        System.out.println("ahora eres un gladiador, deberas luchas para ganar habilidades");
                        System.out.printf("%s %s tienes:" +
                                        "%d vida | %d velocidad | %d fuerza | %d resistencia | %d fuerza Orca | %d Nivel %n",
                                raza, name, vida, velocidad, fuerza, resistencia, especial, total);
                        System.out.println("primera batalla...\n");

                        for (Personaje o : lista) {
                            int t = 3 + (int) (Math.random() * 80);
                            String raza2 = o.getRaza();
                            String name2 = o.getNombre();
                            int tota = o.setPoderTotal(t);
                            System.out.printf("%s %s VS %s %s %n", raza, name, raza2, name2);
                            if (total > tota) {
                                System.out.printf("%s %s has ganado %n", raza, name);
                                int uTo = total + 8 * 5;
                                System.out.println("has vencido al Orco Gul'dan");
                                System.out.println("poder actual: " + uTo);
                                System.out.println("");

                                System.out.println("pulsa 1 para continuar");
                                int v = teclado.nextInt();
                                if (v == 1) {
                                    System.out.println("segunda batalla... \n");
                                    int x = 33 + (int) (Math.random() * 90);
                                    String raza3 = o.getRaza();
                                    String name3 = o.setNombre("Durotan");
                                    int tota2 = o.setPoderTotal(x);
                                    System.out.printf("%s %s VS %s %s %n", raza, name, raza3, name3);
                                    if (uTo > tota2) {
                                        System.out.printf("%s %s has ganado %n", raza, name);
                                        uTo = total * 4;

                                        System.out.println("has vencido al Orco epico Durotan");
                                        System.out.println("poder actual: " + uTo);
                                        System.out.println("");
                                    }
                                    System.out.println("pulsa 1 para continuar");
                                    int a = teclado.nextInt();
                                    if (a == 1) {
                                        System.out.println("batalla final... \n");
                                        int i = 33 + (int) (Math.random() * 120);
                                        String raza1 = o.getRaza();
                                        String name1 = o.setNombre("Eitrigg");
                                        int tota1 = o.setPoderTotal(x);
                                        System.out.printf("%s %s VS %s %s %n", raza, name, raza1, name1);
                                        if (uTo > tota1) {
                                            System.out.printf("%s %s has ganado %n", raza, name);
                                            uTo = total * 6;

                                            System.out.println("has vencido al jefe final el Orco legendario Eitrigg");
                                            System.out.println("poder actual: " + uTo);
                                            System.out.println("fin del modo arcade");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public String getNombrePartida() {
        return nombrePartida;
    }
    public void setNombrePartida(String nombrePartida) {
        this.nombrePartida = nombrePartida;
    }
    public ArrayList<Personaje> getListaPesonaje() {
        return listaPesonaje;
    }
    public void setListaPesonaje(ArrayList<Personaje> listaPesonaje) {
        this.listaPesonaje = listaPesonaje;
    }
}


