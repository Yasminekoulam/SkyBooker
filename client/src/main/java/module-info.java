module skybooker.client {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;
    requires okhttp3;
    requires com.fasterxml.jackson.databind;
    requires java.sql;

    opens skybooker.client to javafx.fxml;
    exports skybooker.client;
    exports DTO;
    exports DTO.register;
    exports enums;
}