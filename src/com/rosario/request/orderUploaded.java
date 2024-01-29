package com.rosario.request;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import delicias_rosario.entidades.Pedido;

//Aqui se guardan los pedidos realizados
public class orderUploaded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()

				.configure("hibernate.cfg.xml")

				.addAnnotatedClass(Pedido.class)

				.buildSessionFactory();

				Session session = factory.getCurrentSession();

				try {

				System.out.println("Realizando pedido...");

				Pedido pedidos = new Pedido("manolo","sdfadadad", "vereda bojaca", "pastel", "gelatina de arcoiris"); //Se guardan la información en su respectiva columna

				session.beginTransaction();

				System.out.println("Cargando el pedido…");

				session.save(pedidos); //Se guarda el pedido

				System.out.println("El pedido se guardo con el ID:" + pedidos.getOrderID());

				session.getTransaction().commit();

				System.out.println("Proceso finalizado");

				}finally {

				factory.close();

				}

	}

}
