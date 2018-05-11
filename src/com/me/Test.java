package com.me;

public class Test<T>
{
    // An object of type T is declared
    T obj;

    // constructor
    Test(T obj) {
        this.obj = obj;
    }

    //method
    public T getObject() {

        return this.obj;

    }


}
