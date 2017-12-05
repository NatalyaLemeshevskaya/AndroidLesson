package by.itacademy.Task1;

import java.util.Date;

public class Pacient {

    private String name;
    private int age;
    private String disease;
    private Date dateOfBirsday;

//  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy", Locale.ENGLISH);
//  private String dataText = simpleDateFormat.format(dateOfBirsday);
      // System.out.println(dataText);




    public Date getDateOfBirsday() {
        return dateOfBirsday;
    }

    public void setDateOfBirsday(Date dateOfBirsday) {
        this.dateOfBirsday = dateOfBirsday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

