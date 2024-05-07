package MealMaker.MealMakerApp;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="Nutritionist")
 class Nutritionist {


    @Id
    @Column(name="NutritionistID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nutritionistID;

    @Column(name="FirstnameNutri", length = 50, nullable = false)
    private String firstnameNutri;

    @Column(name="LastnameNutri", length = 50, nullable = false)
    private String lastnameNutri;

    @Column(name="DateNaiss", nullable = false)
    private Date dateNaiss;

    @Column(name="Sex", length = 10, nullable = false)
    private String sex;

    @Column(name="Work", length = 100)
    private String work;

    @Column(name="CityNutri", length = 100)
    private String cityNutri;

    @Column(name="UsernameNutri", length = 50, unique = true, nullable = false)
    private String usernameNutri;

    @Column(name="Password", length = 50, nullable = false)
    private String password;

    @Column(name="NumphoneNutri")
    private long numphoneNutri;

    @Column(name="emailNutri", length = 100)
    private String emailNutri;

    public Nutritionist() {
    }



    public Nutritionist(int nutritionistID, String firstnameNutri, String lastnameNutri, Date dateNaiss,
                        String sex, String work, String cityNutri, String usernameNutri, String password, long numphoneNutri,
                        String emailNutri) {
        this.nutritionistID = nutritionistID;
        this.firstnameNutri = firstnameNutri;
        this.lastnameNutri = lastnameNutri;
        this.dateNaiss = dateNaiss;
        this.sex = sex;
        this.work = work;
        this.cityNutri = cityNutri;
        this.usernameNutri = usernameNutri;
        this.password = password;
        this.numphoneNutri = numphoneNutri;
        this.emailNutri = emailNutri;
    }
    public int getNutritionistID() {
        return nutritionistID;
    }

    public String getLastnameNutri() {
        return lastnameNutri;
    }

    public String getSex() {
        return sex;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getCityNutri() {
        return cityNutri;
    }

    public void setCityNutri(String cityNutri) {
        this.cityNutri = cityNutri;
    }

    public String getEmailNutri() {
        return emailNutri;
    }

    public long getNumphoneNutri() {
        return numphoneNutri;
    }

    public void setNumphoneNutri(long numphoneNutri) {
        this.numphoneNutri = numphoneNutri;
    }

    public void setEmailNutri(String emailNutri) {
        this.emailNutri = emailNutri;
    }

    public String getUsernameNutri() {
        return usernameNutri;
    }

    public void setUsernameNutri(String usernameNutri) {
        this.usernameNutri = usernameNutri;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setLastnameNutri(String lastnameNutri) {
        this.lastnameNutri = lastnameNutri;
    }

    public String getFirstnameNutri() {
        return firstnameNutri;
    }

    public void setFirstnameNutri(String firstnameNutri) {
        this.firstnameNutri = firstnameNutri;
    }

    public void setNutritionistID(int nutritionistID) {
        this.nutritionistID = nutritionistID;
    }

    @Override
    public String toString() {
        return "Nutritionist{" +
                "nutritionistID=" + nutritionistID +
                ", firstnameNutri='" + firstnameNutri + '\'' +
                ", lastnameNutri='" + lastnameNutri + '\'' +
                ", dateNaiss=" + dateNaiss +
                ", sex='" + sex + '\'' +
                ", work='" + work + '\'' +
                ", cityNutri='" + cityNutri + '\'' +
                ", usernameNutri='" + usernameNutri + '\'' +
                ", password='" + password + '\'' +
                ", numphoneNutri=" + numphoneNutri +
                ", emailNutri='" + emailNutri + '\'' +
                '}';
    }
}