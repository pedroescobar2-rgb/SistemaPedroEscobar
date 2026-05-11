/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.PteFornecedores;
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
public class DaoPteFornecedores {

    public void insert(Object object) {
        PteFornecedores pteFornecedores = (PteFornecedores) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_pedro_escobar";
            user = "pedro_escobar";
            password = "pedro_escobar";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into pte_fornecedores values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, pteFornecedores.getPteIdFornecedores());
            pst.setString(2, pteFornecedores.getPteNome());
            pst.setString(3, pteFornecedores.getPteCnpj());
            pst.setDate(4, null); //DataRegistro
            pst.setString(5, pteFornecedores.getPteTelefoneComercial());
            pst.setString(6, pteFornecedores.getPteCelularWhatzapp());
            pst.setString(7, pteFornecedores.getPteEmailContato());
            pst.setString(8, pteFornecedores.getPteSite());
            pst.setString(9, pteFornecedores.getPteCep());
            pst.setString(10, pteFornecedores.getPteNumero());
            pst.setString(11, pteFornecedores.getPteBairro());
            pst.setString(12, pteFornecedores.getPteCidade());
            pst.setString(13, pteFornecedores.getPteComplemento());
            pst.setString(14, pteFornecedores.getPteEstado());
            pst.setDate(15, null); //DataCadastro
            pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            System.getLogger(DaoPteFornecedores.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (SQLException ex) {
            System.getLogger(DaoPteFornecedores.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } 

    }
}
