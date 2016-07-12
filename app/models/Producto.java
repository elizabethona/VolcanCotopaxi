package models;
import javax.persistence.Entity;

import play.*;
import play.db.jpa.Model;
@Entity
public class Producto extends Model {
		public String producto;
		public String cantidad;
		public Producto(String producto, String cantidad) {
			super();
			this.producto = producto;
			this.cantidad = cantidad;
		}
		
		
}
