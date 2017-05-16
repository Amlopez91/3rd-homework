/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class tables
{
    public static void main (String[] args)
    {
        int table [][];
        table = new int [6][2];
        
        table[0][0] = 1;
        table[0][1] = 2;
        table[1][0] = 3;
        table[1][1] = 4;
        table[2][0] = 5;
        table[2][1] = 6;
        table[3][0] = 7;
        table[3][1] = 8;
        table[4][0] = 9;
        table[4][1] = 10;
        table[5][0] = 11;
        table[5][1] = 12;
        
        for (int i=0;i<6;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}