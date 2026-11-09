/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obravisitor;

/**
 *
 * @author PICHAU
 */
public class ContratoObra {

    private String numero;
    private String descricao;
    private double valor;
    private double percentualConcluido;

    public ContratoObra(String numero, String descricao,
                        double valor, double percentualConcluido) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
        this.percentualConcluido = percentualConcluido;
    }

    public String getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public double getPercentualConcluido() {
        return percentualConcluido;
    }

    public void aceitar(ContratoVisitor visitor) {
        visitor.visitar(this);
    }
}
