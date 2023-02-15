package com.example.carlos_pons_garciaescaperoom;

public class Querys {
    public static String nModulos = "SELECT COUNT(m) FROM Modulo m";
    public static String nModulosConExamen = "SELECT COUNT(DISTINCT e.modulo) FROM Examen e";
    public static String notaMediaExamenes = "SELECT ROUND(AVG(e.nota), 0) FROM Examen e JOIN e.modulo m WHERE m.nombre = :modulo";
    public static String alumnosConXletra = "SELECT COUNT(a) FROM Alumno a WHERE a.apellidos LIKE :char";

    public static String getParameter(String s){
        for (String sting : s.split(" ")) {
            if (sting.contains(":")) return sting.substring(1);
        }
        return "";
    };

}
