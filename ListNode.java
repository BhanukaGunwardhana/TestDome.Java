package Java_Advanced.TestDomeTests;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.NodeList;

/**
 * Definition for singly-linked list.*/
 public class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
  class Solution {
  
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
      ListNode node1=l1;
      ListNode node2=l2;
      boolean firstit=true;
      int count=0;
      ListNode currNode=null;
      ListNode firstNode=null;
      int retain=0;
      while((node1!=null || node2!=null || retain!=0) && count<=100){
        count++;
        int num1=0;
        int num2=0;
        if(node1!=null){num1=node1.val; }
        if(node2!=null){num2=node2.val;}
        
        if((num1<0 || num2<0) || (num1>9 ||num2>9)){
          return null;
        }
        
        
       
        int sum=num1+num2+retain;
        int num3=sum/10;
        int mod=sum%10;
        
        if(firstit==true){
          currNode=new ListNode(mod);
          firstNode=currNode;
          retain=num3;

          firstit=false;
          node1=node1.next;
          node2=node2.next;
          continue;
        }
        
        //currNode=new ListNode(mod, currNode);
        currNode.next=new ListNode(mod);
        currNode=currNode.next;
        retain=num3;
        if(node1!=null){node1=node1.next;}
        
        if(node2!=null){node2=node2.next;}
        
        
        //node2=node2.next;

        
        


      }
      return currNode;




      /*String s1="";
      String s2="";
      String s3="";
      List<String> ls1=new ArrayList<>();
      List<String> ls2=new ArrayList<>();
      List<Integer> ls3=new ArrayList<>();

      ListNode node1= l1;
      ListNode node2=l2;
      if(l1==null || l2==null){return null;}
      
      int count=1;
     
      while (node1!= null){
        if(count>100){return null;}
        int value=node1.val;
        if(value<0 || value>9){return null;}
        ls1.add(String.valueOf(node1.val));

        node1=node1.next;
        count++;
      }
      int count_=0;
      while (node2!= null){
        if(count>100){return null;}
        int value_=node2.val;
        if(value_<0 || value_>9){return null;}
        ls2.add(String.valueOf(node2.val));

        node2=node2.next;
        count_++;
      }
      for (int i=ls1.size()-1;i>=0;i--){
        s1=s1+ls1.get(i);
      }
      for(int i=ls2.size()-1;i>=0;i--){
        s2=s2+ls2.get(i);
      }
      if(s1.equals("") || s2.equals("")){return null;}
      long sum=Long.parseUnsignedLong(s1)+Long.parseUnsignedLong(s2);
      //double sum=Double.parseDouble(s1)+Double.parseDouble(s2);
      s3=String.valueOf(sum);
      for(int i=0;i<s3.length();i++){
        ls3.add(Integer.valueOf(s3.substring(i, i+1)));
        

      }
      ListNode first=new ListNode(ls3.get(0));   
      ListNode currNode=first;   
      for(int i=1;i<ls3.size();i++){
        //currNode.setNext(new ListNode(ls3.get(i)));
        currNode=new ListNode(ls3.get(i), currNode);
          
      }
      return currNode;*/


      
      
      
    }
    
}


