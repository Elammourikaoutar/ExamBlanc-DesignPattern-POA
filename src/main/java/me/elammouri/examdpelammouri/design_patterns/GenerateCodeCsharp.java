package me.elammouri.examdpelammouri.design_patterns;

import me.elammouri.examdpelammouri.aspects.Log;

public class GenerateCodeCsharp implements IStratgyGenerateCode {
    @Log
    @Override
    public void genererCode() {
        System.out.println("Generate code Csharp");
    }
}
