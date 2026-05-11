/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.PteJogos;
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
public class DaoPteJogos {

    public void insert(Object object) {
        PteJogos pteJogos = (PteJogos) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_pedro_escobar";
            user = "pedro_escobar";
            password = "pedro_escobar";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into pte_jogos values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, pteJogos.getPteIdJogo());
            pst.setInt(2, pteJogos.getPteFornecedor());
            pst.setString(3, pteJogos.getPteTitulo());
            pst.setString(4, pteJogos.getPteDescricao());
            pst.setString(5, pteJogos.getPtePlataforma());
            pst.setString(6, pteJogos.getPteGenero());
            pst.setString(7, pteJogos.getPtePreco());
            pst.setDate(8, null); //DataLancamento
            pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            System.getLogger(DaoPteJogos.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (SQLException ex) {
            System.getLogger(DaoPteJogos.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } 

    }
}
