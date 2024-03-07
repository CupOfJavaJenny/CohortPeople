package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String favoriteColor;
    private String birthMonth;

    public Person(String fname, String lname) {
        this.firstname = fname;
        this.lastname = lname;
    }


    public String getFirstname() {
        return firstname;
    }
   public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
  public void setLastname(String lastname) {
      this.lastname = lastname;
  }

  public String getfavoriteColor() {
        return favoriteColor;
    }
  public void setfavoriteColor(String favoriteColor) {
      this.favoriteColor = favoriteColor;
  }


  public String getbirthMonth() {
        return birthMonth;
    }
  public void setbirthMonth(String birthMonth) {
      this.birthMonth = birthMonth;
  }

    

    public String toString() {
        return this.lastname + ", " + this.firstname + ", " + this.favoriteColor + ", " + this.birthMonth;
    }
}
