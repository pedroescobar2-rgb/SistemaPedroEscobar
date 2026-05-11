/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.PteClientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Caio
 */
public class DaoPteClientes {
    public void insert(Object object) {
        PteClientes pteClientes = (PteClientes) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_pedro_escobar";
            user = "pedro_escobar";
            password = "pedro_escobar";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into pte_clientes values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, pteClientes.getPteIdCliente());
            pst.setString(2, pteClientes.getPteNome());
            pst.setString(3, pteClientes.getPteApelido());
            pst.setString(4, pteClientes.getPteEmail());
            pst.setString(5, pteClientes.getPteSenha());
            pst.setString(6, pteClientes.getPteCpf());
            pst.setString(7, pteClientes.getPteRg());
            pst.setDate(8, null); //dataNascimento
            pst.setDate(9, null); //dataCadastro
            pst.setString(10, pteClientes.getPteSexo());
            pst.setString(11, pteClientes.getPteCep());
            pst.setString(12, pteClientes.getPteEndereco());
            pst.setString(13, pteClientes.getPteNumero());
            pst.setString(14, pteClientes.getPteBairro());
            pst.setString(15, pteClientes.getPteCidade());
            pst.setString(16, pteClientes.getPteTelefone());
            pst.setString(17, pteClientes.getPteCelular());
            pst.setString(18, pteClientes.getPteAtivo());
            pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            System.getLogger(DaoPteClientes.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (SQLException ex) {
            System.getLogger(DaoPteClientes.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } 

    }
}
