/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import com.mycompany.obravisitor.AuditoriaVisitor;
import com.mycompany.obravisitor.ContratoObra;
import com.mycompany.obravisitor.RelatorioVisitor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContratoVisitorTest {

    @Test
    public void testarGeracaoRelatorio() {

        ContratoObra contrato = new ContratoObra(
                "001", "Construcao de escola", 500000, 75
        );

        RelatorioVisitor relatorio = new RelatorioVisitor();

        contrato.aceitar(relatorio);

        assertTrue(relatorio.getRelatorio().contains("001"));
        assertTrue(relatorio.getRelatorio().contains("500000.0"));
        assertTrue(relatorio.getRelatorio().contains("75.0%"));
    }

    @Test
    public void testarAuditoriaComAlerta() {

        ContratoObra contrato = new ContratoObra(
                "002", "Reforma de hospital", 300000, 30
        );

        AuditoriaVisitor auditoria = new AuditoriaVisitor();

        contrato.aceitar(auditoria);

        assertTrue(auditoria.getResultado().contains("ALERTA"));
    }

    @Test
    public void testarAuditoriaAprovada() {

        ContratoObra contrato = new ContratoObra(
                "003", "Construcao de ponte", 800000, 80
        );

        AuditoriaVisitor auditoria = new AuditoriaVisitor();

        contrato.aceitar(auditoria);

        assertTrue(auditoria.getResultado().contains("aprovado"));
    }
}
