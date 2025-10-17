import CalculadoraJava.src.Calculadora;

public class PruebasRegresion {
    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        Calculadora calc = new Calculadora();

        System.out.println("=== PRUEBAS DE REGRESIÓN ===");

        // Ejemplos de pruebas para Operaciones
        probar("Suma", op.sumar(5, 3), 8);
        probar("Resta", op.restar(5, 3), 2);
        probar("Multiplicación", op.multiplicar(5, 3), 15);
        probar("División", op.dividir(6, 3), 2);

        // Si tu Calculadora tiene métodos parecidos, puedes probarlos también
        probar("Suma en Calculadora", op.sumar(10, 5), 15);

        System.out.println("=== PRUEBAS FINALIZADAS ===");
    }

    private static void probar(String nombrePrueba, double obtenido, double esperado) {
    if (obtenido == esperado) {
        System.out.println("[OK] " + nombrePrueba + " correcta (" + obtenido + ")");
    } else {
        System.out.println("[FALLÓ] " + nombrePrueba + " falló. Esperado: " + esperado + " | Obtenido: " + obtenido);
    }
}
}
