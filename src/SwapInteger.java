public class SwapInteger {
    private  int number;
   public  SwapInteger(int number){
       this.number=number;
   }
   public  int getNumber(){
       return  number;
   }
    public static void swap(SwapInteger i1,SwapInteger i2) {
     int a= i1.number;
     i1.number=i2.number;
     i2.number=a;
    }

    }

