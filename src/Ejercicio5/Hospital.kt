package Ejercicio5

class Hospital {

    val medicos = mutableListOf<Medico>()
    val pacientes = mutableListOf<Paciente>()

    fun agregarMedico(medico: Medico) {
        medicos.add(medico)
    }

    fun eliminarMedico(medico: Medico) {
        medicos.remove(medico)
    }

    fun agregarPaciente(paciente: Paciente) {
        pacientes.add(paciente)
    }

    fun eliminarPaciente(paciente: Paciente) {
        pacientes.remove(paciente)
    }

    fun totalSalarios(especialidad: Especialidad): Double {
        var total = 0.0

        for (medico in medicos) {
            if (medico.especialidad == especialidad) {
                total += medico.salario
            }
        }

        return total
    }

    fun medicoConMasAntiguedad(): Medico? {
        if (medicos.isEmpty()) {
            return null
        }

        var medicoMayor = medicos[0]

        for (medico in medicos) {
            if (medico.antiguedad() > medicoMayor.antiguedad()) {
                medicoMayor = medico
            }
        }

        return medicoMayor
    }

    fun contactar(identificacion: String): String {
        for (medico in medicos) {
            if (medico.identificacion == identificacion) {
                return medico.correo ?: "Sin correo registrado"
            }
        }

        for (paciente in pacientes) {
            if (paciente.identificacion == identificacion) {
                return paciente.correo ?: "Sin correo registrado"
            }
        }

        return "Persona no encontrada"
    }
}