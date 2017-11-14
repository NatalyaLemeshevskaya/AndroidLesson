public class Lesson2 {
    public static void main(String[]arg){
        int [] array = new int[5];

        array[0] = 4;
        array[1] = 5;
        array[2] = 1;
        array[3] = 15;
        array[4] = 20;

        int min=array[0];
        int max;
        int sum=0;

        int i;

       for ( i=0; i<array.length ; i++) {
           // System.out.println(i);
          System.out.println(array[i]);
          sum = sum + array[i];

       }
       double avg= (double)sum/array.length;
           System.out.println(avg);



         for(i=1; i<array.length;i++)
         {
             if(min>array[i]){
                 min=array[i];
             }
         }
             System.out.println(min);


       // for(int value: array){
       //    System.out.println(value);
       // }
      //  int i=0;
      //  while (i<array.length){
       //     System.out.println(array[i]);
       //     i++;
       // }

       // do{

      //  }while (false);



    }
}
