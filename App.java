public class App {

    public static void main(String[] args) throws Exception {
         dortgen d1;
         d1=new dortgen(5,7);
         d1.boyutGoster(); 
        System.out.println("Alan: "+d1.alan()); 
        dortgen d2;
        d2= new dortgen(3);
        System.out.println("Kenar uzunluğu: "+d2.getGenislik());
        d2.setGenislik(10);
        System.out.println("Kenar uzunluğu: "+d2.getGenislik());
    }
}
