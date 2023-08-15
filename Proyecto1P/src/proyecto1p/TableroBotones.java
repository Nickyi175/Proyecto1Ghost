package proyecto1p;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class TableroBotones extends JPanel {
    
    int fantasmas1;
    int fantasmas2;
    int[][]Guia_botones;//Guia_botones=Guia_botones
    int[] VencidosJugador1;//VencidosVillanos=vencidosJugador1
    int[] VencidosJugador2;//VencidosHeroes=vencidosJugador2
    boolean turno = true, jugador1 = false, jugador2 = false; //jugador1=ganadorheroes  jugador2=ganadorvillanos
    Dimension CoordSeleccionada = null;
    Random aleatorio = new Random(); //r=aleatorio
    
    public TableroBotones() {
        Guia_botones = new int[6][6];
        //puse variable porque no es un numero,sino que cambia dependiendo del nivel
        VencidosJugador1 = new int[fantasmas1];
        VencidosJugador2 = new int[fantasmas2];
        for (int posicion = 0; posicion < VencidosJugador1.length; posicion++) {

            VencidosJugador1[posicion] = 0;

        }

        for (int posicion = 0; posicion < VencidosJugador2.length; posicion++) {

            VencidosJugador2[posicion] = 0;
        }
        //i=filas
        //j=columnas
        for (int filas = 0; filas< Guia_botones.length; filas++) {

            for (int columnas = 0; columnas < Guia_botones[0].length; columnas++) {
                Guia_botones[filas][columnas]=0;
            }
        }
        
        
        /*
        panel.setLayout(new GridLayout(FILAS, COLUMNAS));

        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                JButton boton = new JButton();
                add(boton);
            }
        }
        */
    }
    public int[][] getGuia_botones() {

        return Guia_botones;
       
    }
public void controlMovimientos(int posicionX,int posicionY){
    if(this.CoordSeleccionada==null){
        if (Guia_botones[posicionX][posicionY] == 0) {
                    return;
                }
        if ((this.turno && Guia_botones[posicionX][posicionY] > 0) ||
            (!this.turno && Guia_botones[posicionX][posicionY] < 0)) {
                this.CoordSeleccionada = new Dimension(posicionY, posicionX);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mover esta carta ya que no es su turno");
        }
    }else { //MOVER O COMBATE
                //este else es para seleccionar el movimiento osea a donde quiero poner la carta
                //este if es para que cuando en la dimension Guia_botones no haya nada yo pueda moverme ahi de lo contrario no    
           if (Guia_botones[posicionX][posicionY] == 0) {
               int deltaX = Math.abs(CoordSeleccionada.width - posicionY);
               int deltaY = Math.abs(CoordSeleccionada.height - posicionX);
                    //si esta vacilla esa coordenada deja colocar la carta
                     if ((deltaX <= 1 && deltaY == 0) || (deltaY <= 1 && deltaX == 0)) {
                Guia_botones[posicionX][posicionY] = Guia_botones[CoordSeleccionada.height][CoordSeleccionada.width];
                Guia_botones[CoordSeleccionada.height][CoordSeleccionada.width] = 0;
                CoordSeleccionada = null;
                setTurno(!this.turno); // Cambio de turno aquí
            } else {
                JOptionPane.showMessageDialog(null, "No se puede mover más de una posición o en diagonal");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se puede mover en diagonal las cartas");
            }
              /* if (posicionX == CoordSeleccionada.height || posicionY == CoordSeleccionada.width) {
                       if ((CoordSeleccionada.height + 1 == posicionX && CoordSeleccionada.width == posicionY)
                                || (CoordSeleccionada.height - 1 == posicionX && CoordSeleccionada.width == posicionY)
                                || (CoordSeleccionada.height == posicionX && CoordSeleccionada.width + 1 == posicionY)
                                || (CoordSeleccionada.height == posicionX && CoordSeleccionada.width - 1 == posicionY)){

                            Guia_botones[posicionX][posicionY] = Guia_botones[this.CoordSeleccionada.height][this.CoordSeleccionada.width];

                            Guia_botones[this.CoordSeleccionada.height][this.CoordSeleccionada.width] = 0;
                            //esta null porque ya no es necesario tener seleccionado el personaje
                            CoordSeleccionada = null;
                            

                        }else {
                        JOptionPane.showMessageDialog(null, "No se puede mover más de una posición");
                        return;
                    }
                 
        }else{
                 JOptionPane.showMessageDialog(null, "No se puede mover en diagonal las cartas");        
                    }   
                }*/

}

}
public boolean getTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;

    }
    public int[] getVencidosJugador1() {
        return VencidosJugador1;
    }

    public int[] getVencidosJugador2() {
        return VencidosJugador1;
    }

    public void setVencidosJugador1(int[] VencidosJugador1) {
        this.VencidosJugador1 = VencidosJugador1;
    }

    public void setVencidosJugador2(int[] VencidosJugador2) {
        this.VencidosJugador2 = VencidosJugador2;
    }

    public void setJugador1(boolean jugador1) {
        this.jugador1 = jugador1;
    }

    public boolean getJugador1() {
        return jugador1;
    }

    public void setJugador2(boolean jugador2) {
        this.jugador2 = jugador2;
    }

    public boolean getJugador2() {
        return jugador2;
    }
}

