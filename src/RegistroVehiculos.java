import java.util.ArrayList;

public class RegistroVehiculos {
    
    ArrayList <Vehiculo> vehiculos = new ArrayList<>();

    //1. Registrar vehiculo
    public void registrarVehiculo(String placa, String marca, String modelo, int anio, String color, double precio) {

        for (Vehiculo vehiculo : vehiculos) {
        
            if (vehiculo.getPlaca().equals(placa)) {
                mostrarValidacionRegistro("Placa", "PLACA EXISTENTE");
                return;    
            }
        }   

        Vehiculo vehiculo = new Vehiculo(placa, marca, modelo, anio, color, precio);
        vehiculos.add(vehiculo);
        System.out.println("[...] Vehiculo : REGISTRADO ");
        System.out.println("====================================");
    }

    //2. Mostrar vehiculos
    public void mostrarVehiculos() {

        for (Vehiculo vehiculo : vehiculos) {
            mostrarVehiculo(vehiculo);
        }
    }

    //3. Buscar vehiculo por placa
    public void buscarVehiculoPlaca(String placa) {       

        Vehiculo vehiculo = buscarVehiculo(placa.toUpperCase());

        if (vehiculo != null) {
            System.out.println("[...] Vehiculo : ENCONTRADO ");
            System.out.println("===================================="); 
            mostrarVehiculo(vehiculo);
        }

        else {
            System.out.println("[...] Vehiculo : NO ENCONTRADO ");
            System.out.println("===================================="); 
        }
    }

    //4. Mostrar vehiculos por marca
    public void mostrarVehiculosMarca(String marca) {

        int contador = 0;

        for (Vehiculo vehiculo : vehiculos) {

            if (vehiculo.getMarca().equals(marca.toUpperCase())) {
                contador++;
                mostrarVehiculo(vehiculo);
            }
        }

        if (contador == 0) {
        System.out.println("[...] Vehiculo : NO HAY VEHICULOS " + marca); 
        }      
    }

    public void mostrarVehiculo(Vehiculo vehiculo) {
        
        System.out.println("[...] Vehiculo : " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        System.out.println("[...] Placa    : " + vehiculo.getPlaca());
        System.out.println("[...] Marca    : " + vehiculo.getMarca());
        System.out.println("[...] Modelo   : " + vehiculo.getModelo());
        System.out.println("[...] Año      : " + vehiculo.getAnio());
        System.out.println("[...] Color    : " + vehiculo.getColor());
        System.out.println("[...] Precio   : " + vehiculo.getPrecio());
        System.out.println("===================================="); 
    }


    public Vehiculo buscarVehiculo(String placa) {

        for (Vehiculo vehiculo : vehiculos) {

            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }
        }
        return null;
    }

     public static void mostrarValidacionRegistro(String atributo, String mensaje) {

        System.out.println("\n====================================");
        System.out.println("     ERROR REGISTRANDO VEHICULO ");
        System.out.println("====================================");
        System.out.println("Campo: " + atributo);
        System.out.println("Error: " + mensaje);
        System.out.println("====================================");
    }
}