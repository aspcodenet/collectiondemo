package se.systementor;

import java.util.ArrayList;

public class CollectionDemo {
    public void run(){
        //ArrayList<Integer> age = new ArrayList<>();

        //ArrayList<String> players = new ArrayList<>();
        //players.add("Foppa");
        //players.add("Sudden");
        ArrayList<String> players = new ArrayList<>();

        //var players = new ArrayList<String>();
        while(true){
            System.out.println("1. Skapa ny spelare");    
            System.out.println("2. Lista alla");    
            System.out.println("4. Ta bort");    
            System.out.println("3. Exit");    
            int sel = Integer.parseInt(System.console().readLine());

            if(sel == 4){
                System.out.print("Skriv in namn på den du vill ta bort:");    
                String namn =  System.console().readLine();
                players.remove(namn);
            }
            

            if(sel == 1){
                System.out.print("Skriv in namn:");    
                String namn =  System.console().readLine();
                if(players.contains(namn) == false)
                    players.add(namn);
            }
            if(sel == 2){
                for(String p : players ){
                    System.out.println(p);
                }
            }
            if(sel == 3){
                break;
            }

        }

        String []weekDays = {"Måndag", "Tisdag", "Onsdag", "..."};

        int []talen = {12,456,111,234};
        int largest = talen[0];

        for ( int tal: talen ){
            if(tal > largest)
                largest = tal;
        }
        System.out.println("Största är " + largest);

        String mening = "hej hopp sss";

        String [] minaBarn2 = {"Fanny", "oliver", "Josefine"};

        // String [] minaBarn = new String[3];
        // minaBarn[0] = "Fanny";
        // minaBarn[1] = "Oliver";
        // minaBarn[2] = "Josefine";
       for(String oneChild : minaBarn2) {
           System.out.println(oneChild);
       }

        for(int index = 0; index < minaBarn2.length;index++){
            System.out.println(minaBarn2[index]);    
        }

        //
        // System.out.println(minaBarn[0]);
        // System.out.println(minaBarn[1]);
        // System.out.println(minaBarn[2]);
    }
}
