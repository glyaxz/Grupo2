/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Glyaxz
 */
public class Libro extends Publicacion implements Prestable{
//    private int fecha;
//    private String isbn, titulo;
    private boolean prestable;
    public Libro(String id, String titulo, int fecha){
        super(id, titulo, fecha);
        this.prestable = true;
    }
    @Override
    public void devuelve() {
        this.prestable = true;
    }

    @Override
    public boolean estaPrestado() {
        return this.prestable;
    }
    
    public void presta(){
        if(this.prestable){
            this.prestable = false;
        }else{
            System.out.println("Lo siento, este libro ya está prestado");
        }
    }
    @Override
    public String toString(){
        if(prestable){
            return "ISBN: "+idPubl+", titulo: "+titulo+", año de publicacion: "+fechaLanz+" (no prestado)";
        }else{
            return "ISBN: "+idPubl+", titulo: "+titulo+", año de publicacion: "+fechaLanz+" (prestado)";
        }
    }
    
    
}
