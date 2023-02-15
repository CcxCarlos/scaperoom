package com.example.carlos_pons_garciaescaperoom;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class EscapeRoom {
    private static Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    public static void main(String[] args) {
        session.beginTransaction();
        int x=codigo1();
        int y=codigo2();
        int z=codigo3();
        int w=codigo4();
        System.out.println("El código descubierto es :" +x+y+z+w);
    }
    public static int codigo1() {
        return executeQuery(Querys.nModulos, Modulo.class);
    }
    public static int codigo2() {
        return executeQuery(Querys.nModulosConExamen, Modulo.class);
    }
    public static int codigo3() {
        return executeQuery(Querys.notaMediaExamenes,Querys.getParameter(Querys.notaMediaExamenes), "PRG", Examen.class);
    }
    public static int codigo4() {
        return executeQuery(Querys.alumnosConXletra, Querys.getParameter(Querys.alumnosConXletra), "%Z%", Alumno.class);
    }

    public static int executeQuery(String query, Class<?> clase) {
        return ((Long)session.createQuery(query, clase).uniqueResult()).intValue();
    }

    public static int executeQuery(String query, String parameter, String parameterValue, Class<?> clase) {
        Query q = session.createQuery(query, clase);
        q.setParameter(parameter, parameterValue);
        Object o = q.uniqueResult();
        if (o instanceof Double){
            return ((Double) o).intValue();
        }else {
            return ((Long) o).intValue();
        }
    }
}

