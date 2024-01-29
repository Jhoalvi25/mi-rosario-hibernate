package com.rosario.request;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import delicias_rosario.entidades.Pedido;

//Eliminación de pedido de algun cliente por ID
public class orderDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()

				.configure("hibernate.cfg.xml")

				.addAnnotatedClass(Pedido.class)

				.buildSessionFactory();

				Session session = factory.getCurrentSession();

				try {

				session.beginTransaction();

				//Eliminando el usuario cuyo id sea el requerido:

				System.out.println("Eliminacion de un pedido");

				Pedido pedidoDelete = session.get(Pedido.class, 31231322); //Se selecciona el ID del cliente y se almacena

				session.delete(pedidoDelete); //El pedido almacenado se elimina

				System.out.println("El pedido del cliente "+ pedidoDelete.getNameClient() + " fue eliminado");

				session.getTransaction().commit();

				System.out.println("Proceso finalizado");

				}finally {

				factory.close();

				}

	}

}
