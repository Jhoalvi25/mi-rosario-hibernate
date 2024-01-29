package com.rosario.request;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import delicias_rosario.entidades.Usuario;

//Aqui de actulizan los datos de la tabla usuario
public class userUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()

				.configure("hibernate.cfg.xml")

				.addAnnotatedClass(Usuario.class)

				.buildSessionFactory();

				Session session = factory.getCurrentSession();

				try {

				session.beginTransaction();


				Usuario consultaUsuario = session.get(Usuario.class, 2); //Actualizando el usuario de llave primaria igual a el numero que coloque

				consultaUsuario.setUserName("jhoalvi pereira"); //Aqui se modifica la columna que se desee, en este caso se esta modificando el nombre de usuario

				System.out.println("Usuario "+ consultaUsuario.getUserID() + " Actualizado!");

				session.getTransaction().commit();

				System.out.println("Proceso finalizado");//Mensaje de proceso finalizado

				}finally {

				factory.close();

				}

	}

}
