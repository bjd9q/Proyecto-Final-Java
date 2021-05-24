package Dust;

import java.sql.*;
import java.util.Scanner;

public final class Admin extends Personaje implements InterfcDB {
    private String nombreAdmin;
    private Connection connection;
    Scanner teclado = new Scanner(System.in);

    public Admin(String nombreAdmin) {
        this.nombreAdmin = nombreAdmin;
    }

    public void addPersonajeBD() {
        System.out.println("Orco,Humano,Mago");
        System.out.println("Escribe el tipo personaje que deseas agregar a la base de datos");
        String tipoPersonaje = teclado.next();
        if (tipoPersonaje.equals("Orco")) {
            insercioPersonajeOrcoBD();
        } else if (tipoPersonaje.equals("Humano")) {
            insercioPersonajeHumanoBD();
        } else if (tipoPersonaje.equals("Mago")) {
            insercioPersonajeMagoBD();
        } else {
            System.out.println("No puedes agregar a un personaje nuevo");
        }
    }
    private void insercioPersonajeOrcoBD() {
        try {
            String tipoOrco = setTipo("Orco");
            System.out.println("Introduce nombre de Orco");
            String nombre = teclado.next();
            String nombreOrco = setNombre(nombre);
            System.out.println("Introduce la vida del Orco");
            int vida=teclado.nextInt();
            int vidaM = setVida(vida);
            System.out.println("Introduce la velocidad del Orco ");
            int velocidad = teclado.nextInt();
            int velocidadM = setVelocidad(velocidad);
            System.out.println("Introduce la fuerza del Orco");
            int fuerza = teclado.nextInt();
            int fuerzaM = setFuerza(fuerza);
            System.out.println("Introduce la resistencia del Orco");
            int resis = teclado.nextInt();
            int resistenciaM = setResistencia(resis);
            System.out.println("Introduce el especia del Orco");
            int esp=teclado.nextInt();
            int especialM = setEspecial(esp);
            int poderOrcoTotal = vidaM+velocidadM+fuerzaM+resistenciaM+especialM;
            System.out.println("Creando Orco...");

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
            prepareStetement.setString(1, tipoOrco);
            prepareStetement.setString(2, nombreOrco);
            prepareStetement.setInt(3, vidaM);
            prepareStetement.setInt(4, velocidadM);
            prepareStetement.setInt(5, fuerzaM);
            prepareStetement.setInt(6, resistenciaM);
            prepareStetement.setInt(7, poderOrcoTotal);
            prepareStetement.setInt(8, especialM);
            prepareStetement.executeUpdate();;
        } catch (SQLException throwables) {
            System.out.println("Personaje existente");
        }
        System.out.println("Personaje introducido en la base de datos \n");

        System.out.printf("Tu personaje %s llamado %s ya ha sido creado y agregado a la base de datos %n: ",getTipo(),getNombre());
        System.out.println(" \n");
    }
    private void insercioPersonajeHumanoBD() {
        try {
            String tipoHumano = setTipo("Humano");
            System.out.println("Introduce nombre de Humano");
            String nombre = teclado.next();
            String nombreMago = setNombre(nombre);
            System.out.println("Introduce la vida del Humano");
            int vida=teclado.nextInt();
            int vidaM = setVida(vida);
            System.out.println("Introduce la velocidad del Humano ");
            int velocidad = teclado.nextInt();
            int velocidadM = setVelocidad(velocidad);
            System.out.println("Introduce la fuerza del Humano");
            int fuerza = teclado.nextInt();
            int fuerzaM = setFuerza(fuerza);
            System.out.println("Introduce la resistencia del Humano");
            int resis = teclado.nextInt();
            int resistenciaM = setResistencia(resis);
            System.out.println("Introduce el especia del Humano");
            int esp=teclado.nextInt();
            int especialM = setEspecial(esp);
            int poderHumanoTotal = vidaM+velocidadM+fuerzaM+resistenciaM+especialM;
            System.out.println("Creando Mago...");

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
            prepareStetement.setString(1, tipoHumano);
            prepareStetement.setString(2, nombreMago);
            prepareStetement.setInt(3, vidaM);
            prepareStetement.setInt(4, velocidadM);
            prepareStetement.setInt(5, fuerzaM);
            prepareStetement.setInt(6, resistenciaM);
            prepareStetement.setInt(7, poderHumanoTotal);
            prepareStetement.setInt(8, especialM);
            prepareStetement.executeUpdate();;
        } catch (SQLException throwables) {
            System.out.println("Personaje existente");
        }
        System.out.println("Personaje introducido en la base de datos \n");

        System.out.printf("Tu personaje %s llamado %s ya ha sido creado y agregado a la base de datos %n",getTipo(),getNombre());
    }
    private void insercioPersonajeMagoBD() {
        try {
           String tipoMago = setTipo("Mago");
           System.out.println("Introduce nombre de Mago");
           String nombre = teclado.next();
           String nombreMago = setNombre(nombre);
           System.out.println("Introduce la vida del Mago");
           int vida=teclado.nextInt();
           int vidaM = setVida(vida);
           System.out.println("Introduce la velocidad del Mago ");
           int velocidad = teclado.nextInt();
           int velocidadM = setVelocidad(velocidad);
           System.out.println("Introduce la fuerza del Mago");
           int fuerza = teclado.nextInt();
           int fuerzaM = setFuerza(fuerza);
            System.out.println("Introduce la resistencia del Mago");
           int resis = teclado.nextInt();
           int resistenciaM = setResistencia(resis);
            System.out.println("Introduce el especia del Mago");
           int esp=teclado.nextInt();
           int especialM = setEspecial(esp);
           int poderMagoTotal = vidaM+velocidadM+fuerzaM+resistenciaM+especialM;
            System.out.println("Creando Mago...");

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
            prepareStetement.setString(1, tipoMago);
            prepareStetement.setString(2, nombreMago);
            prepareStetement.setInt(3, vidaM);
            prepareStetement.setInt(4, velocidadM);
            prepareStetement.setInt(5, fuerzaM);
            prepareStetement.setInt(6, resistenciaM);
            prepareStetement.setInt(7, poderMagoTotal);
            prepareStetement.setInt(8, especialM);
            prepareStetement.executeUpdate();;
        } catch (SQLException throwables) {
            System.out.println("Personaje existente");
        }
        System.out.println("Personaje introducido en la base de datos \n");

        System.out.printf("Tu personaje %s llamado %s ya ha sido creado y agregado a la base de datos %n",getTipo(),getNombre());
    }
    public void verPersonaje(){
        System.out.printf("%s llamado %s  vida: %d | velocidad: %d | fuerza: %d | resistencia: %d | especial %d | poder total: %d",getTipo(),getNombre(),getVida()
                ,getVelocidad(),getFuerza(),getResistencia(),getEspecial(),getPoderTotal());
    }
    public void mostrarPersonajesDB(){
        try{
            String connectionUrl = "jdbc:mysql://localhost/juego";
            Connection conn = DriverManager.getConnection(connectionUrl, "root", "");
            String query = "SELECT * FROM personaje";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next())
            {
                String tipoP = rs.getString("tipo");
                String nombreP = rs.getString("nombre");
                int vidaP = rs.getInt("vida");
                int velocidad = rs.getInt("velocidad");
                int fuerza = rs.getInt("fuerza");
                int resistencia = rs.getInt("resistencia");
                int poderTotal = rs.getInt("poderTotal");
                int especial = rs.getInt("especial");

                // print the results
                System.out.format("%s, %s, %d, %d, %d, %d, %d %d\n", tipoP, nombreP, vidaP, velocidad,
                        fuerza,resistencia,poderTotal,especial);



            }
            st.close();
        }catch (Exception e){
            System.err.println("excepcion!  ");
            System.err.println(e.getMessage());

        }
    }
}
