/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Leocassio
 */
//Vai ser implementado nas classes abastratas
public interface PanificadoraAbstrata {
    BoloChocolate criarBoloChocolate(); 
    BoloMilho criarBoloMilho();
}
