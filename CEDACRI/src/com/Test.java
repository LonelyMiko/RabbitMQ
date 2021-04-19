package com;

public class Test {
        public static void main(String [] args) {
            try {
                throw new RuntimeException("TEST");
            }catch (RuntimeException exception)
            {
                exception.initCause(new RuntimeException());
                exception.getCause();
            }

        }
    }
