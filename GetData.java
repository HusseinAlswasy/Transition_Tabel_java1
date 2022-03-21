/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks_formal;

import static tasks_formal.Tasks_formal.myObj;

/**
 *
 * @author gamal
 */
public class GetData {
    static int[][] FillArray(int [][] arr) {
        System.out.println("");
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.println("Row "+(row+1)+"\nCol "+(col+1));
                    arr[row][col] = myObj.nextInt();
                }
            }
            System.out.println("");
        return arr;
        }
    static void printArray(int [][] arr) {
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.print("--"+arr[row][col]+"--");
                }
            System.out.println();
                }
            }
        static String DVA(int states,int table[][],String chars[]){
            String text=
       "public static boolean belongs(String token){\n"+
        "\tint state=1;\n\tint i=0;\n"+
        "\twhile(i<token.length()){\n"+
        "\tchar ch= token.getCharAt(x);\n"+
        "\tswitch(state){\n";
            
        for(int i=0;i<states;i++)
        {
            text+="\n\tcase "+(i+1)+":";
            for(int j=0;j<chars.length;j++)
            {
                if (j==0) {
                    text+="\n\t\tif(ch=="+"'"+chars[j]+"'"+")state="+table[i][j]+";";
                }
                else{
                    text+="\n\t\telse if(ch=="+"'"+chars[j]+"'"+")state="+table[i][j]+";";
                }
            }
            text+="\n\t\telse return false;\n\tbreak;";
        }
        text+="\n\t\t}\n\ti=i+1;\n\t}";
        text+="\n\tif(state=="+table[states-1][0]+")";
        text+="\n\treturn true;\n\telse\n\treturn false;\n}";
        
        return text;
    }
        }
   

