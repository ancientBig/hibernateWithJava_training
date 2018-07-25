package com.company;
import javax.persistence.*;

@Entity
@Table(name="administrator")

public class Admin {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="adminid")
    private int adminID;

    @Column(name="admin_name")
    private String adminname;


    @Column(name="admin_lastname")
    private String adminLastname;

    @Column(name="admin_email")
    private String adminEmail;

    @Column(name="admin_password")
    private String adminPasword;



    public Admin() {
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminID=" + adminID +
                ", adminname=" + adminname +
                ", adminLastname=" + adminLastname +
                ", adminEmail=" + adminEmail +
                ", adminPasword=" + adminPasword +
                '}';
    }

    public Admin(String adminname, String adminLastname, String adminEmail, String adminPasword) {
        this.adminname = adminname;
        this.adminLastname = adminLastname;
        this.adminEmail = adminEmail;
        this.adminPasword = adminPasword;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminLastname() {
        return adminLastname;
    }

    public void setAdminLastname(String adminLastname) {
        this.adminLastname = adminLastname;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPasword() {
        return adminPasword;
    }

    public void setAdminPasword(String adminPasword) {
        this.adminPasword = adminPasword;
    }
}
