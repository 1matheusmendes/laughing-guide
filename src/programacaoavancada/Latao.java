/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaoavancada;

import javax.swing.JOptionPane;

/**
 *
 * @author Matheus Mendes
 */
public class Latao {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int QuantidadeCobre = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos por cento de cobre: "));
        int QuantidadeZinco = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos por cento de zinco: "));
        double resultadoCobre;
        double resultadoZinco;
        double resultado;
        
        resultadoCobre = 0.7*QuantidadeCobre;
        resultadoZinco = 0.3*QuantidadeZinco;
        
        resultado = resultadoCobre + resultadoZinco;
        
        System.out.println("Para "+QuantidadeCobre+"% de Cobre e "+QuantidadeZinco+"% de Zinco: Temos "+resultado+"% de Latão");
    }    
}
