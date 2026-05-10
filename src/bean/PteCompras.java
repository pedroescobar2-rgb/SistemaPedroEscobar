/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;
import javax.print.DocFlavor;

/**
 *
 * @author Caio
 */
public class PteCompras {
    private int pteIdCompras;
    private int pteUsuarios;
    private Date pteCompra;
    private String pteValor;
    private String pteFormaPagamento;
    private String pteStatusPagamento;
    private String pteCodigoTransacao;

    public int getPteIdCompras() {
        return pteIdCompras;
    }

    public void setPteIdCompras(int pteIdCompras) {
        this.pteIdCompras = pteIdCompras;
    }

    public int getPteUsuarios() {
        return pteUsuarios;
    }

    public void setPteUsuarios(int pteUsuarios) {
        this.pteUsuarios = pteUsuarios;
    }

    public Date getPteCompra() {
        return pteCompra;
    }

    public void setPteCompra(Date pteCompra) {
        this.pteCompra = pteCompra;
    }

    public String getPteValor() {
        return pteValor;
    }

    public void setPteValor(String pteValor) {
        this.pteValor = pteValor;
    }

    public String getPteFormaPagamento() {
        return pteFormaPagamento;
    }

    public void setPteFormaPagamento(String pteFormaPagamento) {
        this.pteFormaPagamento = pteFormaPagamento;
    }

    public String getPteStatusPagamento() {
        return pteStatusPagamento;
    }

    public void setPteStatusPagamento(String pteStatusPagamento) {
        this.pteStatusPagamento = pteStatusPagamento;
    }

    public String getPteCodigoTransacao() {
        return pteCodigoTransacao;
    }

    public void setPteCodigoTransacao(String pteCodigoTransacao) {
        this.pteCodigoTransacao = pteCodigoTransacao;
    }
}
