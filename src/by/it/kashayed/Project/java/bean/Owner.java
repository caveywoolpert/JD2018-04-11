package by.it.kashayed.Project.java.bean;

public class Owner {
    public Owner() {
    }
    private int id;
    private String login;
    private String emali;
    private String pass;
    private String name;
    private int owners_id;

    public Owner(int id, String login, String emali, String pass, String name, int owners_id) {
        this.id = id;
        this.login = login;
        this.emali = emali;
        this.pass = pass;
        this.name = name;
        this.owners_id = owners_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmali() {
        return emali;
    }

    public void setEmali(String emali) {
        this.emali = emali;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOwners_id() {
        return owners_id;
    }

    public void setOwners_id(int owners_id) {
        this.owners_id = owners_id;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", emali='" + emali + '\'' +
                ", pass='" + pass + '\'' +
                ", name='" + name + '\'' +
                ", owners_id=" + owners_id +
                '}';
    }
}
