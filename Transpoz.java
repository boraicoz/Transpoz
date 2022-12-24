import java.util.Arrays;
public class Transpoz {

    public static void main(String[] args) {
        int [][]matris=new int[][]{{2,3,4},{5,6,4}};
         int [][]transpoz=new int[matris[0].length][matris.length];
        System.out.println("Matris:");
         for(int i=0;i<matris.length;i++)
        {
            for(int j=0;j<matris[0].length;j++){
                System.out.print(matris[i][j]+" ");
                transpoz[j][i]=matris[i][j];
            }
            System.out.println();
        }
        System.out.println("Transpoz:");
              for(int []row:transpoz)
              {
                  for(int col:row)
                  {
                      System.out.print(col+" ");
                  }
                  System.out.println();
              }



    }

}
