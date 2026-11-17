public class AreaCirculo {
    private double radio;
    // Constructor que inicializa el radio del círculo
    public AreaCirculo(double radio) {
        this.radio = radio;
    }
    //obtenemos el radio del circulo
    public double getRadio() {
        return radio;
    }
    // Calcula el área del círculo utilizando la fórmula A = π * r^2
    public double calcularArea() {
        // Math.PI es una constante que representa el valor de π (pi)
        // Math.pow(radio, 2) eleva el radio al cuadrado
        return Math.PI * Math.pow(radio, 2);
    }
    public static void main(String[] args) {
        // Crea una instancia de AreaCirculo con un radio específico
        AreaCirculo circulo = new AreaCirculo(5.0);
        // Calcula el área del círculo utilizando el método calcularArea
        double area = circulo.calcularArea();
        System.out.println("El área del círculo con radio " + circulo.getRadio() + " es: " + area);
        
    }
}