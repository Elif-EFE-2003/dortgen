public class dortgen {
    private double genislik;
    private double yukselik;

    public dortgen(int w){
        this.genislik=w;
        this.yukselik=w;
    }
    
    public dortgen(int w,int h){
        this.genislik=w;
        this.yukselik=h;
    }

    public dortgen(){
        this.genislik=0;
        this.yukselik=0;

    }

    public double getGenislik(){
       return this.genislik;
    }

    public double getYukselik(){
        return this.yukselik;
    }

    public void setGenislik( double w){
         this.genislik=w;
    }
    
    public void setYukseklik(double h){
        this.yukselik=h;
    }

    public void boyutGoster(){
        System.out.println("G: "+this.genislik +" Y:"+this.yukselik);
    }

    public double alan(){
        return this.genislik*this.yukselik;
    }
}
