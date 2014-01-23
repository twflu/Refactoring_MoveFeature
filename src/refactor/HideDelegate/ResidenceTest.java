package refactor.HideDelegate;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by twer on 1/23/14.
 */
public class ResidenceTest {

    private Person _xiaoming;
    private Person _managerOfA;

    @Before
    public void beforeEach(){
        _xiaoming = new Person("_xiaoming");
        _managerOfA = new Person("managerOfA");
        Department departmentA = new Department("A", _managerOfA);
        _xiaoming.setDepartment(departmentA);
    }

    @Test
    public void should_get_correct_department_manager_name(){
        Department xiaomingDepartment = _xiaoming.getDepartment();
        Assert.assertEquals(_managerOfA, xiaomingDepartment.getManager());
    }
}
