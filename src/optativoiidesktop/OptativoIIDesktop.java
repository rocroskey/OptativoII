/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package optativoiidesktop;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author lab217-11
 */
public class OptativoIIDesktop {
    
    private static String userDB="postgres";
    private static String passDB = "Alumno2023";
    private static String portDB= "5432";
    private static String dataBase="test";
    
    private static final String url= "jdbc:postgresql://localhost:5432/"+dataBase;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        try {
            Connection conn = DriverManager.getConnection(url, userDB, passDB);
            
        } catch (SQLException ex) {
            Logger.getLogger(OptativoIIDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
