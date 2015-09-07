package com.schoppen.schoppenerp.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("LICOR")
public class Licores extends Bebidas{

}
