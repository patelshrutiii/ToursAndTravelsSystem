package entity;

import entity.Packages;
import entity.Payment;
import entity.User;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-17T12:47:06", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Cancelbooking.class)
public class Cancelbooking_ { 

    public static volatile SingularAttribute<Cancelbooking, String> reasonForCancel;
    public static volatile SingularAttribute<Cancelbooking, Date> date;
    public static volatile SingularAttribute<Cancelbooking, Payment> paymentID;
    public static volatile SingularAttribute<Cancelbooking, Packages> packageID;
    public static volatile SingularAttribute<Cancelbooking, User> userID;
    public static volatile SingularAttribute<Cancelbooking, Integer> cancelBookingID;

}