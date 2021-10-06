package com.company;
import java.util.Iterator;
    public class ArrayIterator <list> implements Iterator<list>
    {
        private int index=0;
        private list[] values;
        ArrayIterator (list[] values)
        {
            this.values=values;
        }
        /*проверяет есть ли ещё элементы*/
        public boolean hasNext()
        {
            return index< values.length;
        }
        /*возвращает текущий элемент и перемещается на следующий*/
        public list next()
        {
            return values[index++];
        }

}