module com.mitchellwelvang.todolist {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.mitchellwelvang.todolist to javafx.fxml;
    exports com.mitchellwelvang.todolist;
}