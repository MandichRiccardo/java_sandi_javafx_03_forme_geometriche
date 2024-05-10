module com.example.java_sandi_javafx_03_forme_geometriche {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_sandi_javafx_03_forme_geometriche to javafx.fxml;
    exports com.example.java_sandi_javafx_03_forme_geometriche;
}