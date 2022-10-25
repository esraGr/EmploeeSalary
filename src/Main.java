public class Main {
    public static void main(String[] args) {
    Employee employee1=new Employee("Esra",700,60,2000);
    Employee employee2=new Employee("Ahmet Can",1000,40,2003);
    Employee employee3=new Employee("Faruk ",500,45,2015);
    Employee employee4=new Employee("Gülşah",2200,53,2002);


        System.out.println("employee1="+ employee1);
        System.out.println("employee1.Toplam maas="+employee1.ToplammaasHesapla());

        System.out.println("employee2="+ employee2);
        System.out.println("employee2.Toplam maas="+employee2.ToplammaasHesapla());

        System.out.println("employee3="+ employee3);
        System.out.println("employee3.Toplam maas="+employee3.ToplammaasHesapla());

        System.out.println("employee4="+ employee4);
        System.out.println("employee4.Toplam maas=" +employee4.ToplammaasHesapla());



    }
}
