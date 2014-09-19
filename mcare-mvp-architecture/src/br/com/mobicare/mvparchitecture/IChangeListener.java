package br.com.mobicare.mvparchitecture;

public interface IChangeListener<T> extends IAbstractListener {

    void handle(T event);
}