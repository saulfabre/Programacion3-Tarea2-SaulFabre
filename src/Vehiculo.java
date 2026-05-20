public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private double precio;

    public Vehiculo() {

    }

    public Vehiculo(String placa, String marca, String modelo, int anio, String color, double precio) {
        setPlaca(placa);
        setMarca(marca);
        setModelo(modelo);
        setAnio(anio);
        setColor(color);
        setPrecio(precio);
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPlaca(String placa) {
        if (placa.isEmpty()) {
            System.out.println("Placa : formato invalido ");
        }

        else {
            this.placa = placa;
        }
    }

    public void setMarca(String marca) {
        if (marca.isEmpty()) {
            System.out.println("Marca : formato invalido ");
        }

        else {
            this.marca = marca;
        }
    }

    public void setModelo(String modelo) {
        if (modelo.isEmpty()) {
            System.out.println("Modelo : formato invalido ");
        }

        else {
            this.modelo = modelo;
        }
    }

    public void setAnio(int anio) {
        if (anio < 1900 && anio > 2027) {
            System.out.println("Año : fecha invalida ");
        }

        else {
            this.anio = anio;
        }
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("Color : formato invalido ");
        }

        else {
            this.color = color;
        }
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }

        else {
            System.out.println("Precio : debe ser mayor a 0 ");
        }
    }    
}
