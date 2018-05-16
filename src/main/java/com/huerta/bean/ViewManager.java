package com.huerta.bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name="obj")
@ViewScoped
public class ViewManager implements Serializable{
  private String nombre;
  private String respuesta;
  private int numSaludo;

  public ViewManager() {
    numSaludo = 0;
    respuesta = "";
  }

  public String getNombre() {
    return nombre;
  }

  public String getRespuesta() {
    return respuesta;
  }

  public void setNumSaludo(int valor) {
    this.numSaludo = valor;
  }
  
  public int getNumSaludo() {
    return numSaludo;
  }

  public void setRespuesta(String resp) {
    this.respuesta = resp;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void doListener(ActionEvent ac) {
    System.out.println("*** " + this.nombre + " ****");
  }
  
  public void doSomeThing() {
    System.out.println("**PPPP* " + this.nombre + " **PPP**");
    String veces = " veces";
    String vez = " vez";
    this.numSaludo++;
    this.respuesta = "Hola " +  this.nombre + " ... he saludado ";
    if(numSaludo == 1){
      this.respuesta = this.respuesta +  " una " + vez;
    }
    else {
      this.respuesta = this.respuesta +  this.numSaludo + veces;
    }
    this.nombre="";
    //return "null";
  }

  public String cambiar(){
    return "vista2";
  }
}
