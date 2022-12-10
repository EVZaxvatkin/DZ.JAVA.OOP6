package org.example.oop6.service;

import org.example.oop6.data.Shape;

public interface IRepository <T extends Shape> {
    public void add(T value);
}
