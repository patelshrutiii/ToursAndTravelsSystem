package entity;

import entity.Packages;
import entity.User;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-17T12:47:06", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Packagebooking.class)
public class Packagebooking_ { 

    public static volatile SingularAttribute<Packagebooking, Integer> packageBookingID;
    public static volatile SingularAttribute<Packagebooking, Integer> contactNumber;
    public static volatile SingularAttribute<Packagebooking, Packages> packageID;
    public static volatile SingularAttribute<Packagebooking, Integer> noOfTravelers;
    public static volatile SingularAttribute<Packagebooking, String> emailID;
    public static volatile SingularAttribute<Packagebooking, Date> bookingDate;
    public static volatile SingularAttribute<Packagebooking, User> userID;

}