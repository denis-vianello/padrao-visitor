/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obravisitor;

/**
 *
 * @author PICHAU
 */
public class RelatorioVisitor implements ContratoVisitor {

    private String relatorio;

    @Override
    public void visitar(ContratoObra contrato) {
        relatorio = "RELATORIO DO CONTRATO DE OBRA\n"
                + "Numero: " + contrato.getNumero() + "\n"
                + "Descricao: " + contrato.getDescricao() + "\n"
                + "Valor: R$ " + contrato.getValor() + "\n"
                + "Percentual concluido: "
                + contrato.getPercentualConcluido() + "%";
    }

    public String getRelatorio() {
        return relatorio;
    }
}
