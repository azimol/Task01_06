/**
 * ������������ �������� �������� � ���������
 */
public class Record {


    private int max = 100;//���������� ������������ ��������� �������
    private int n;

    public int getN() {
        return n;
    }

    private String[] records;

    public Record(){
        records = new String[max];
        n = 0;
    }

    /**
     * ��������� ������ � ������ �������
     * @param rec ����������� ������
     */
    public void add(String rec){
        records[n++] = rec;
    }

    /**
     * ������� ���������� ������� � ������� �������
     *
     * @return ��������� ������ � ������� �������
     */
    public String delete(){
        records[n] = null;
        return records[n--];
    }

    /**
     * �������� �������� �� �������
     *
     * @param index ������ ��������� ������
     * @return ��������� �������
     */
    public String delete(int index){
        String delStr = records[index];
        for(int i = index; i<n; i++){
            records[i] = records[i+1];
        }
        n--;
        return delStr;
    }

    /**
     * �������������� ������ � ������� �������
     *
     * @param index ������ ������������� ������
     * @param rec ������ ������������� ������
     */
    public void edit(int index, String rec){
        records[index] = rec;
    }


    /**
     * ����� ���� ������� �� �������
     */
    public void allRecords(){
        for(int i=0; i<n; i++)
            System.out.println(i + ". " + records[i]);
    }

}
