package refactor.HideDelegate;

/**
 * Created by twer on 1/23/14.
 */
public class Person {
    private String _name;
    Department _department;

    public Person(String name){
       _name = name;
    }

    public String getName() {
        return _name;
    }

    public Department getDepartment() {
        return _department;
    }

    public void setDepartment(Department _department) {
        this._department = _department;
    }
}
