package md.cedacri.hibernate;

import md.cedacri.pojo.Computer;
import md.cedacri.pojo.DetailParts;
import md.cedacri.pojo.Pieces;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Methods that allow make CRUD operations over a DB using Hibernate
 */

public class CrudMethods {

    SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

    /**
     * Search if the username exists in the DB through its password
     *
     * @param username username to search
     * @param password pass to search
     * @return <b>false</b> if the username was not found it or <b>true</b> if the username was found it
     */
    public boolean logIn(String username, String password) {

        try (Session session = sessionFactory.openSession()) {
            List users;
            users = session.createQuery("FROM User WHERE username = " + username + "AND pass =" + password).list();
            if (users.isEmpty()) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;

    }

    /**
     * Search if a computer exists through its serial
     *
     * @param computerSerial serial to search
     * @return Computer
     * @see Computer
     */

    public Computer searchComputer(int computerSerial) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        Computer computer = null;
        try {
            transaction = session.beginTransaction();
            List computers = session.createQuery("FROM Computer WHERE SERIE_COMPUTER = " + computerSerial).list();

            if (computers != null && !computers.isEmpty()) {
                for (Object obj : computers) {
                    computer = (Computer) obj;
                }
            }

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return computer;
        } finally {
            session.close();
        }
        return computer;
    }

    /**
     * Insert a new computer to the DB
     */
    public void newComputer(Computer computer) {

        try (Session session = sessionFactory.openSession()) {
            Transaction transaction;
            transaction = session.beginTransaction();
            session.save(computer);
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Delete a computer through its serial
     *
     * @param computer object to delete
     * @see Computer
     */
    public boolean deleteComputer(Computer computer) {

        if (computer != null) {

            try (Session session = sessionFactory.openSession()) {
                Transaction transaction;
                transaction = session.beginTransaction();
                System.out.println();
                /*First delete the computer from DetailParts class (FK constraints restrictions)*/
                Query deleteIdComputer = session.createQuery("DELETE FROM DetailParts WHERE ID_COMPUTER = :computerId");
                deleteIdComputer.setParameter("computerId", computer.getIdComputer());
                deleteIdComputer.executeUpdate();

                /*Then, delete the computer from Computer class*/
                Query deleteComputer = session.createQuery("DELETE FROM Computer WHERE ID_COMPUTER = :computerId");
                deleteComputer.setParameter("computerId", computer.getIdComputer());
                deleteComputer.executeUpdate();

                transaction.commit();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        } else {
            return false;
        }

    }

    /**
     * Retireve a List of Pieces objects from the DB
     *
     * @return List<Pieces>
     */
    public List getPieces() {
        List listPieces = new ArrayList<Pieces>();
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction;
            transaction = session.beginTransaction();
            listPieces = session.createQuery("FROM Pieces", Pieces.class).list();
            if (listPieces.isEmpty()) {
                /*Create a default computer piece*/
                return listPieces;
            }
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listPieces;
    }

    /**
     * Update a computer through its computer serial. NOTE: It only update the computer attributes, not its pieces in the DB.
     *
     * @param updatedComputer where the data is taken to update
     * @param computerSerial The object to be updated
     * @return true if the computer was successfully updated or false if it not
     */
    public boolean updateComputer(Computer updatedComputer, int computerSerial) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction;
            transaction = session.beginTransaction();

            Query query = session.createQuery("UPDATE Computer set SERIE_COMPUTER =: serieComputer, "
                    + "DESCRIPTION =: description, "
                    + "ASSEMBLY_DATE =: assemblyDate "
                    + "WHERE ID_COMPUTER =: idComputer");
            query.setParameter("serieComputer", updatedComputer.getSerieComputer());
            query.setParameter("description", updatedComputer.getDescription());
            query.setParameter("assemblyDate", updatedComputer.getAssemblyDate());
            query.setParameter("idComputer", searchComputer(computerSerial).getIdComputer());
            query.executeUpdate();

            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Retrieve a List of DetailParts objects from the DB.
     *
     * @return List<DetailParts>
     */
    public List<DetailParts> getCosts() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        List<DetailParts> listDetailParts = new ArrayList<>();
        try {
            transaction = session.beginTransaction();
            Query getCost = session.createQuery("SELECT c.description, SUM(dp.cost) "
                    + "FROM Computer c INNER JOIN DetailParts dp "
                    + "ON c.idComputer = dp.idComputer "
                    + "GROUP BY c.description");

            /*It will return a Object List
             * Example: [[Object 1],[Object 2],....]*/
            List result = getCost.list();
            if (result != null) {
                for (Object obj : result) {
                    /*Object can be cast as an Array
                     * Example: Object 1 = {Computer 1, Cost 1}
                     * 			Object 2 = {Computer 2, Cost 2}*/
                    Object[] computerCostDetails = (Object[]) obj;
                    listDetailParts.add(new DetailParts((String) computerCostDetails[0],
                            ((Long) computerCostDetails[1]).intValue()));
                }
            } else {
                return Collections.emptyList();
            }

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return listDetailParts;
        } finally {
            session.close();
        }
        return listDetailParts;
    }

}
