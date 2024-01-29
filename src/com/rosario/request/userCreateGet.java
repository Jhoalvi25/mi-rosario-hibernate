package com.rosario.request;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import delicias_rosario.entidades.Usuario;

//Aqui se obtienen los datos que quiera consultar por ID
public class userCreateGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()

				.configure("hibernate.cfg.xml")

				.addAnnotatedClass(Usuario.class)

				.buildSessionFactory();

				Session session = factory.getCurrentSession();

				try {

				session.beginTransaction();

				System.out.println("Consulta de un usuario");

				Usuario resultado = session.get(Usuario.class, 2); 	//Consulta de un usuario cuya pk tiene el valor que se quiera consultar

				System.out.println("Registro obtenido:"+ resultado);

				session.getTransaction().commit();

				System.out.println("Proceso finalizado"); //Mensaje de proceso finalizado

				}finally {

				factory.close();

				}

	}

}
