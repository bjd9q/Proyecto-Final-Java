package doc.strange.proyect.scenePersonajes;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;

public class PersonajeController implements Initializable {

    @FXML
    private Label labelJugador1,labelJugador2,labelVS;


    @FXML
    private Button btnDoc, btnCapMar, btnCapi, btnDeadpool, btnHulk, btnIron, btnLoki, btnPanther, btnPunish, btnSpider, btnThor, btnWol;

    @FXML
    private ImageView imgPlayerOne;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        instancia();
        accion();
    }

    private void instancia() {
        /*
        Font font = Font.loadFont("file:C:\\Users\\adama\\Desktop\\doc\\src\\doc\\strange\\proyect\\resources\\css\\HoustonComicsPersonalUse-6Yea1.ttf", 32);
        Font font1 = Font.loadFont("file:C:\\Users\\adama\\Desktop\\doc\\src\\doc\\strange\\proyect\\resources\\css\\HoustonComicsPersonalUse-6Yea1.ttf", 48);

        labelJugador1.setFont(font);
        labelJugador2.setFont(font);
        labelVS.setFont(font1);

         */
    }

    public void accion() {
        btnDoc.hoverProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                imgPlayerOne.setImage(new Image("doc/strange/proyect/resources/img/docSelect.png"));
            }
        });

        btnSpider.hoverProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                imgPlayerOne.setImage(new Image("doc/strange/proyect/resources/img/spidi.png"));
            }
        });

        btnThor.hoverProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                imgPlayerOne.setImage(new Image("doc/strange/proyect/resources/img/thorSelect.png"));
            }
        });

        btnIron.hoverProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                imgPlayerOne.setImage(new Image("doc/strange/proyect/resources/img/ironSelect.png"));
            }
        });

        btnDeadpool.hoverProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                imgPlayerOne.setImage(new Image("doc/strange/proyect/resources/img/deadSelect.png"));
            }
        });


        btnWol.hoverProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                imgPlayerOne.setImage(new Image("doc/strange/proyect/resources/img/wolSelect.png"));
            }
        });

        btnPunish.hoverProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                imgPlayerOne.setImage(new Image("doc/strange/proyect/resources/img/punishSelect.png"));
            }
        });

        btnCapi.hoverProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                imgPlayerOne.setImage(new Image("doc/strange/proyect/resources/img/capiSelect.png"));
            }
        });

        btnLoki.hoverProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                imgPlayerOne.setImage(new Image("doc/strange/proyect/resources/img/lokiSelect.png"));
            }
        });

        btnHulk.hoverProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                imgPlayerOne.setImage(new Image("doc/strange/proyect/resources/img/hulkSelect.png"));
            }
        });

        btnCapMar.hoverProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                imgPlayerOne.setImage(new Image("doc/strange/proyect/resources/img/capMarSelect.png"));
            }
        });

        btnPanther.hoverProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                imgPlayerOne.setImage(new Image("doc/strange/proyect/resources/img/pantherSelect.png"));
            }
        });

    }

}
