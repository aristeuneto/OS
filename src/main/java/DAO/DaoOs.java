/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import model.ModelOS;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author neto_
 */
public class DaoOs {

    Session session = HibernateUtil.getSessionFactory().openSession();

    public void salvarOs(ModelOS modelOS) {

        try {
            if (session.isOpen() == false) {
                session = HibernateUtil.getSessionFactory().openSession();
            }

            session.getTransaction().begin();
            session.persist(modelOS);
            session.getTransaction().commit();
            session.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }

        }

    }

    public void excluirOs(ModelOS modelOS) {

        try {
            if (session.isOpen() == false) {
                session = HibernateUtil.getSessionFactory().openSession();
            }

            session.getTransaction().begin();
            session.delete(modelOS);
            session.getTransaction().commit();
            session.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }

        }

    }

    public void atualizarOs(ModelOS modelOS) {

        try {
            if (session.isOpen() == false) {
                session = HibernateUtil.getSessionFactory().openSession();
            }
            
            session.getTransaction().begin();
            session.update(modelOS);
            session.getTransaction().commit();
            session.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }

    public List<ModelOS> listaOS() {
        try {
            if (session.isOpen() == false) {
                session = HibernateUtil.getSessionFactory().openSession();
            }
            List<ModelOS> listaOs = new ArrayList<>();
            org.hibernate.Query sql = session.createQuery("from ModelOS");
            listaOs = sql.list();

            return listaOs;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;
    }
}
