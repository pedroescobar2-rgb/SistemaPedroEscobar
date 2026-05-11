/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.PteAdministradores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Caio
 */
public class DaoPteAdministradores {

    public void insert(Object object) {
        PteAdministradores pteAdministradores = (PteAdministradores) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_pedro_escobar";
            user = "pedro_escobar";
            password = "pedro_escobar";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into pte_administradores values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, pteAdministradores.getPteIdAdmin());
            pst.setString(2, pteAdministradores.getPteNome());
            pst.setString(3, pteAdministradores.getPteEmail());
            pst.setString(4, pteAdministradores.getPteSenha());
            pst.setString(5, pteAdministradores.getPteAcesso());
            pst.setDate(6, null); //dataCadastro
            pst.setDate(7, null); //ultimoAcesso
            pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            System.getLogger(DaoPteAdministradores.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (SQLException ex) {
            System.getLogger(DaoPteAdministradores.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } 

    }
}
