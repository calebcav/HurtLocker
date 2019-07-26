import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ItemParser {


    public static ArrayList<Item> listOfItems = new ArrayList<Item>();

    public static HashMap<String, Integer> map = new HashMap<String, Integer>();

    
    
    public void obtainItems(String input){
        String[] noHashes = input.split("##");
        for (int i = 0; i < noHashes.length; i++) {
            String[] separatedValues = noHashes[i].split(":|;|!|@|%|\\*|\\^");
            addItem(separatedValues);
        }
    }

    public void printItems(){
        for (int i = 0; i < listOfItems.size(); i ++){
            System.out.println(listOfItems.get(i).getName());
        }
    }


    public void addItem(String[] list){

        Item item = new Item();

        for (int i = 0; i < list.length; i+=2) {
            if (checkName(list[i])){
                if(!checkPrice(list[i+1])){
                    item.setName(list[i+1]);
                }
            }
            else if (checkPrice(list[i])){
                if(!checkType(list[i+1])){
                    item.setPrice(list[i+1]);
                }
            }
            else if (checkType(list[i])){
                item.setType(list[i+1]);
            }
            else if (checkExpiration(list[i])){
                item.setExpiration(list[i+1]);
            }
        }
        listOfItems.add(item);
    }



    public void addItemOccurences(){

        for (int i = 0; i < listOfItems.size(); i ++){
            String name = listOfItems.get(i).getName();
            if (map.containsKey(changeItemName(name))){
                int k = map.get(changeItemName(name));
                map.put(changeItemName(name), k);
            }
            else {
                int k = 1;
                map.put(changeItemName(name), k);
            }
        }


    }


    public void printItemOccurences(){
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("-------");
        }
    }


    public String changeItemName(String name){
        if (checkApples(name)){
            return "Apples";
        }
        else if (checkBread(name)){
            return "Bread";
        }
        else if (checkCookies(name)){
            return "Cookies";
        }
        else if (checkMilk(name)){
            return "Milk";
        }
        return null;
    }





    public boolean checkName(String word){
        if (word.matches("(?i:.*name.*)")){
            return true;
        }
        return false;
    }


    public boolean checkType(String word){
        if (word.matches("(?i:.*type.*)")){
            return true;
        }
        return false;
    }

    public boolean checkPrice(String word){
        if (word.matches("(?i:.*price.*)")){
            return true;
        }
        return false;
    }

    public boolean checkExpiration(String word){
        if (word.matches("(?i:.*expiration.*)")){
            return true;
        }
        return false;
    }


    public boolean checkMilk(String word){
        if (word.matches("(?i:.*milk.*)")){
            return true;
        }
        return false;
    }

    public boolean checkBread(String word){
        if (word.matches("(?i:.*bread.*)")){
            return true;
        }
        return false;
    }

    public boolean checkApples(String word){
        if (word.matches("(?i:.*apples.*)")){
            return true;
        }
        return false;
    }

    public boolean checkCookies(String word){
        if (word.matches("(?i:.*c..kies.*)")){
            return true;
        }
        return false;
    }



}
