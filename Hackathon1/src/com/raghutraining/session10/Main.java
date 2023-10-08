package com.raghutraining.session10;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Workspace\\JavaWorld\\test.txt");

        //option 1
        Scanner p = new Scanner(f);
        System.out.println(p.nextLine());
        p.close();

        //option 2
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        fr.close();
        br.close();

    }

}
