package com.padmaja.flowcontrol;
import java.lang.String;

public class ForLoopExample {
    public int tablesExample(int tableOf) {
        for(int ctr=1; ctr <=5 ; ctr++){
            System.out.println(tableOf*ctr);
        }
        return tableOf;

    }

    public int forLoopExample2(int ctr) {
        for(int j=10,k=14; j<=k;++j,k=k-1,ctr--);
        {
            System.out.print(ctr);
        }
        return ctr;
    }
}