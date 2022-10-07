package employee;

import static employee.Method.maasHesap;
import static employee.Method.tablo;

public class MaasHesaplama {

    public static void main(String[] args) {
        Employee calisan1= new Employee();
        Employee calisan2= new Employee();
        Employee calisan3= new Employee();
        calisan1.name=("Isci1");
        calisan1.hireYear=2010;
        calisan1.workHours=80;
        calisan1.salary=5000;
        calisan2.name=("Isci2");
        calisan2.hireYear=2015;
        calisan2.workHours=39;
        calisan2.salary=920;
        calisan3.name=("Isci3");
        calisan3.hireYear=1999;
        calisan3.workHours=50;
        calisan3.salary=1000;


      tablo();

      calisan1.maas= Method.maasHesap(calisan1.salary, calisan1.workHours, calisan1.hireYear);
      Method.toString(calisan1.name, calisan1.salary, calisan1.workHours, calisan1.hireYear, Method.vergi, Method.bonus, Method.maasArtisi, calisan1.maas);
      calisan2.maas=maasHesap(calisan2.salary, calisan2.workHours, calisan2.hireYear);
      Method.toString(calisan2.name, calisan2.salary, calisan2.workHours, calisan2.hireYear, Method.vergi, Method.bonus, Method.maasArtisi, calisan2.maas);
      calisan3.maas=maasHesap( calisan3.salary, calisan3.workHours, calisan3.hireYear);
      Method.toString(calisan3.name, calisan3.salary, calisan3.workHours, calisan3.hireYear, Method.vergi, Method.bonus, Method.maasArtisi, calisan3.maas);

    }




}
