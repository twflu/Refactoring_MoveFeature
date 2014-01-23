package refactor.HideDelegate;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by twer on 1/23/14.
 */
public class ResidenceTest {
    @Test
    public void should_get_correct_department_manager(){

        Person xiaoming = new Person("xiaoming");
        Person managerOfA = new Person("managerOfA");
        Department departmentA = new Department("A", managerOfA);

        xiaoming.setDepartment(departmentA);

        Assert.assertEquals("managerOfA", xiaoming.getDepartment().getManager().getName());
    }
}
