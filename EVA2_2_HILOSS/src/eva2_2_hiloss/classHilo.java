/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_hiloss;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author Jesús
 */
class classHilo extends Thread{
    @Override
    public void run() {
        super.run(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(2000);
                System.out.println("Clase Thread" + i);
            } catch (InterruptedException ex) {
                Logger.getLogger(classHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
