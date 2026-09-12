  public class Pattern2no {
    public static void main(String args[]){
        int temp = 1;
        for(int i = 4; i>=1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(temp++ +" ");

            }
            System.out.println();
        }
    }
    
}
