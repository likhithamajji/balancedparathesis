import java.util.*;
public class balanced{
    public static void main(String[] args) {
        String s="{}}()";
    if(checkbalanced(s)){
        System.out.print("balanced");
    }else{
        System.out.print("not balanced");
    }
    }
    public static boolean checkbalanced(String s){
        Stack<Character>stack1 =new Stack<>();
        char[] arr=s.toCharArray();
        for(char i:arr){
        if (i=='('||i=='{'||i=='[' ){
            stack1.push(i);
        } 
        else{
    if(i==')'||i=='}'||i==']'){
        if(stack1.isEmpty()){
            return false;
        } 
        char top=stack1.pop();
        if(i==')'&& top!='('||i=='}'&& top!='{'||i==']'&& top!='['){
            return false;
        }
    }
}


    }
    return stack1.isEmpty();
}
}