package com.sistemasaludador;

import java.util.Optional;

/**
 * Valida los datos del caso de uso "Solicitar saludo".
 * Se mantiene separado de JavaFX para poder razonar las reglas sin la interfaz.
 */
public final class ValidadorFormulario {

    public Optional<String> validar(String nombre, String edadTexto, String periodoDia) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return Optional.of("El nombre no puede estar vacío.");
        }

        if (edadTexto == null || edadTexto.trim().isEmpty()) {
            return Optional.of("La edad es obligatoria.");
        }

        int edad;
        try {
            edad = Integer.parseInt(edadTexto.trim());
        } catch (NumberFormatException excepcion) {
            return Optional.of("La edad debe ser un número entero válido.");
        }

        if (edad <= 0) {
            return Optional.of("La edad debe ser un número entero positivo.");
        }

        if (periodoDia == null || periodoDia.isBlank()) {
            return Optional.of("Debe seleccionar AM o PM.");
        }

        if (!"AM".equals(periodoDia) && !"PM".equals(periodoDia)) {
            return Optional.of("Debe seleccionar AM o PM.");
        }

        return Optional.empty();
    }
}
