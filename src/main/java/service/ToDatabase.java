package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import residentInfo.Resident;
import residentInfo.Vehicle;

public class ToDatabase {
    /**
     * This method uses hibernate frame with xml configuration of both pojo class which is connected by
     * hibernate.cfg.xml
     * @param resident
     * @param vehicle
     */
    public void execute(Resident resident, Vehicle vehicle){

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction =null;
        try{
            transaction =session.beginTransaction();
            vehicle.setResident(resident);
            session.save(vehicle);

            transaction.commit();

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(session != null){
                session.close();
            }
        }


    }


}
