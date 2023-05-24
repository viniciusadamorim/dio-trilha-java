module com.example.diodesafiobanco {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.desafio.simuladorbanco.diodesafiobanco to javafx.fxml;
    exports com.desafio.simuladorbanco.diodesafiobanco;
}