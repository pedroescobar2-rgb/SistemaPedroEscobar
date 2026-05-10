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
public class PteJogos {
    private int pteIdJogo;
    private int pteFornecedor;
    private String pteTitulo;
    private String pteDescricao;
    private String ptePlataforma;
    private String pteGenero;
    private String ptePreco;
    private Date pteDataLancamento;

    public int getPteIdJogo() {
        return pteIdJogo;
    }

    public void setPteIdJogo(int pteIdJogo) {
        this.pteIdJogo = pteIdJogo;
    }

    public int getPteFornecedor() {
        return pteFornecedor;
    }

    public void setPteFornecedor(int pteFornecedor) {
        this.pteFornecedor = pteFornecedor;
    }

    public String getPteTitulo() {
        return pteTitulo;
    }

    public void setPteTitulo(String pteTitulo) {
        this.pteTitulo = pteTitulo;
    }

    public String getPteDescricao() {
        return pteDescricao;
    }

    public void setPteDescricao(String pteDescricao) {
        this.pteDescricao = pteDescricao;
    }

    public String getPtePlataforma() {
        return ptePlataforma;
    }

    public void setPtePlataforma(String ptePlataforma) {
        this.ptePlataforma = ptePlataforma;
    }

    public String getPteGenero() {
        return pteGenero;
    }

    public void setPteGenero(String pteGenero) {
        this.pteGenero = pteGenero;
    }

    public String getPtePreco() {
        return ptePreco;
    }

    public void setPtePreco(String ptePreco) {
        this.ptePreco = ptePreco;
    }

    public Date getPteDataLancamento() {
        return pteDataLancamento;
    }

    public void setPteDataLancamento(Date pteDataLancamento) {
        this.pteDataLancamento = pteDataLancamento;
    }
}
