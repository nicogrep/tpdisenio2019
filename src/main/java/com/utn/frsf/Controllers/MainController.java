package com.utn.frsf.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class MainController implements Initializable {

  /*  @Autowired
    private DashboardGerenteController dbGerenteController;*/
    @Autowired
    private LoginController loginController;
    @Autowired
    private DashboardProdSegurosController dashboardProdSegurosController;


    /*@FXML private HBox dashboardProdSegurosHBOX;
    @FXML private AnchorPane loginAP;*/


    @Override
    public void initialize(URL location, ResourceBundle resources) {
       //Asigna el main controller a los Controller de los otros FXML
        //dbGerenteController.injectMainController(this);
        loginController.injectMainController(this);
        dashboardProdSegurosController.injectMainController(this);

    }

    //Muestra el Dashboard de prod de seguro
    public void verdb(){
        this.dashboardProdSegurosController.verDashBoard();
    }

    public void verlogin(){
        this.loginController.ver();
    }


}
