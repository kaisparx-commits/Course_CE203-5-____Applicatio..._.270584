import java.util.*;
import java.io.*;

public class Lab6
{ static HashMap<String,Integer> marks = new HashMap<String,Integer>();

  public static void main(String[] args)
  { BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    boolean more = true;
    while (more)
    { System.out.print("Name: ");
      String name = null;
      try
      { name = buf.readLine();
      }
      catch (Exception e)
      {
      }
      System.out.print("Mark: ");
      int mark = 0;
      try
      { mark = Integer.parseInt(buf.readLine().trim());
      }
      catch (Exception e)
      { System.out.println("invalid input - using 0");
      }
      marks.put(name, mark);
      System.out.print("More? ");
      try
      { if (buf.readLine().charAt(0)!='y')
        more = false;
	  }
      catch (Exception e)
      {
      }
    }
    System.out.println(marks);
  }
}


