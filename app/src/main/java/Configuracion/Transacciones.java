package Configuracion;

public class Transacciones {

    // Nombre de la BD
    public static  final  String DBName = "PM012024";

    //Creacion de las tablas de DB
    public static final String TablePersonas = "personas";

    // Creacion de los campos de DB
    public static final  String id = "id";
    public static final  String nombre = "nombre";
    public static final  String apellido = "apellido";
    public static final  String edad = "edad";
    public static final  String correo = "correo";

    //DDL Create
    public static String CreateTablePersonas = "Create table"+ TablePersonas+"("+"id INTENER PRIMARY KEY AUTOINCREMENT, " +
            "nombre TEXT, apellido TEXT," +
            "edad INTEGER, correo TEXT )";

    //DDL Drop
    public static final  String DropTablePersonas = "DROP TABLE IF EXISTS"+ TablePersonas;

    //DML
    public static final  String SelectAllPersonas = "SELECT * FROM"+ TablePersonas;

}
