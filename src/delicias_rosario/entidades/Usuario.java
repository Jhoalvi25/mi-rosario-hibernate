package delicias_rosario.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//User Entity
@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@Column(name = "userid")
	private int userID;
	@Column(name = "username")
	private String userName;
	@Column(name = "userpassword")
	private String userPassword;
	
	public Usuario() {
		
	}

	public Usuario(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "Usuario [userID=" + userID + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	

}
