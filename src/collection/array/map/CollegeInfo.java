package collection.array.map;

import javafx.scene.input.KeyCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.K;
import static javafx.scene.input.KeyCode.V;

/**
 * Created by krishna KC on 11/28/2016.
 */
public class CollegeInfo {
    String name,address;
    Map<String, String> stMap= new HashMap<String,String>();
    Scanner sc= new Scanner(System.in);
    public void setInfo(){

            System.out.println("Enter College name :");
            name = sc.next();
            System.out.println("Enter address:");
            address = sc.next();
            stMap.put(name, address);

    }
    public void getInfo(){
       for(Map.Entry<String,String>e:stMap.entrySet()){
           System.out.println(e.getKey()+"    "+e.getValue());
        }
    }
}
