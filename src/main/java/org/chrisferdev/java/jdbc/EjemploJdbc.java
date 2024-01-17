package org.chrisferdev.java.jdbc;

import org.chrisferdev.java.jdbc.modelo.Producto;
import org.chrisferdev.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.chrisferdev.java.jdbc.repositorio.Repositorio;
import org.chrisferdev.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {
        try (Connection conn = ConexionBaseDatos.getInstance()){

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            repositorio.listar().forEach(System.out::println);

            System.out.println(repositorio.porId(2L));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

