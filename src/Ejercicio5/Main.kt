package Ejercicio5

fun main() {

    // =========================
    // Crear médicos
    // =========================

    val medico1 = Medico(
        "Carlos Perez",
        "1001",
        Genero.MASCULINO,
        Especialidad.CARDIOLOGIA,
        5000000.0,
        2018
    )

    val medico2 = Medico(
        "Maria Gomez",
        "1002",
        Genero.FEMENINO,
        Especialidad.PEDIATRIA,
        4500000.0,
        2020
    )

    val medico3 = Medico(
        "Andres Lopez",
        "1003",
        Genero.MASCULINO,
        Especialidad.NEUROLOGIA,
        6000000.0,
        2015
    )


    // =========================
    // Crear pacientes
    // =========================

    val paciente1 = Paciente(
        "Laura Rodriguez",
        "2001",
        Genero.FEMENINO,
        "3001112233",
        Direccion("Carrera 10 # 20-30", "Armenia", "630001")
    )

    val paciente2 = Paciente(
        "Pedro Martinez",
        "2002",
        Genero.MASCULINO,
        "3002223344",
        Direccion("Calle 15 # 10-20", "Armenia", "630002")
    )

    val paciente3 = Paciente(
        "Ana Torres",
        "2003",
        Genero.FEMENINO,
        "3003334455",
        Direccion("Carrera 20 # 30-40", "Pereira", "660001")
    )


    // =========================
    // Crear hospital
    // =========================

    val hospital = Hospital()


    // =========================
    // Agregar médicos
    // =========================

    hospital.agregarMedico(medico1)
    hospital.agregarMedico(medico2)
    hospital.agregarMedico(medico3)

    // Agregar pacientes
    hospital.agregarPaciente(paciente1)
    hospital.agregarPaciente(paciente2)
    hospital.agregarPaciente(paciente3)


    // =========================
    // Mostrar médicos y pacientes
    // =========================

    println("===== MÉDICOS =====")

    for (medico in hospital.medicos) {
        println(medico)
    }

    println()

    println("===== PACIENTES =====")

    for (paciente in hospital.pacientes) {
        println(paciente)
    }


    // =========================
    // Total de salarios
    // =========================

    println()
    println("===== SALARIOS =====")

    println(
        "Salarios de Cardiología: " +
                hospital.totalSalarios(Especialidad.CARDIOLOGIA)
    )

    println(
        "Salarios de Pediatría: " +
                hospital.totalSalarios(Especialidad.PEDIATRIA)
    )

    println(
        "Salarios de Neurología: " +
                hospital.totalSalarios(Especialidad.NEUROLOGIA)
    )


    // =========================
    // Médico con más antigüedad
    // =========================

    println()
    println("===== MAYOR ANTIGÜEDAD =====")

    val medicoAntiguo = hospital.medicoConMasAntiguedad()

    println(medicoAntiguo)


    // =========================
    // Contactar personas
    // =========================

    println()
    println("===== CONTACTAR =====")

    println("Contacto médico: ${hospital.contactar("1001")}")

    println("Contacto paciente: ${hospital.contactar("2002")}")

    println("Persona inexistente: ${hospital.contactar("9999")}")


    // =========================
    // Eliminar médico y paciente
    // =========================

    println()
    println("===== ELIMINAR =====")

    hospital.eliminarMedico(medico2)
    hospital.eliminarPaciente(paciente3)

    println("Médicos después de eliminar: ${hospital.medicos.size}")
    println("Pacientes después de eliminar: ${hospital.pacientes.size}")


    // =========================
    // Hospital vacío
    // =========================

    println()
    println("===== HOSPITAL VACÍO =====")

    val hospitalVacio = Hospital()

    println(
        "Médico con más antigüedad: " +
                hospitalVacio.medicoConMasAntiguedad()
    )
}