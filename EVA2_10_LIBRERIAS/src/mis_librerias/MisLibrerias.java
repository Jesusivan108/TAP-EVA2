/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mis_librerias;

/**
 *
 * @author Jesús
 */
public class MisLibrerias {
   
        public static int calculaFacto(int valor){
            int facto = 1;
            for(int i = 1; i <= valor; i++){
                facto*=i;
            }
            return facto;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
}
}