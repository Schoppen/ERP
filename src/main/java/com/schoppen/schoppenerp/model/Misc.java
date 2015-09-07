package com.schoppen.schoppenerp.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

 
/** 
 * Modelo para la entidad que se dedica a gestionar los articulos
 * compuestos que se venden pero no se controla su cantidad en stock.
 * 
 *   Por ejemplo: Tabla de quesos, cestas, etc.
 *   
 * @author Adolfo
 *
 */

@Entity
@DiscriminatorValue("MISC")
public class Misc extends Items{
	
	
}
