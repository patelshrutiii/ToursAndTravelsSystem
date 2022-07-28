package entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-17T12:47:06", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Blog.class)
public class Blog_ { 

    public static volatile SingularAttribute<Blog, String> blogImage;
    public static volatile SingularAttribute<Blog, String> questions;
    public static volatile SingularAttribute<Blog, String> answers;
    public static volatile SingularAttribute<Blog, String> description;
    public static volatile SingularAttribute<Blog, Integer> blogID;
    public static volatile SingularAttribute<Blog, String> blogTitle;

}