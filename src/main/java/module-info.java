module br.senai.sp.jandira.tabuada.tabuada {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.senai.sp.jandira.tabuada.tabuada to javafx.fxml;
    exports br.senai.sp.jandira.tabuada.tabuada;
}