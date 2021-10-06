package com.company;
/**
 * @author Вяткины Виктория и Ксения
 * */
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList<list> implements Methods<list>
{
    public static void main (String [] args) {
        Methods<String> strings = new ArrayList< >();
        strings.add("first");
        strings.add("second");
        strings.add("tree");
        Scanner scanner = new Scanner(System.in);
        int number=1;

        while (number!=0)
        {
            System.out.print("Выберете действие: " + "\n" +
                    "1. Добавить элементы" + "\n" +
                    "2.Удалить элемент под индексом" + "\n" +
                    "3.Выведем коллекцию с изменениями" + "\n" +
                    "4.Поиск элемента из коллекции под индексом" + "\n"+
            "5. Если 0 конец работы программы"+"\n");
            number = scanner.nextInt();

            switch (number) {

                case 1: {
                    System.out.print("Добавим элементы: " + "\n");
                    strings.add("first");
                    strings.add("second");
                    strings.add("tree");
                    for (String s : strings) {
                        System.out.println(s);
                    }
                }
                break;
                case 2: {

                    System.out.print("Удалим элемент под индексом: ");
                    int number1 = scanner.nextInt();
                    strings.delete(number1);
                    for (String s : strings) {
                        System.out.println(s);
                    }
                }
                break;
                case 3: {
                    System.out.println("Выведем коллекцию");
                    for (String s : strings) {
                        System.out.println(s);
                    }

                }
                break;
                case 4: {
                    System.out.println("Поиск элемента из коллекции под индексом:");
                    try {
                        System.out.println(strings.get(0));
                    }
                    catch (Exception ex)
                    {
                        System.out.println("ошибка");
                    }

                }
                break;
            }

        }
    }

    /**
     * Поле список
     */
    private list[] value;

    /**
     * инициализация списка
     */
    public ArrayList()
    {
        value = (list[]) new Object[0];
    }

    /**
     *
     * @param e элемент списка
     * @return возвращает правильно отработанное добавление
     */
    @Override
    public boolean add(list e) {
      try {
          list[] temp =value;
          value= (list[]) new Object[temp.length + 1];
          System.arraycopy(temp, 0, value, 0, temp.length);
          value[value.length - 1] = e;
          return true;
      }
      catch (ClassCastException ex) {
          ex.printStackTrace();
      }
        return false;
    }

    /**
     *
     * @param index индекс элемента списка
     */
    @Override
    public void delete(int index) {
        try {
            list[]temp =value;
            value=(list[]) new Object[temp.length-1];
            System.arraycopy(temp,0,value,0,index);
            int amountElemAfterIndex=temp.length-index-1;
            System.arraycopy(temp,index+1,value,index,amountElemAfterIndex);
             }
        catch (ClassCastException ex)
        {ex.printStackTrace();}
    }

    /**
     *
     * @param index идекс элемента списка
     * @return элемент из колекции под индексом
     */
    @Override
    public list get(int index) {
        return value[index];
    }


    @Override
    public Iterator<list> iterator() {
        return new ArrayIterator<>(value) ;
        }


}

