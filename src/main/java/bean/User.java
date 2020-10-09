package bean;

import java.util.List;

public class User {
    private String name;
    private String number;
    private List<User> childs;
    private Department college;

    public List<User> getChilds() {
        return childs;
    }

    public void setChilds(List<User> childs) {
        this.childs = childs;
    }

    public Department getCollege() {
        return college;
    }

    public void setCollege(Department college) {
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
