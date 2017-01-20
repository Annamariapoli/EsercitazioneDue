package it.polito.tdp.model;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Model {                                            
	
	private List<String> lista = new LinkedList<String>();
	
	public void eliminaStringa(String stringa){                  //funziona
		if(lista.contains(stringa)){
			lista.remove(stringa);
		}
	}
	
	public void inserisciStringa(String stringa, int posizione){         //funziona solo se il num non è piu grande della lista  
		/*if(!lista.contains(stringa)){                                 //--> con un parametro funziona
			lista.add(stringa);
		}*/
		//if(posizione < lista.size()+1)   ??
		lista.add(posizione, stringa);
	}
	public void generaStringhe(int numeroStringhe){          //ok!
		if(numeroStringhe!=0){
			for(int i =0; i<numeroStringhe; i++ ){
				String stringhe = UUID.randomUUID().toString();
				System.out.println(stringhe);
				lista.add(stringhe);
			}
		}
	}
	
	public int elementiPresentiInLista(){	  //ok!
		int contatore = 0;
		contatore = lista.size();
		System.out.println(contatore);
		return contatore;
	}

	public void stampaLista(){
		System.out.println(lista);
	}
	
	public static void main(String [] args){
		Model model = new Model();
		
		 model.inserisciStringa("casa", 1);
		 model.inserisciStringa("scuola", 4);
		 model.inserisciStringa("home", 2);
		 model.inserisciStringa("house", 3);
	//	 model.eliminaStringa("lll");
		 model.stampaLista();
		 
		// model.elementiPresentiInLista();
		model.generaStringhe(4);
		
	}
}
