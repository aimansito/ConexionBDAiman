/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
        Connection con = Conexionbd.getInstance();
    }
}
