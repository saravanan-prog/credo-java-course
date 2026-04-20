package List;

import java.util.Stack;

class Stackprg{
    Stack<Integer> data = new Stack<>();
    void insert(int item){
        data.push(item);
    }
    void delete(){
        data.pop();
    }
    void display(){
        for(Integer item :  data) {
            System.out.println("item===>" + item);
        }
    }

}

public class ExampleStack {
    public static void main(String[] args) {
        Stackprg obj = new Stackprg();
        obj.insert(10);
        obj.insert(5);
        obj.display();
        obj.delete();
        obj.display();

    }
}
