/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;

import jade.core.Agent;
import jade.wrapper.ControllerException;

/**
 *
 * @author Manuel
 */
public class AgenteEsqueleto extends Agent {

    @Override
    protected void setup() {
        try {
            //System.out.println("Se inicia la ejecución del agente: " + this.getName());
            System.out.println("Hola amigos, soy " + this.getLocalName()
                    + ". Acabo de inicial mi ejecución y estoy en "
                    + this.getContainerController().getContainerName());

        } catch (ControllerException e) {
            System.out.println("Excepcion ControllerException Producida!\n");
        }
    }

    @Override
    protected void takeDown() {
        System.out.println("Finaliza la ejecución del agente: " + this.getName());
    }

}
