//Write a program that will count number of notes from given array[1000,500,200,100,50,20,10,5,2,1]
//Input: 562
//Output:
//500 1
//50 1
//10 1
//2 1
public class countNumberOfNotes {
    public static void main(String[] args) {

        int[] arr={1000,500,200,100,50,20,10,5,2,1};
        int number= 562;

        for(int i=0;i<arr.length;i++){
            int note=arr[i];
            if(number>=note){
                int count=number/note;
                number=number%note;
                System.out.println(note+" "+count);

            }



        }

    }
}
