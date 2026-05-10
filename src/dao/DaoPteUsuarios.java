/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.PteUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import testes.JdbcCrud;

/**
 *
 * @author Caio
 */
public class DaoPteUsuarios {
    
    @Override
    public void insert(Object object) {
        PteUsuarios pteUsuarios = (PteUsuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_pedro_escobar";
            user = "pedro_escobar";
            password = "pedro_escobar";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into pte_usuarios values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, pteUsuarios.getPteIdUsuarios());
            pst.setString(2, pteUsuarios.getPteNome());
            pst.setString(3, pteUsuarios.getPteApelido());
            pst.setString(4, pteUsuarios.getPteCpf());
            pst.setString(5, null); //pte_datanascimento
            pst.setString(6, pteUsuarios.getPteNivel());
            pst.setString(7, pteUsuarios.getPteSenha());
            pst.setString(8, pteUsuarios.getPteAtivo());
            pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {*
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
