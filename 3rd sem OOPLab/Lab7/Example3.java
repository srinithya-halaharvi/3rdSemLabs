/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example3;
class Example3{
    static int num;
    static String mystr;
    static{
        num=97;
        mystr="Static keyword in java";
    }
    public static void main(String args[]){
        System.out.println("Value of num="+num);
        System.out.println("Value of mystr="+mystr);
    }
}