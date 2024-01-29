package delicias_rosario.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Order Entity
@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Id
	@Column(name = "orderid")
	private int orderID;
	@Column(name = "nameclient")
	private String nameClient;
	@Column(name = "cellphone")
	private String cellPhone;
	@Column(name = "direction")
	private String direction;
	@Column(name = "dessert")
	private String dessert;
	@Column(name = "instructions")
	private String instructions;
	
	public Pedido() {
		
	}
	
	
	public Pedido(String nameClient, String cellPhone, String direction, String dessert, String instructions) {
		super();
		this.nameClient = nameClient;
		this.cellPhone = cellPhone;
		this.direction = direction;
		this.dessert = dessert;
		this.instructions = instructions;
	}


	public int getOrderID() {
		return orderID;
	}


	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}


	public String getNameClient() {
		return nameClient;
	}


	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}


	public String getCellPhone() {
		return cellPhone;
	}


	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}


	public String getDirection() {
		return direction;
	}


	public void setDirection(String direction) {
		this.direction = direction;
	}


	public String getDessert() {
		return dessert;
	}


	public void setDessert(String dessert) {
		this.dessert = dessert;
	}


	public String getInstructions() {
		return instructions;
	}


	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}


	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", nameClient=" + nameClient + ", cellPhone=" + cellPhone + ", direction="
				+ direction + ", dessert=" + dessert + ", instructions=" + instructions + "]";
	}
	

}
