package com.sistemasaludador;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SistemaSaludadorApp extends Application {

    private static final double ANCHO_VENTANA = 520;
    private static final double ALTO_VENTANA = 420;

    private final ValidadorFormulario validador = new ValidadorFormulario();
    private BorderPane raiz;

    @Override
    public void start(Stage escenario) {
        raiz = new BorderPane();
        raiz.getStyleClass().add("contenedor-principal");
        mostrarPantallaInicial();

        Scene escena = new Scene(raiz, ANCHO_VENTANA, ALTO_VENTANA);
        escena.getStylesheets().add(getClass().getResource("/estilos.css").toExternalForm());

        escenario.setTitle("Sistema Saludador");
        escenario.setScene(escena);
        escenario.setMinWidth(ANCHO_VENTANA);
        escenario.setMinHeight(ALTO_VENTANA);
        escenario.show();
    }

    private void mostrarPantallaInicial() {
        Label titulo = new Label("Sistema Saludador");
        titulo.getStyleClass().add("titulo");

        Label descripcion = new Label("Prototipo académico para solicitar un saludo personalizado.");
        descripcion.getStyleClass().add("descripcion");

        Button botonSolicitar = new Button("Solicitar saludo");
        botonSolicitar.setDefaultButton(true);
        botonSolicitar.setOnAction(evento -> mostrarFormulario());

        VBox contenido = new VBox(16, titulo, descripcion, botonSolicitar);
        contenido.setAlignment(Pos.CENTER);
        contenido.setPadding(new Insets(32));
        raiz.setCenter(contenido);
    }

    private void mostrarFormulario() {
        Label titulo = new Label("Solicitar saludo");
        titulo.getStyleClass().add("titulo");

        Label etiquetaNombre = new Label("Nombre del estudiante");
        TextField campoNombre = new TextField();
        campoNombre.setPromptText("Escriba su nombre");

        Label etiquetaEdad = new Label("Edad del estudiante");
        TextField campoEdad = new TextField();
        campoEdad.setPromptText("Escriba su edad");

        Label etiquetaPeriodo = new Label("Hora del día");
        ToggleGroup grupoPeriodo = new ToggleGroup();
        RadioButton opcionAm = new RadioButton("AM");
        RadioButton opcionPm = new RadioButton("PM");
        opcionAm.setToggleGroup(grupoPeriodo);
        opcionPm.setToggleGroup(grupoPeriodo);

        HBox opcionesPeriodo = new HBox(18, opcionAm, opcionPm);
        opcionesPeriodo.setAlignment(Pos.CENTER_LEFT);

        Label mensajeError = new Label();
        mensajeError.getStyleClass().add("mensaje-error");
        mensajeError.setWrapText(true);

        Button botonAceptar = new Button("Aceptar");
        botonAceptar.setDefaultButton(true);
        botonAceptar.setOnAction(evento -> {
            String periodoSeleccionado = null;
            if (grupoPeriodo.getSelectedToggle() instanceof RadioButton seleccionado) {
                periodoSeleccionado = seleccionado.getText();
            }
            aceptarFormulario(campoNombre, campoEdad, periodoSeleccionado, mensajeError);
        });

        VBox contenido = new VBox(
                10,
                titulo,
                etiquetaNombre,
                campoNombre,
                etiquetaEdad,
                campoEdad,
                etiquetaPeriodo,
                opcionesPeriodo,
                mensajeError,
                botonAceptar
        );
        contenido.setAlignment(Pos.CENTER_LEFT);
        contenido.setPadding(new Insets(28, 40, 28, 40));
        raiz.setCenter(contenido);
    }

    private void aceptarFormulario(
            TextField campoNombre,
            TextField campoEdad,
            String periodoSeleccionado,
            Label mensajeError
    ) {
        validador.validar(campoNombre.getText(), campoEdad.getText(), periodoSeleccionado)
                .ifPresentOrElse(
                        mensajeError::setText,
                        () -> {
                            String nombre = campoNombre.getText().trim();
                            int edad = Integer.parseInt(campoEdad.getText().trim());
                            mostrarSaludo(nombre, edad, periodoSeleccionado);
                        });
    }

    private void mostrarSaludo(String nombre, int edad, String periodoDia) {
        String textoSaludo;
        if ("AM".equals(periodoDia)) {
            textoSaludo = "Buenos días, " + nombre + ". Tienes " + edad + " años.";
        } else {
            textoSaludo = "Buenas tardes, " + nombre + ". Tienes " + edad + " años.";
        }

        Label titulo = new Label("Saludo");
        titulo.getStyleClass().add("titulo");

        Label etiquetaSaludo = new Label(textoSaludo);
        etiquetaSaludo.getStyleClass().add("saludo");
        etiquetaSaludo.setWrapText(true);

        Button botonVolver = new Button("Volver al inicio");
        botonVolver.setDefaultButton(true);
        botonVolver.setOnAction(evento -> mostrarPantallaInicial());

        VBox contenido = new VBox(18, titulo, etiquetaSaludo, botonVolver);
        contenido.setAlignment(Pos.CENTER);
        contenido.setPadding(new Insets(32));
        raiz.setCenter(contenido);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
