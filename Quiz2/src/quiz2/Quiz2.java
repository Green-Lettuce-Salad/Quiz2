/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;

import javax.swing.JOptionPane;

/**
 *
 * @author johnn
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        
        cancion1.setIdCancion("1");
        cancion1.setTitulo("Spectre");
        cancion1.setAutor("Radiohead");
        cancion1.setDuracion("3:19");
        cancion1.setAnoCreacion(2015);
        
        JOptionPane.showMessageDialog(null, "Id cancion: "+cancion1.getIdCancion()+"\n"+"Titulo: "+cancion1.getTitulo()+"\n"+"Autor: "+cancion1.getAutor()+"\n"+"Duracion: "+cancion1.getDuracion()+"\n"+"Ano de creacion: "+cancion1.getAnoCreacion());
        
        Cancion cancion2 = new Cancion();
        
        cancion2.setIdCancion("2");
        cancion2.setTitulo("PRIDE.");
        cancion2.setAutor("Kendrick Lamar");
        cancion2.setDuracion("4:35");
        cancion2.setAnoCreacion(2017);
        
        JOptionPane.showMessageDialog(null, "Id cancion: "+cancion2.getIdCancion()+"\n"+"Titulo: "+cancion2.getTitulo()+"\n"+"Autor: "+cancion2.getAutor()+"\n"+"Duracion: "+cancion2.getDuracion()+"\n"+"Ano de creacion: "+cancion2.getAnoCreacion());
    }
}
