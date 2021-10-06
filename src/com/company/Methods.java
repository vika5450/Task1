package com.company;
/* Iterable понадобится, чтобы мы могли успешно работать с arraylist */

public interface Methods <list> extends Iterable <list>
{
    boolean add (list e);
    void delete (int index);
    list get (int index);
}
