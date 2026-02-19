/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Trabajo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ejerc4();
    }
    
    public static void ejerc1() {
        
        String[] menu={"saludar","despedirse","salir"};
        int menu1=JOptionPane.showOptionDialog(null, "selesccione una opcion", "", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null  , menu, menu[0]);
      
        if (menu1==0) {
            JOptionPane.showMessageDialog(null, "hola");
            
        } else if(menu1==1) {
         JOptionPane.showMessageDialog(null, "hasta pronto");
        
        }
        else if(menu1==2){
         JOptionPane.showMessageDialog(null, "salir");
        }
                
    } 
    public static void ejerc2() {
        String[]menu={"area del cuadrado","área del circulo","area del triangulo","calcula el area del rectangulo","salir"};
        int menu1=JOptionPane.showOptionDialog(null, "selesccione una opcion", "", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null  , menu, menu[0]);
        
        switch (menu1) {
            case 0:
                String l=JOptionPane.showInputDialog("ingrese el lado del cuadrado");
                double lado=Integer.parseInt(l);
                double totalcuadrado= lado*lado;
                
                break;
            case 1:
                String r= JOptionPane.showInputDialog("ingresa el radio");
                double radio= Integer.parseInt(r);
                double totalcirculo = Math.PI*(radio*radio);
            case 2:
                 String bas= JOptionPane.showInputDialog("ingresa la base der triangulo");
                 String alt= JOptionPane.showInputDialog("ingresa la altura del triangulo");
                 double base= Integer.parseInt(bas);
                 double altura= Integer.parseInt(alt);
                 double totaltriangulo= (base/altura)/2;
            case 3:
                String ba= JOptionPane.showInputDialog("ingresa la  base der rectangulo");
                String al= JOptionPane.showInputDialog("ingresa la altura del rectangulo");
                double base1= Integer.parseInt(ba);
                double altura1= Integer.parseInt(al);
                double totalrectangulo= base1*altura1;
            case 4:
                System.exit(0);
                 
           
        }
        
    }
    public static void ejerc3() {
        int menu1;
         int cantidadestudiantes=0;
        double sumamatematicas=0;
        double sumaingles=0;
        double sumaespañol=0;
        do{
         String[] menu={"registrar notas"," calcular promedio por materia","calcular proemdio total por curso","mostrar los estudiantes aprobados y reprobados","salir"};
         menu1=JOptionPane.showOptionDialog(null, "selesccione una opcion", "", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null  , menu, menu[0]);
        
        
        switch (menu1) {
            // registrar notas
            case 0:
                String est=JOptionPane.showInputDialog("ingresa la cantidad de estudiantes");
              cantidadestudiantes= Integer.parseInt(est);
                for(int i=0; i< cantidadestudiantes; i ++){
                    
                String nom= JOptionPane.showInputDialog("ingresa el nombre del estudiante");
                String n1= JOptionPane.showInputDialog("ingresa la nota de Matemáticas");
                String n2= JOptionPane.showInputDialog("ingresa la nota de Ingles");
                String n3= JOptionPane.showInputDialog("ingresa la nota de Español" );
                
                
                
                double matematicas= Double.parseDouble(n1);
                double ingles= Double.parseDouble(n2);
                double español= Double.parseDouble(n3);
                
                
                sumamatematicas += matematicas;
                sumaingles += ingles;
                sumaespañol+= español;
                }
                break;
                //calcular promedio por materia
            case 1:
                if (cantidadestudiantes>0) {
                    double promedio1= sumamatematicas/cantidadestudiantes;
                    double promedio2= sumaingles/cantidadestudiantes;
                    double promedio3= sumaespañol/cantidadestudiantes;
                 
                    JOptionPane.showMessageDialog(null,"el promedio en matematicas es:"+promedio1);
                    JOptionPane.showMessageDialog(null,"el promedio en ingles es:"+promedio2);
                    JOptionPane.showMessageDialog(null,"el promedio en español es:"+promedio3);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "primero debe registrar los estudiantes");
                }
                
                break;
                // calcular promedio total del curso
             case 2: 
        if (cantidadestudiantes>0 ) {
        double sumatotal= sumamatematicas+sumaespañol+sumaingles;
        double promediototal= sumatotal/(cantidadestudiantes*3);
        JOptionPane.showMessageDialog(null, "el promedio total del curso es:"+promediototal);
        
        } else {
         JOptionPane.showMessageDialog(null, "primero debe registrarse los estudiantes");   
        }
        break;
        //mostrar los estudiantes aprobados y reprobados
              case 3:
                  // salir
              case 4:
                  System.exit(0);
                      
        } 
        
       
        }while (menu1 != 2);
        
        

       

                
            
        
        
        
        
        
        
        
    }
    public static void ejerc4() {
        

        // Strings al inicio
        String cantidadStr;
        String nombre;
        String sexo;
        String listaHombres = "Hombres:\n";
        String listaMujeres = "Mujeres:\n";

        int n;

        cantidadStr = JOptionPane.showInputDialog("¿Cuántas personas va a ingresar?");
        n = Integer.parseInt(cantidadStr);

        String[] nombres = new String[n];
        String[] sexos = new String[n];

        for (int i = 0; i < n; i++) {

            nombre = JOptionPane.showInputDialog("Ingrese el nombre " + (i + 1));
            sexo = JOptionPane.showInputDialog("Ingrese el sexo (f/m) de " + nombre);

            nombres[i] = nombre;
            sexos[i] = sexo.toLowerCase();

            // Aquí mismo los clasificamos
            if (sexos[i].equals("m")) {
                listaHombres += nombres[i] + "\n";
            } else if (sexos[i].equals("f")) {
                listaMujeres += nombres[i] + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, listaHombres);
        JOptionPane.showMessageDialog(null, listaMujeres);
    }
}

    
        

    


    

