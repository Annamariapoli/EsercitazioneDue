package it.polito.tdp.esercitazionedue;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.UUID;

import it.polito.tdp.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EsercitazioneController {
	
	private Model model;
	
	public void setModel(Model model){
		this.model=model;
	}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtGenera;                  //contiene un num

    @FXML
    private Button btnGenera;

    @FXML
    private TextField txtNuovo;

    @FXML
    private TextField txtPosizione;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextField txtElimina;

    @FXML
    private Button btnElimina;

    @FXML
    private TextField labelContatore;

    @FXML
    private TextField labelTime;

    @FXML
    void doElimina(ActionEvent event) {	
    	long startTime= System.nanoTime();                                        //memorizzo il tempo attuale in una variabile
    	String s =   txtElimina.getText();                                       //memorizzo cio che utente vuole eliminare in una variabile
    	model.eliminaStringa(s);                                                //elimino quella stringa
    	long end = System.nanoTime()- startTime;                            //mi dice quanto è durata l'operazione
    	labelTime.setText(String.valueOf(end));                            //metto nella textFiel la variabile finish 
    	labelContatore.setText(String.valueOf(model.elementiPresentiInLista()));    
    }

    @FXML
    void doGenera(ActionEvent event) {                                                  
    	long startTime= System.nanoTime();
    	int numeroStringhe = Integer.parseInt(txtGenera.getText());            //utente inserisce un numero di stringhe da generare
    	model.generaStringhe(numeroStringhe);                                 //ERRORE : PERCHE??
    	long end = System.nanoTime()- startTime;   
    	labelTime.setText(String.valueOf(end));
    	labelContatore.setText(String.valueOf(model.elementiPresentiInLista()));           

    }

    @FXML
    void doInserisci(ActionEvent event) {                                 //scrive manualmente stringhe da aggiungere
    	long startTime= System.nanoTime();
    	String s = txtNuovo.getText();
    	if(s.isEmpty()){
    		return;                                                        //se la stringa è vuota non fa nulla
    	}
    	int pos = Integer.parseInt(txtPosizione.getText());              //non faccio controlli??
    	model.inserisciStringa(s, pos);
        long end = System.nanoTime()- startTime;
    	labelTime.setText("Il tempo impiegato è : " +end+ "\n");             //modo altrnativo al precedente  ??
    	labelContatore.setText(String.valueOf(model.elementiPresentiInLista()));

    }

    @FXML
    void initialize() {
        assert txtGenera != null : "fx:id=\"txtGenera\" was not injected: check your FXML file 'Esercitazione.fxml'.";
        assert btnGenera != null : "fx:id=\"btnGenera\" was not injected: check your FXML file 'Esercitazione.fxml'.";
        assert txtNuovo != null : "fx:id=\"txtNuovo\" was not injected: check your FXML file 'Esercitazione.fxml'.";
        assert txtPosizione != null : "fx:id=\"txtPosizione\" was not injected: check your FXML file 'Esercitazione.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Esercitazione.fxml'.";
        assert txtElimina != null : "fx:id=\"txtElimina\" was not injected: check your FXML file 'Esercitazione.fxml'.";
        assert btnElimina != null : "fx:id=\"btnElimina\" was not injected: check your FXML file 'Esercitazione.fxml'.";
        assert labelContatore != null : "fx:id=\"labelContatore\" was not injected: check your FXML file 'Esercitazione.fxml'.";
        assert labelTime != null : "fx:id=\"labelTime\" was not injected: check your FXML file 'Esercitazione.fxml'.";

    }
}
