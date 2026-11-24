public class Rutina {

    //Atributos
    private String nombre;
    private String[] ejercicios;
    private String[] estiramientos;
    private int numEjercicios;
    private int numEstiramientos;

    public Rutina(String nombre, int maxEjercicios, int maxEstiramientos) {
        // Inicialización de la rutina
        this.nombre = nombre;
        ejercicios = new String[maxEjercicios];
        estiramientos = new String[maxEstiramientos];
        numEjercicios = 0;
        numEstiramientos = 0;
    }

    public String getNombre() {
        // Devuelve el nombre de la rutina

        return nombre; // @todo MODIFICAR PARA DEVOLVER EL NOMBRE DE LA RUTINA
    }

    public String[] getEjercicios() {
        // Devuelve los ejercicios de la rutina (array de longitud igual al número de ejercicios actuales)
        String[] copiaEjercicios = new String[numEjercicios];
        for (int i = 0; i < numEjercicios; i++) {
            copiaEjercicios[i] = ejercicios[i];
        }
        return copiaEjercicios; // @todo MODIFICAR PARA DEVOLVER LOS EJERCICIOS DE LA RUTINA
    }

    public String[] getEstiramientos() {
        // Devuelve los estiramientos de la rutina (array de longitud igual al número de estiramientos actuales)
        String[] copiaEstiramientos = new String[numEstiramientos];
        for (int i = 0; i < numEstiramientos; i++) {
            copiaEstiramientos[i] = estiramientos[i];
        }

        return copiaEstiramientos; // @todo MODIFICAR PARA DEVOLVER LOS ESTIRAMIENTOS DE LA RUTINA
    }

    public boolean agregarEjercicio(String ejercicio) {
        // Añade un ejercicio a la rutina (si está completa, muestra un mensaje de error)
        boolean agregado = false;

        if (numEjercicios < ejercicios.length){
            ejercicios[numEjercicios] = ejercicio;
            agregado = true;
            numEjercicios++;
        } else {
            System.out.println("No se pueden añadir más ejercicios.");
        }

        return agregado; // @todo MODIFICAR PARA DEVOLVER SI SE HA AÑADIDO EL EJERCICIO
    }

    public boolean agregarEstiramiento(String estiramiento) {
        // Añade un estiramiento a la rutina (si está completa, muestra un mensaje de error)
        boolean agregado = false;

        if (numEstiramientos < estiramientos.length){
            estiramientos[numEstiramientos] = estiramiento;
            agregado = true;
            numEstiramientos++;
        } else {
            System.out.println("No se pueden añadir más estiramientos.");
        }


        return agregado; // @todo MODIFICAR PARA DEVOLVER SI SE HA AÑADIDO EL ESTIRAMIENTO
    }

    public boolean ejerciciosCompletos() {
        // Comprueba si la rutina tiene el máximo de ejercicios
        return numEjercicios == ejercicios.length; // @todo MODIFICAR PARA DEVOLVER SI ESTÁN COMPLETOS LOS EJERCICIOS
    }

    public boolean estiramientosCompletos() {
        // Comprueba si la rutina tiene el máximo de estiramientos
        return numEstiramientos == estiramientos.length; // @todo MODIFICAR PARA DEVOLVER SI ESTÁN COMPLETOS LOS ESTIRAMIENTOS
    }

    public int numEjercicios() {
        // Devuelve el número de ejercicios de la rutina
        return numEjercicios; // @todo MODIFICAR PARA DEVOLVER EL NÚMERO DE EJERCICIOS
    }

    public int numEstiramientos() {
        // Devuelve el número de estiramientos de la rutina
        return numEstiramientos; // @todo MODIFICAR PARA DEVOLVER EL NÚMERO DE ESTIRAMIENTOS
    }

    @Override
    public String toString() {
        // Devuelve una representación en forma de cadena de la rutina, para mostrar por pantalla
        StringBuilder sb = new StringBuilder();
        
        sb.append("Rutina: ").append(nombre).append("\n");
        sb.append("Ejercicios:\n");
        for (int i = 0; i < numEjercicios; i++) {
            sb.append("- ").append(ejercicios[i]).append("\n");
        }
        sb.append("Estiramientos:\n");
        for (int i = 0; i < numEstiramientos; i++) {
            sb.append(i + 1).append(". ").append(estiramientos[i]).append("\n");
        }
        return sb.toString(); // @todo MODIFICAR PARA DEVOLVER LA CADENA CORRECTA
    }

    public String toRawString() {
        // Devuelve una representación en forma de cadena de la rutina sin formato, para guardar en archivo
        StringBuilder sb = new StringBuilder();

        sb.append(nombre).append("\n");
        for (int i = 0; i < numEjercicios; i++) {
            sb.append(ejercicios[i]).append("\n");
        }
        sb.append("ESTIRAMIENTOS\n");
        for (int i = 0; i < numEstiramientos; i++) {
            sb.append(estiramientos[i]).append("\n");
        }
        sb.append("=====\n");
        return sb.toString(); // @todo MODIFICAR PARA DEVOLVER LA CADENA CORRECTA
    }

    public int getMaxEjercicios() {
        // Devuelve el máximo de ejercicios permitidos en la rutina
        return ejercicios.length; // @todo MODIFICAR PARA DEVOLVER EL MÁXIMO DE EJERCICIOS
    }

    public int getMaxEstiramientos() {
        // Devuelve el máximo de estiramientos permitidos en la rutina
        return estiramientos.length; // @todo MODIFICAR PARA DEVOLVER EL MÁXIMO DE ESTIRAMIENTOS
    }
}
