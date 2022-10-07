package employee;

public class Method {

    static double vergi;
    static double bonus;
    static double calistigiYilZammi;
    static double maasArtisi;
    static double maasHesabi = 0;


    static int workHoursBonus = 0;
    static int yil = 2021;
    static int taxKesinti = 0;
    static double hireYearZammi = 0;

    //  Salary (Maas) e Gore Vergiyi Hesaplayan Method
    public static int tax(int salary) {
        if (salary > 1000) {
            taxKesinti = (salary * 3 / 100);
        } else {
            taxKesinti = 0;
        }
        return taxKesinti;
    }

    //  workHours ( Calisma Satine( a Gore Bonusu Hesaplayan Mwethod
    public static int bonus(int workHours) {
        if (workHours > 40) {
            workHoursBonus = (workHours - 40) * 30;
        } else {
            workHoursBonus = 0;
        }
        return workHoursBonus;
    }

    //  raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır.
    public static double raiseSalary(int hireYear) {
        if ((yil - hireYear) < 10) {
            hireYearZammi = 0.05;
        } else if ((yil - hireYear) > 9 && (yil - hireYear) < 20) {
            hireYearZammi = 0.10;
        } else if ((yil - hireYear) > 19) {
            hireYearZammi = 0.15;
        }
        return hireYearZammi;
    }

    //  Güncel Maasi Hesaplayan Mwethod
    static double maasHesap(int salary, int workHours, int hireYear) {
        vergi = tax(salary);
        bonus = bonus(workHours);
        calistigiYilZammi = raiseSalary(hireYear);
        maasArtisi = bonus - vergi + ((salary + bonus - vergi) * calistigiYilZammi);// raiseSalary() hesaplarken vergi ve bonusları dikkate almalısınız.
        maasHesabi = salary + maasArtisi;
        return maasHesabi;
    }

    //  toString() : Çalışana ait bilgileri ekrana bastıracaktır.
    static void toString(String name, int salary, int workHours, int hireYear, double vergi, double bonus, double maasArtisi, double maas) {
        System.out.printf("%-9s %-9s %-13s %-11s %-9s%-9s %-13s %-19s\n", name, salary, workHours, hireYear, vergi, bonus, maasArtisi, maasHesabi);
    }

    //  // Konsolo tablo Goruntusu olusturmak icin yazdigimiz method
    static void tablo() {
        System.out.println("******************************** CALISAN MAAS TABLOSU **********************************");
        System.out.println("========================================================================================");
        System.out.printf("%-9s %-9s %-13s %-11s %-9s%-9s %-13s %-19s\n", "Name", "Salary", "WorkHours", "HireYear", "Vergi", "Bonus", "MaasArtisi", "Maas");
        System.out.println("========================================================================================");
    }


}
