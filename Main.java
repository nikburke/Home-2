class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < intArray.length; i++){
            if (intArray[i]==1){
                intArray[i]=0;
            }
            else{
                intArray[i]=1;
            }
     System.out.print(intArray[i] +  " ");
      }
        System.out.println( " ");
        int N =8;
        int[] mass = new int[N];
        for(int i = 0; i < N; i++){
          mass[i]=i*3;
          System.out.print(mass[i] +  " ");
        }
        System.out.println( " ");
        int[] massive = new int[]{ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
       
        for(int i = 0; i < massive.length; i++){
          if (massive[i]<6){
                massive[i]=massive[i]*2;
                           }
          System.out.print(massive[i] +  " ");
        }
        System.out.println( " ");
        int[] myArr = {2, 2, 2, 1, 2, 2, 10, 1};

        System.out.println(dostusk6(myArr));
        
        int[][] task4 = new int[5][5];
        for(int i = 0; i < task4.length; i++){
          task4[i][i]=1;
          task4[i][task4[i].length-1-i]=1;
        }
          for(int i = 0; i < task4.length; i++){
            for(int j = 0; j < task4.length; j++){
              System.out.print(task4[i][j] +  " ");    
                   }
         System.out.println( " ");
          }

          int[] task5 = new int[]{ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            int max=task5[1];
            int min=task5[1];
            for(int i = 1; i < task5.length; i++){
              if (task5[i]>max){
                  max=task5[i];
                         }
              if (task5[i]<min){
                  min=task5[i];
                         }
          }
          System.out.println( "max=" + max);
          System.out.println( "min=" + min);
          System.out.println( " ");
          
    }
       static String dostusk6(int[] myArr) {
        int left = 0;
        int right;
        for (int i = 0; i < myArr.length; i++) {
            left=left+myArr[i];

            right=0;
            for (int j = 0; j < myArr.length; j++) {
                right += (j > i) ? myArr[j] : 0;
            }
            if (left == right) {
                return "true";
            }
        }
        return "false";
    }
}