package me.elammouri.examdpelammouri.design_patterns;

import me.elammouri.examdpelammouri.aspects.Log;

public class GenerateCodeJava implements IStratgyGenerateCode {
    @Log
    @Override
    public void genererCode() {
        System.out.println("Générer le code JAVA");
    }
}
