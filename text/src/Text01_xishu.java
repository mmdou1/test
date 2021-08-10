public class Text01_xishu {
    public static void main(String[] args) {
        int[][] chestArry = new int[11][11];
        chestArry[0][1] =1;
        chestArry[1][2] =2;
        int sum =0;
        for (int i = 0; i <chestArry.length ; i++) {
            for (int j = 0; j <chestArry[i].length ; j++) {
                if(chestArry[i][j]>0){
                    sum++;
                }
            }
        }
        System.out.println(sum);

        int[][] xingu = new int[sum+1][3];
        xingu[0][0] =11;
        xingu[0][1] =11;
        xingu[0][2] =sum;
        int count=0;
        for (int i = 0; i <chestArry.length ; i++) {
            for (int j = 0; j <chestArry[i].length ; j++) {
                if(chestArry[i][j]!=0){
                    count++;
                    xingu[count][0]=i;
                    xingu[count][1]=j;
                    xingu[count][2]=chestArry[i][j];
                }
            }
        }


        for (int i = 0; i <xingu.length ; i++) {
            for (int j = 0; j <xingu[i].length ; j++) {
                System.out.print(xingu[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("1");
    }
}
