void main() {
    Scanner scanner = new Scanner(System.in);
    int[] arreglo1 = new int[7];
    int[] arreglo2 = new int[7];
    int[] diferencia = new int[7];
    int suma = 0;

    //Primer arreglo
    IO.println("Ingrese 7 números para el primer arreglo:");
    for (int i = 0; i < 7; i++) {
        IO.print("Número " + (i + 1) + ": ");
        arreglo1[i] = scanner.nextInt();
    }

    //Datos al segundo arreglo
    IO.println("\nIngrese 7 números para el segundo arreglo:");
    for (int i = 0; i < 7; i++) {
        IO.print("Número " + (i + 1) + ": ");
        arreglo2[i] = scanner.nextInt();
    }

    //Tercer Arreglo: Calcular diferencia entre arreglos anteriores
    for (int i = 0; i < 7; i++) {
        diferencia[i] = arreglo1[i] - arreglo2[i];
        suma += diferencia[i];
    }

    // Resultados
    IO.println("\nDiferencia de los arreglos:");
    for (int i = 0; i < 7; i++) {
        IO.println("Posición " + i + ": " + diferencia[i]);
    }

    //Promedio
    double promedio = (double) suma / 7;
    IO.println("\nPromedio de los datos: " + promedio);
    scanner.close();
}