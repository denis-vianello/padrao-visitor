/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obravisitor;

/**
 *
 * @author PICHAU
 */
public class AuditoriaVisitor implements ContratoVisitor {

    private String resultado;

    @Override
    public void visitar(ContratoObra contrato) {

        if (contrato.getPercentualConcluido() < 50) {
            resultado = "ALERTA: Contrato "
                    + contrato.getNumero()
                    + " necessita de verificacao. "
                    + "Percentual de conclusao abaixo de 50%.";
        } else {
            resultado = "Contrato "
                    + contrato.getNumero()
                    + " aprovado na verificacao de execucao.";
        }
    }

    public String getResultado() {
        return resultado;
    }
}
