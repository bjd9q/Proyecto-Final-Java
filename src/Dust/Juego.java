package Dust;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public final class Juego implements InterfcDB {
    private String nombrePartida;
    private ArrayList<Jugador> listaJugador;
    private ArrayList<Personaje> listaPesonaje;
    Connection connection = null;

    public Juego() {
    }
    public Juego(String nombre) {
        this.nombrePartida = nombrePartida;
        listaJugador = new ArrayList();
    }

    public void agregarPersonajes(ArrayList<Personaje> personajes) {
        this.listaPesonaje = personajes;
        for (int i = 0; i < personajes.size(); i++) {
            for (int x = i + 1; x < personajes.size(); x++) {
                listaJugador.add(new Jugador(personajes.get(i), personajes.get(x)));
            }
        }
    }
    public void addStats() {
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

    // HE INTENTADO OPTIMIZAR ESTE METODO PERO NO HE SIDO CAPAZ
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
            seleccion = (String) JOptionPane.showInputDialog(null,"Jugador 2 elije un personaje", "Dust"
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
                    "Tipo: " + listaJugador.get(i).getPersonaje1().getTipo()
                            + "\n" + "Nombre: " + listaJugador.get(i).getPersonaje1().getNombre()
                            + "\n" + "Vida: " + listaJugador.get(i).getPersonaje1().getVida()
                            + "\n" + "Velocidad: " + listaJugador.get(i).getPersonaje1().getVelocidad()
                            + "\n" + "Fuerza: " + listaJugador.get(i).getPersonaje1().getFuerza()
                            + "\n" + "Resistencia: " + listaJugador.get(i).getPersonaje1().getResistencia()
                            + "\n" + "Especial: " + listaJugador.get(i).getPersonaje1().getEspecial()
                            + "\n" + "Poder total: " + listaJugador.get(i).getPersonaje1().getPoderTotal()
                    , "Estadistica Jugador 1", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,
                    "Tipo: " + listaJugador.get(i).getPersonaje2().getTipo()
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
            System.out.printf("%s %s nivel %d   %s %s %s nivel %d %n", p.getPersonaje1().getTipo(), p.getPersonaje1().getNombre()
                    , p.getPersonaje1().getPoderTotal(),
                    vs, p.getPersonaje2().getTipo(), p.getPersonaje2().getNombre(), p.getPersonaje2().getPoderTotal());
            if (p.getPersonaje1().getPoderTotal() > p.getPersonaje2().getPoderTotal()) {
                System.out.printf("%s %s HA GANADO! ", p.getPersonaje1().getTipo(), p.getPersonaje1().getNombre());
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
                System.out.printf("%s %s HA GANADO! ", p.getPersonaje2().getTipo(), p.getPersonaje2().getNombre());
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
                System.out.printf("El poder de tu %s es igual al poder de el %s", p.getPersonaje1().getTipo()
                        , p.getPersonaje2().getTipo());
                p.getPersonaje1().setPoderTotal(p1Plus);
                p.getPersonaje2().setPoderTotal(p2Plus);
            }
        }
    }
    public void pExistente() {
        ArrayList<Personaje> lista = new ArrayList<>();
        lista.add(new Personaje("Humano", "BOT"));
        lista.add(new Personaje("Humano", "BOT"));
        agregarPersonajes(lista);
        addStats();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ya tienes un personaje?");
        System.out.println("0. si");
        System.out.println("1. no");
        int option= teclado.nextInt();
        if (option==0) {
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
                    System.out.printf("Bienvenido %s %s %n", type, name);
                    System.out.println("Desea iniciar una batalla \n");
                    System.out.println("0. si");
                    System.out.println("1. no");
                    option=teclado.nextInt();
                    if (option==0){
                    int[] surrogates = {0x2694, 0xFE0F};
                    String vs = new String(surrogates, 0, surrogates.length);
                    for (Jugador p : listaJugador) {
                        int p1Plus = p.getPersonaje1().setPoderTotal(total);
                        int pPlus = p1Plus + p.getPersonaje2().getPoderTotal();
                        p.getPersonaje1().setTipo(type);
                        p.getPersonaje1().setNombre(name);
                        p.getPersonaje1().setVida(vida);
                        p.getPersonaje1().setVelocidad(velocidad);
                        p.getPersonaje1().setFuerza(fuerza);
                        p.getPersonaje1().setResistencia(resistencia);
                        p.getPersonaje1().setEspecial(especial);
                        p.getPersonaje1().setPoderTotal(total);
                        System.out.printf("%s %s nivel %d   %s %s %s nivel %d %n", p.getPersonaje1().getTipo(), p.getPersonaje1().getNombre()
                                , p.getPersonaje1().getPoderTotal(),
                                vs, p.getPersonaje2().getTipo(), p.getPersonaje2().getNombre(), p.getPersonaje2().getPoderTotal());
                        if (p.getPersonaje1().getPoderTotal() > p.getPersonaje2().getPoderTotal()) {
                            System.out.printf("%s %s HA GANADO! ", p.getPersonaje1().getTipo(), p.getPersonaje1().getNombre());
                            p.getPersonaje1().setPoderTotal(pPlus - 30);
                            System.out.println("Upgrade de poder: " + (pPlus - 30));
                            try {
                                String queryInsertPat = "UPDATE %s SET %s = ? WHERE %s = ? ";
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
                            System.out.printf("%s %s HA GANADO! ", p.getPersonaje2().getTipo(), p.getPersonaje2().getNombre());
                            p.getPersonaje2().setPoderTotal(pPlus);
                            System.out.println("Upgrade de poder: " + (pPlus - 30));
                            try {
                                String queryInsertPat = "UPDATE %s SET %s = ? WHERE %s = ? ";
                                connection = DriverManager.getConnection(connectionURL, "root", "");
                                PreparedStatement prepareStetement = connection.prepareStatement(
                                        String.format(queryInsertPat,
                                                InterfcDB.DB_TAB_CHR,
                                                InterfcDB.COL_TP_CHR_TAB,
                                                InterfcDB.COL_NAME_CHR_TAB
                                        ));
                                prepareStetement.setInt(1, p.getPersonaje2().getPoderTotal());
                                prepareStetement.setString(2, p.getPersonaje2().getNombre());
                                prepareStetement.executeUpdate();
                            } catch (SQLException throwables) {
                                throwables.printStackTrace();
                            }
                        } else {
                            System.out.printf("El poder de tu %s es igual al poder de el %s", p.getPersonaje1().getTipo()
                                    , p.getPersonaje2().getTipo());
                            p.getPersonaje1().setPoderTotal(p1Plus);
                            p.getPersonaje2().setPoderTotal(p.getPersonaje2().getPoderTotal());
                        }
                    }

                } else {
                    System.out.println("personaje no existe");
                }
            }

            }catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }else {
            System.out.println("bye");
        }
    }
    private void addToBddPersonaje1() throws SQLException {
        for (Jugador p : listaJugador) {
            try {
                String queryInsertPat = "INSERT INTO %s (%s,%s,%s,%s,%s,%s,%s,%s) VALUES (?,?,?,?,?,?,?,?)";
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
                                InterfcDB.COL_SPE_CHR_TAB));
                prepareStetement.setString(1, p.getPersonaje1().getTipo());
                prepareStetement.setString(2, p.getPersonaje1().getNombre());
                prepareStetement.setInt(3, p.getPersonaje1().getVida());
                prepareStetement.setInt(4, p.getPersonaje1().getVelocidad());
                prepareStetement.setInt(5, p.getPersonaje1().getFuerza());
                prepareStetement.setInt(6, p.getPersonaje1().getResistencia());
                prepareStetement.setInt(7, p.getPersonaje1().getPoderTotal());
                prepareStetement.setInt(8, p.getPersonaje1().getEspecial());
                prepareStetement.executeUpdate();
                ;
            } catch (SQLException throwables) {
                System.out.println("Personaje existente");
            }
        }
    }
    private void addToBddPersonaje2() throws SQLException {
        for (Jugador p : listaJugador) {
            try {
                String queryInsertPat = "INSERT INTO %s (%s,%s,%s,%s,%s,%s,%s,%s) VALUES (?,?,?,?,?,?,?,?)";
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
                                InterfcDB.COL_SPE_CHR_TAB));
                prepareStetement.setString(1, p.getPersonaje2().getTipo());
                prepareStetement.setString(2, p.getPersonaje2().getNombre());
                prepareStetement.setInt(3, p.getPersonaje2().getVida());
                prepareStetement.setInt(4, p.getPersonaje2().getVelocidad());
                prepareStetement.setInt(5, p.getPersonaje2().getFuerza());
                prepareStetement.setInt(6, p.getPersonaje2().getResistencia());
                prepareStetement.setInt(7, p.getPersonaje2().getPoderTotal());
                prepareStetement.setInt(8, p.getPersonaje2().getEspecial());
                prepareStetement.executeUpdate();
                ;
            } catch (SQLException throwables) {
                System.out.println("Personaje existente");
            }
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


