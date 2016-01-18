import java.io.*;

/**
 * Created by Marina on 11.12.2015.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        //PrintStream out = new PrintStream(System.out, false, "cp1251");
        //System.setProperty("console.encoding","UTF-8");
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out,"Cp1251"),true);

        Notebook ntb = new Notebook("1");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        do{
            System.out.println("1. add record \n" +
                    "2. drop record \n" +
                    "3. edit record\n" +
                    "4. show all records\n" +
                    "0. exit");
            n = Integer.parseInt(br.readLine());
            switch(n){
                case 1:
                    System.out.println("enter new record: ");
                    String newRec = br.readLine();
                    ntb.record.add(newRec);
                    break;
                case 2:
                    System.out.println("enter index deleting record:");
                    int ind = Integer.parseInt(br.readLine());
                    String delStr = ntb.record.delete(ind);
                    System.out.println("record \"" + delStr + "\" deleted");
                    break;
                case 3:
                    System.out.println("enter record:");
                    String editRec = br.readLine();
                    System.out.println("enter index before " + ntb.record.getN());
                    int index = Integer.parseInt(br.readLine());
                    ntb.record.edit(index, editRec);
                    break;
                case 4:
                    ntb.record.allRecords();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:

            }

        }while(n != 0);


    }

}
