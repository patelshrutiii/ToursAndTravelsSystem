package entity;

import entity.Cancelbooking;
import entity.Packages;
import entity.User;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-17T12:47:06", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Payment.class)
public class Payment_ { 

    public static volatile SingularAttribute<Payment, Date> date;
    public static volatile SingularAttribute<Payment, Integer> amount;
    public static volatile SingularAttribute<Payment, String> bankIFSC;
    public static volatile CollectionAttribute<Payment, Cancelbooking> cancelbookingCollection;
    public static volatile SingularAttribute<Payment, Integer> paymentID;
    public static volatile SingularAttribute<Payment, Integer> accountNo;
    public static volatile SingularAttribute<Payment, Packages> packageID;
    public static volatile SingularAttribute<Payment, User> userID;

}