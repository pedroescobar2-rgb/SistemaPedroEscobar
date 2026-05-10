/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;

/**
 *
 * @author Caio
 */
public class PteAdministradores {
     private int pteIdAdmin;
     private String pteNome;
     private String pteEmail;
     private String pteSenha;
     private String pteAcesso;
     private Date pteDataCadastro;
     private Date pteUltimoAcesso;

    public int getPteIdAdmin() {
        return pteIdAdmin;
    }

    public void setPteIdAdmin(int pteIdAdmin) {
        this.pteIdAdmin = pteIdAdmin;
    }

    public String getPteNome() {
        return pteNome;
    }

    public void setPteNome(String pteNome) {
        this.pteNome = pteNome;
    }

    public String getPteEmail() {
        return pteEmail;
    }

    public void setPteEmail(String pteEmail) {
        this.pteEmail = pteEmail;
    }

    public String getPteSenha() {
        return pteSenha;
    }

    public void setPteSenha(String pteSenha) {
        this.pteSenha = pteSenha;
    }

    public String getPteAcesso() {
        return pteAcesso;
    }

    public void setPteAcesso(String pteAcesso) {
        this.pteAcesso = pteAcesso;
    }

    public Date getPteDataCadastro() {
        return pteDataCadastro;
    }

    public void setPteDataCadastro(Date pteDataCadastro) {
        this.pteDataCadastro = pteDataCadastro;
    }

    public Date getPteUltimoAcesso() {
        return pteUltimoAcesso;
    }

    public void setPteUltimoAcesso(Date pteUltimoAcesso) {
        this.pteUltimoAcesso = pteUltimoAcesso;
    }
}

