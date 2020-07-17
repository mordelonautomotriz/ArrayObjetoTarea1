/*
Implemente un algoritmo que le permita contener los datos de los objetos
correspondientes para el Diseño e implementación del modelo de conducción 
autónoma en un vehículo hibrido
 */
package arrayobjetotarea1;

/**
 * @author Hector Ortiz
 */

class Vehiculo_Autonomo{
    public int valor_voltaje;
    public int rapidez_pulso;
    public String tipo_sensor;
    
Vehiculo_Autonomo(int valor_voltaje, int rapidez_pulso, String tipo_sensor){
    this.valor_voltaje = valor_voltaje;
    this.rapidez_pulso = rapidez_pulso;
    this.tipo_sensor= tipo_sensor;
    }
}

public class ArrayObjetoTarea1 {

    public static void main(String[] args) {
        
        System.out.println("\t\tUniversidad de las Fuerzas Armadas Espe - Sede Latacunga\n");
        System.out.println("Materia: Programacion");
        System.out.println("NRC: 7450");
        System.out.println("Docente: Ing. Luis Guerra");
        System.out.println("Nombre del Estudiante: Ortiz Hector\n");
       Vehiculo_Autonomo[]arreglo;
       arreglo = new Vehiculo_Autonomo[10];
       
      arreglo[0] = new Vehiculo_Autonomo(5, 15,"Sensor Ultrasonico");
      arreglo[1] = new Vehiculo_Autonomo(10,30, "Sensor de Imagen");
      arreglo[2] = new Vehiculo_Autonomo(8, 45, "Sensor de Proximidad");
      arreglo[3] = new Vehiculo_Autonomo(11, 90,"Radar");
      arreglo[4] = new Vehiculo_Autonomo(9, 99,"Lidar(Laser Imaging Detection and Ranging)");
      arreglo[5] = new Vehiculo_Autonomo(12, 99,"Glonass(Global Navigation Satellite System)");
      arreglo[6] = new Vehiculo_Autonomo(11, 98,"Gps");
      arreglo[7] = new Vehiculo_Autonomo(9, 90,"Sensor de Presion");
      arreglo[8] = new Vehiculo_Autonomo(12, 89,"Sensor de Descaga");
      arreglo[9] = new Vehiculo_Autonomo(10, 99, "Sensor de Navegacion Optica");
      
      for(int i=0;i<arreglo.length;i++)
            System.out.println("El sensor ubicado en la posicion: " + i + " utiliza "
                    + "un voltaje de: " + arreglo[i].valor_voltaje + "V para funcionar,"
                    + "con pulsos de: " + arreglo[i].rapidez_pulso + " milisegundos,"
                            + "puesto que es un: " + arreglo[i].tipo_sensor);
    }   
}
