public class Classes {

    public static void main(String[] arg){

        Integer a= new Integer(10);
        Integer b= new Integer(10);
        //чтобы сравнивать значения, а не адреса, вместо ==
        if (a.equals(b)){
            System.out.println("1 thue");
        }else{
            System.out.println("1 false");
        }

        Integer a1=-128;
        Integer b1=-128;// от -128 до 127
        if (a1==b1){
            System.out.println("2 thue");
        }else{
            System.out.println("2 false");
        }

        String a2 = new String("Hello");
        String b2 = new String("Hello");

        if (a2==b2){
            System.out.println("3 thue");
        }else{
            System.out.println("3 false");
        }

        // b4 изменяемая, поэтому false
        String b4="o";
        String a3 = "Hello";
        String b3 = "Hell"+b4;// "Hell"+"o"- true

        if (a3==b3){
            System.out.println("4 thue");
        }else{
            System.out.println("4 false");
        }









    }
}
