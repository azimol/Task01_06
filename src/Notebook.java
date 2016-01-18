/**
 * Блокнот
 */
public class Notebook {

    private String name;
    public Record record;

    public Notebook(String name) {
        this.name = name;
        record = new Record();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Количество записей в блокноте
     * @return Количество записей
     */
    public int countOfRec(){
        return record.getN();
    }

}
