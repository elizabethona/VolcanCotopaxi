package controllers;
import models.Producto;
import models.Usuario;
import play.mvc.Controller;
import play.mvc.results.*;
public class Estaticas extends Controller{
	public static void vision() {
		render();
	}
	public static void vivienda() {
		render();
	}
	public static void donaciones() {
		render();
	}
	public static void guardar (String cedula, String nombre, String apellido, String edad, String mail, String direccion){
		Usuario usuarioNuevo= new Usuario(cedula,nombre,apellido,edad,mail,direccion);
		usuarioNuevo.save();
		vision();
	}
	public static void guardar1(String producto,String cantidad){
		Producto productoNuevo= new Producto(producto,cantidad);
		productoNuevo.save();
		donaciones();
	}
}

