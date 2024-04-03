import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int count = 0;
    for(int i = 0; i < myList.size(); i++){
      String s = new String (myList.get(i));
      if(myList.get(i).length == len)
          count++;
      return count;
  }
  }
  public void removeWordsOfLength(int len){
    int i = 0;
    while(i < myList.size()){
        String word = new String (myList.get(i));
        if(word.length() == length)
            myList.remove(i);
        else
            i++;
    }
  }
