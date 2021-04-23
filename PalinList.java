//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
 private Queue<String> queue;
 private Stack<String> stack;

 public PalinList()
 {
  setList("");
 }

 public PalinList(String list)
 {
   setList(list);
 }

 public void setList(String list)
 {
   stack = new Stack<String>();
   queue = new LinkedList<String>();
   String[] s = list.split(" ");
   if (list.length()!=0)
   {
    for (String str: s)
    {
      stack.push(str);
      queue.add(str);
    }
   }
 }

 public boolean isPalin()
 {
   boolean b = true;
   Stack<String> temp = new Stack<String>();
   while(!queue.isEmpty())
   {
     temp.push(stack.peek());
     if(!queue.remove().equals(stack.pop()))
      b = false;
   }
  stack = temp;
  return b;
 }


 //write a toString method
 public String toString()
 {
   String stackStr = stack.toString();
   String result;
   if (isPalin())
    result = "is a palinlist.";
  else
    result = "is not a palinlist.";
    return stackStr + " " + result;

 }
}
