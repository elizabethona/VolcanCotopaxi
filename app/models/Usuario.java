package models;
import javax.persistence.Entity;

import play.*;
import play.db.jpa.Model;
@Entity
public class Usuario extends Model{
		public String cedula;
		public String nombre;
		public String apellido;
		public String edad;
		public String mail;
		public String direccion;
		public Usuario(String cedula, String nombre, String apellido,
				String edad, String mail, String direccion) {
			super();
			this.cedula = cedula;
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.mail = mail;
			this.direccion = direccion;
		}
		
		
}
