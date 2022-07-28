package entity;

import entity.User;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-17T12:47:06", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Enquiry.class)
public class Enquiry_ { 

    public static volatile SingularAttribute<Enquiry, Long> contactNumber;
    public static volatile SingularAttribute<Enquiry, String> emailID;
    public static volatile SingularAttribute<Enquiry, Integer> enquiryID;
    public static volatile SingularAttribute<Enquiry, String> message;
    public static volatile SingularAttribute<Enquiry, User> userID;

}