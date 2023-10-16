/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_hiloss;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author Jesús
 */
public class EVA2_2_HILOSS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Runnable runnable = new Runnable(){
            @Override
            public void run() {
                // Cualquier tarea que se quiera ejecutar
                // No necesarimente de duración infinita
                for (int i = 0; i < 10; i++){
                System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EVA2_2_HILOSS.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            }

        };

Thread thread = new Thread(runnable);
        thread.start();
        classHilo Hilo = new classHilo();
        Hilo.start();
    }

}