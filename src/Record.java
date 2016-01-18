/**
 * Осуществляет основные действия с блокнотом
 */
public class Record {


    private int max = 100;//количество максимальное возможных записей
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
     * Добавляет запись в массив записей
     * @param rec Добавляемая запись
     */
    public void add(String rec){
        records[n++] = rec;
    }

    /**
     * Удаляет последений элемент в массиве записей
     *
     * @return последняя запись в массиве записей
     */
    public String delete(){
        records[n] = null;
        return records[n--];
    }

    /**
     * Удаление элемента по индексу
     *
     * @param index Индекс удаляемой записи
     * @return Удаленный элемент
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
     * Редактирование записи в массиве записей
     *
     * @param index Индекс редактируемой записи
     * @param rec Запись редактируемой записи
     */
    public void edit(int index, String rec){
        records[index] = rec;
    }


    /**
     * Вывод всех записей на консоль
     */
    public void allRecords(){
        for(int i=0; i<n; i++)
            System.out.println(i + ". " + records[i]);
    }

}
