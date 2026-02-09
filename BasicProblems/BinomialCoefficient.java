package BasicProblems;

class BinomialCoefficient{
    public  static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    public static  int BinoCoeff(int n, int r){
        int  nf=fact(n);
        int  rf=fact(r);
        int  nmr=fact(n-r);

        int coeff=nf/(rf*nmr);
        return  coeff;
    }
    public static void main(String[] args) {
        System.out.println(BinoCoeff(5,2));
    
    }
}