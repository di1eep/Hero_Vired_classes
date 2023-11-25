public class Main {
    public static void main(String[] args){
        int[] arr;
        arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr[2]);
        int[] arr2 = {100, 200, 300};
        System.out.println(arr2[1]);

        String[] names = {"Dileep","Shakul","shoel","Faisal"};
//        for(int i = 0; i < names.length; i++){
//            System.out.println(names[i]);
            for(String i:names){
                System.out.println(i);
            }
        }

    }
