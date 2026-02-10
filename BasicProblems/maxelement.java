
public class maxelement {
    public static void main(String[] args) {
        int a[] = {2,5,3,6,4,10,50,23,90,24};
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);

    }
}
