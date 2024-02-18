public class stack1 {
  static int maxSize;
  static int top;
  static int[] array;
  stack1(int size){
      maxSize = size;
      top = -1;
      array = new int [maxSize];
  }

  void push(int num){
    if(top == maxSize-1){
          System.out.println("Stack is Full");
    }
    else{
      top++;
      array[top] = num;
    }
  }

  void pop(){
    if(top == -1){
      System.out.println("Stack is Empty");
    }
    else{
      top--;
    }
  }

  boolean isEmpty(){
    return (top == -1);
  }

  boolean isFull(){
    return (top == (maxSize-1));
  }

  void peek(){
    if(top == -1){
      System.out.println("Stack is Empty");
    }
    else{
      System.out.println(array[top]);
    }
  }


  public static void main(String args[]){
      Stack stack1 = new Stack(5);
      stack1.push(10);
      stack1.pop();
      stack1.isFull();
      stack1.isEmpty();
      stack1.push(20);
      stack1.peek();
  }
}
