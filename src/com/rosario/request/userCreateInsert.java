package com.rosario.request;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import delicias_rosario.entidades.Usuario;

//Aqui se guardan los datos de los usurios en la DB
public class userCreateInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()

				.configure("hibernate.cfg.xml")

				.addAnnotatedClass(Usuario.class)

				.buildSessionFactory();

				Session session = factory.getCurrentSession();

				try {

				System.out.println("Creando un usuarios...");

				Usuario usuario1 = new Usuario("Vladimir","hhhhhsasasa#"); //Se almacenan todos los usuarios con la información en su respectiva columna

				session.beginTransaction();

				System.out.println("Guardando los nuevos usuarios …");

				session.save(usuario1); //Se guarda la información en la Db

				System.out.println("El usuario se almaceno con el ID" + usuario1.getUserID()); 

				session.getTransaction().commit();

				System.out.println("Proceso finalizado"); //Mensaje de que el proceso finalizo

				}finally {

				factory.close();

				}

	}

}
