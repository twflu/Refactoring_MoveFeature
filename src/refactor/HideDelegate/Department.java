package refactor.HideDelegate;

/**
 * Created by twer on 1/23/14.
 */
public class Department {
    private String _name;
    private Person _manager;

    public Department(String name, Person manager){
        _name = name;
        _manager = manager;
    }

    public Person getManager() {
        return _manager;
    }

    public String getName() {
        return _name;
    }
}
