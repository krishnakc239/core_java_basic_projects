package collection.array.list_map_set;

import javafx.scene.input.KeyCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.K;
import static javafx.scene.input.KeyCode.V;

/**
 * Created by krishna KC on 11/28/2016.
 */
public class InterfaceMap {
    Map<String, Info> stMap= new HashMap<String,Info>();
    Info inf=new Info();
    Scanner sc= new Scanner(System.in);
   public void setInfo(){
       Info in=new Info();
       in.addInfo();
       stMap.put(in.name,in);
   }
    public void getInfo(){
        System.out.println("name    address    roll");
        for(Map.Entry<String,Info> e:stMap.entrySet()){
            System.out.println(e.getKey()+"    "+e.getValue().address+"    "+e.getValue().roll);
        }
    }
    public void searchByName() {
        System.out.println("enter name to be searched");
        String name = sc.next();
        for(Map.Entry<String,Info> e:stMap.entrySet()){
            if (name.equals(e.getKey())) {
                System.out.println("Searche matched..\nAnd data is:");
                System.out.println(e.getKey()+" "+e.getValue().address+" "+e.getValue().roll);
            }
        }
    }

    public void searchByRoll() {
        System.out.println("enter the roll no to be searched:");
        int in = sc.nextInt();
        for(Map.Entry<String,Info> e:stMap.entrySet()){
            if (in == e.getValue().roll) {
                System.out.println("Found data...\nAnd data is:");
                System.out.println(e.getKey()+"  "+e.getValue().address+" "+e.getValue().roll);
            }
        }

    }
    public void searchByAddress(){
        System.out.println("enter address to be searched ...");
        String address=sc.next();
        for(Map.Entry<String,Info> e:stMap.entrySet()){
            if(address.equals(e.getValue().address)){
                System.out.println("Found data..\nAnd data is:");
                System.out.println(e.getKey()+" "+e.getValue().address+" "+e.getValue().roll);
            }
        }
    }
    public void displaySearchKey(){
        inf.chooseMenu();
        int in=sc.nextInt();
        switch(in){
            case 1:
                searchByName();
                break;
            case 2:
                searchByAddress();
                break;
            case 3:
                searchByRoll();
                break;

        }
    }
}
