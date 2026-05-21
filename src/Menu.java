import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        RegistroVehiculos registroVehiculos = new RegistroVehiculos();

        int opcion;

        do {

            opcion = menu();

            switch (opcion) {
                case 1:
                    System.out.println("\n====================================");
                    System.out.println("         REGISTRAR VEHICULO ");
                    System.out.println("====================================");

                    System.out.print("[...] Placa  : ");
                    String placa = scanner.nextLine();

                    System.out.print("[...] Marca  : ");
                    String marca = scanner.nextLine();

                    System.out.print("[...] Modelo : ");
                    String modelo = scanner.nextLine();

                    System.out.print("[...] Año    : ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("[...] Color  : ");
                    String color = scanner.nextLine();

                    System.out.print("[...] Precio : ");
                    double precio = scanner.nextDouble();

                    registroVehiculos.registrarVehiculo(placa, marca, modelo, anio, color, precio);
                    break;
                
                case 2:
                    System.out.println("\n===================================="); 
                    System.out.println("[...] VEHICULOS REGISTRADOS ");
                    System.out.println("===================================="); 

                    registroVehiculos.mostrarVehiculos();
                    break;

                case 3:
                    System.out.println("\n===================================="); 

                    System.out.print("[...] Placa : ");
                    String placaBuscada = scanner.nextLine();

                    System.out.println("[...] VEHICULO REGISTRADO PLACA : " + placaBuscada);

                    registroVehiculos.buscarVehiculoPlaca(placaBuscada);
                    break;

                case 4:
                    System.out.println("\n===================================="); 

                    System.out.print("[...] Marca : ");
                    String marcaBuscada = scanner.nextLine();

                    System.out.println("[...] VEHICULOS REGISTRADOS MARCA : " + marcaBuscada.toUpperCase());

                    System.out.println("===================================="); 

                    registroVehiculos.mostrarVehiculosMarca(marcaBuscada);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("[...] Opcion : NO VALIDA ");
            }
      
        } while (opcion != 5);
    }

    public static int menu() {

        int opcion;

        System.out.println("\n====================================");
        System.out.println("        REGISTRO DE VEHICULOS         ");
        System.out.println("====================================\n");
        System.out.println("1. Registrar vehículo ");
        System.out.println("2. Mostrar vehículos ");
        System.out.println("3. Buscar vehículo por placa ");
        System.out.println("4. Mostrar vehículos por marca ");
        System.out.println("5. Salir \n");

        System.out.print("Opcion : ");

        opcion = scanner.nextInt();
        scanner.nextLine();

        return opcion;
    } 
}
