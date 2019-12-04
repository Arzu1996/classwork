package classwork.task0511;

public class Task0511 {
    public int calc(String a) {
        int current_max = 0;
        int max=0;
        for (int i = 0; i <a.length() ; i++) {
            if (a.charAt(i)=='('){
               current_max++;
               if (current_max>max){
                   max=current_max;
               }
            }else if (a.charAt(i)==')'){
                if (current_max>0)
                    current_max--;
            }
        }return  max;
    }

}
