/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.PteCompras;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Caio
 */
public class DaoPteCompras {
    public void insert(Object object) {
        PteCompras pteCompras = (PteCompras) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_pedro_escobar";
            user = "pedro_escobar";
            password = "pedro_escobar";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into pte_compras values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, pteCompras.getPteIdCompras());
            pst.setInt(2, pteCompras.getPteUsuarios());
            pst.setDate(3, null); //PteCompra
            pst.setString(4, pteCompras.getPteValor());
            pst.setString(5, pteCompras.getPteFormaPagamento());
            pst.setString(6, pteCompras.getPteStatusPagamento());
            pst.setString(7, pteCompras.getPteCodigoTransacao());
            pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            System.getLogger(DaoPteCompras.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (SQLException ex) {
            System.getLogger(DaoPteCompras.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } 

    }
}
