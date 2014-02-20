package jframe;

import javax.swing.JFrame;

public class crearVentana extends JFrame  {
	
	private int altura =0;
	private int ancho=0;
	private String titulo=" ";
	
	
	
	//constructor 
	public crearVentana(){
		//termine de correr 
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
		
	}
	
	
	//construtor
	public crearVentana(int ancho,int alto, String titulo){
		//termine de correr 
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		//tamaño de la ventana  
		this.setSize(altura,ancho);
		//para que sea visible la vnetana
		 this.setVisible(true);
		 //titulo de la ventana
		 this.setTitle(titulo);
	}
	
	
	
	
	public void mostra(){
		this.setSize(altura,ancho);
		//titulo de la ventana
		this.setTitle(titulo);
		this.setVisible(true);
		
	}




	public void setTitulo(String titulo){
		this.titulo=titulo;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	
	
	
	
	
	
	
	
	
	

}
