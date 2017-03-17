/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author alan.teodoro
 */
public class Questoes {
    private int questao = 1, acertos = 0, erros = 0;

    public void setContagem(int contagem) {
        this.questao = contagem;
    }
    
    public void Questoes(JLabel titulo, JLabel pergunta, JRadioButton pergunta1, JRadioButton pergunta2,
    JRadioButton pergunta3){
        if(questao == 1)
        {
            titulo.setText("Questão 1");
            pergunta.setText("O que é uma String?");
            pergunta1.setText("Um conjunto de caracteres.");
            pergunta2.setText("Um conjunto de numeros inteiros.");
            pergunta3.setText("Um passo de dança.");
        }
    }
    
    public void Respostas(JRadioButton pergunta1, JRadioButton pergunta2,
    JRadioButton pergunta3, JLabel resposta1, JLabel resposta2, JLabel resposta3){
        if(questao == 1)
        {
            if(pergunta1.isSelected()){
                acertos++;
            }
            else{
                erros++;
            }
            resposta1.setForeground(Color.green);
            resposta1.setText("V");
            resposta2.setForeground(Color.red);
            resposta2.setText("X");
            resposta3.setForeground(Color.red);
            resposta3.setText("X");
            questao++;
        }
    }
}
