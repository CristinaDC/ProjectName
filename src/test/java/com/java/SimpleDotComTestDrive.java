package com.java;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        esteTestCompruebaQueCuandoFallaDevuelveMiss();
    }

    private static void esteTestCompruebaQueCuandoFallaDevuelveMiss() {
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        String result = simpleDotCom.checkYourself("marujita diaz");
        if("miss".equals(result)){
            System.out.println("funciona loco");
        } else{
            System.out.println("Algo no anda bien");
        }
    }
}
