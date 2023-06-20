import java.sql.*;

//trabajando con sqlite en java

public class AlumnosCrud {
    // Ruta de la base de datos SQLite
    static final String URL = "jdbc:sqlite:alumnos.db";
    
    public static void main(String[] args) {
        // Crear la tabla "alumnos" si no existe
        crearTabla();
        
        // Agregar alumnos de ejemplo
        agregarAlumno("Juan", 20);
        agregarAlumno("María", 22);
        
        // Leer todos los alumnos
        System.out.println("Alumnos:");
        leerAlumnos();
        
        // Actualizar la edad de un alumno
        actualizarEdad("Juan", 21);
        
        // Leer nuevamente los alumnos
        System.out.println("Alumnos después de actualizar:");
        leerAlumnos();
        
        // Eliminar un alumno
        eliminarAlumno("María");
        
        // Leer nuevamente los alumnos
        System.out.println("Alumnos después de eliminar:");
        leerAlumnos();
        
        // Limpiar la tabla de alumnos
        limpiarTabla();
        
        // Leer nuevamente los alumnos
        System.out.println("Alumnos después de limpiar la tabla:");
        leerAlumnos();
        
        // Borrar la tabla de alumnos
        borrarTabla();
    }
    
    // Crear la tabla "alumnos" si no existe
    public static void crearTabla() {
        try {
            Connection connection = DriverManager.getConnection(URL);
            Statement statement = connection.createStatement();
            
            String query = "CREATE TABLE IF NOT EXISTS alumnos (" +
                           "nombre TEXT, " +
                           "edad INTEGER)";
            
            statement.executeUpdate(query);
            
            statement.close();
            connection.close();
            
            System.out.println("Tabla 'alumnos' creada correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al crear la tabla 'alumnos': " + e.getMessage());
        }
    }
    
    // Agregar un alumno a la tabla
    public static void agregarAlumno(String nombre, int edad) {
        try {
            Connection connection = DriverManager.getConnection(URL);
            Statement statement = connection.createStatement();
            
            String query = "INSERT INTO alumnos VALUES ('" + nombre + "', " + edad + ")";
            
            statement.executeUpdate(query);
            
            statement.close();
            connection.close();
            
            System.out.println("Alumno agregado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al agregar el alumno: " + e.getMessage());
        }
    }
    
    // Leer todos los alumnos de la tabla
    public static void leerAlumnos() {
        try {
            Connection connection = DriverManager.getConnection(URL);
            Statement statement = connection.createStatement();
            
            String query = "SELECT * FROM alumnos";
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");
                
                System.out.println("Nombre: " + nombre + ", Edad: " + edad);
            }
            
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error al leer los alumnos: " + e.getMessage());
        }
    }
    
    // Actualizar la edad de un alumno
    public static void actualizarEdad(String nombre, int nuevaEdad) {
        try {
            Connection connection = DriverManager.getConnection(URL);
            Statement statement = connection.createStatement();
            
            String query = "UPDATE alumnos SET edad = " + nuevaEdad + " WHERE nombre = '" + nombre + "'";
            
            statement.executeUpdate(query);
            
            statement.close();
            connection.close();
            
            System.out.println("Edad del alumno actualizada correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al actualizar la edad del alumno: " + e.getMessage());
        }
    }
    
    // Eliminar un alumno de la tabla
    public static void eliminarAlumno(String nombre) {
        try {
            Connection connection = DriverManager.getConnection(URL);
            Statement statement = connection.createStatement();
            
            String query = "DELETE FROM alumnos WHERE nombre = '" + nombre + "'";
            
            statement.executeUpdate(query);
            
            statement.close();
            connection.close();
            
            System.out.println("Alumno eliminado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al eliminar el alumno: " + e.getMessage());
        }
    }
    
    // Limpiar toda la tabla de alumnos
    public static void limpiarTabla() {
        try {
            Connection connection = DriverManager.getConnection(URL);
            Statement statement = connection.createStatement();
            
            String query = "DELETE FROM alumnos";
            
            statement.executeUpdate(query);
            
            statement.close();
            connection.close();
            
            System.out.println("Tabla 'alumnos' limpiada correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al limpiar la tabla 'alumnos': " + e.getMessage());
        }
    }
    
    // Borrar la tabla de alumnos
    public static void borrarTabla() {
        try {
            Connection connection = DriverManager.getConnection(URL);
            Statement statement = connection.createStatement();
            
            String query = "DROP TABLE IF EXISTS alumnos";
            
            statement.executeUpdate(query);
            
            statement.close();
            connection.close();
            
            System.out.println("Tabla 'alumnos' borrada correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al borrar la tabla 'alumnos': " + e.getMessage());
        }
    }
}
