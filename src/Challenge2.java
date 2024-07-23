import java.util.*;

public class Challenge2 {
    // Creamos una funcion que reciba tres arreglos, estudiantes de Matematicas, de Frances, y de Matematicas y Frances
    public static String
    notifyStudents(
            List<Student> MathStudents,
            List<Student> FrenchStudents,
            List<Student> MathFrenchStudents
    )
    {
        // Creamos un set vacio para guardar los estudiantes a los que ya se les ha enviado el email
        Set<String> notifiedStudents = new LinkedHashSet<>();

        // Iteramos sobre los tres arreglos y chequeamos si el estudiante es de malaga, si esto se cumple
        // chequeamos si ya se le envio el email, si no se le ha enviado se agrega al set
        MathStudents.stream().filter(student -> student.campus.equals("Malaga")).forEach(student -> {
            if(!notifiedStudents.contains(student.getName())) {
                sendEmail(student, "Matematicas");
                notifiedStudents.add(student.name);
            }
        });

        FrenchStudents.stream().filter(student -> student.campus.equals("Malaga")).forEach(student -> {
            if(!notifiedStudents.contains(student.getName())) {
                sendEmail(student, "Frances");
                notifiedStudents.add(student.name);
            }
        });

        MathFrenchStudents.stream().filter(student -> student.campus.equals("Malaga")).forEach(student -> {
            if(!notifiedStudents.contains(student.getName())) {
                sendEmail(student, "Matematicas y Frances");
                notifiedStudents.add(student.name);
            }
        });

        // Por ultimo retornamos un mensaje con los nombres de los estudiantes a los que se les ha enviado el email
        return "Email enviado a: " + String.join(", ", notifiedStudents);
    }

    // Esta es una funcion auxiliar para "enviar" el email
    private static void sendEmail(Student student, String subject) {
        System.out.println("Email enviado a " + student.name + " de " + student.campus);
        System.out.println("Message: Las clases de " + subject + " programadas para mañana en el instituto de Málaga han sido canceladas.");
    }

    public static void main(String[] args) {
        List<Student> MathStudents = Arrays.asList(
                new Student("Fransisco Escalante", "Malaga"),
                new Student("Angela Suarez", "Huesca"),
                new Student("Lennon Perez", "Madrid"),
                new Student("Carlos Garcia", "Barcelona"),
                new Student("Eliezer Rosales", "Malaga")
        );

        List<Student> FrenchStudents = Arrays.asList(
                new Student("Manuel Sanchez", "Malaga"),
                new Student("Christian Orellana", "Zaragoza"),
                new Student("Luis Bonalde", "Madrid")
        );

        List<Student> MathFrenchStudents = Arrays.asList(
                new Student("Carla Arocha", "Malaga"),
                new Student("Carlos Garcia", "Malaga"),
                new Student("Jesus Alvarez", "Madrid")
        );

        String res = notifyStudents(MathStudents, FrenchStudents, MathFrenchStudents);
        System.out.println(res);
    }
}
