package ch08;

/**
 * Created by justin on 6/29/16.
 */
public class DateStringConverter
{
  public static String dateStr(String date)
  {
    // I'm not allowed to use arrays!
//    String[] dateSplit = date.split("/");
//
//    for(int i = 0; i < dateSplit.length; i++)
//    {
//      if (dateSplit[i].length() < 2) dateSplit[i] = "0" + dateSplit[i];
//    }
//    return dateSplit[1] + "-" + dateSplit[0] + "-" + dateSplit[2];

    int firstSlash = date.indexOf("/");
    int lastSlash = date.lastIndexOf("/");

    String month = date.substring(0,firstSlash);
    String day = date.substring(firstSlash+1, lastSlash);
    String year = date.substring(lastSlash+1);

    if (month.length() < 2) month = "0" + month;
    if (day.length() < 2) day = "0" + day;

    return day + "-" + month + "-" + year;
  }

  public static void main(String[] args)
  {
    String date = "6/29/2016";
    date = dateStr(date);
    System.out.println(date);
  }
}
