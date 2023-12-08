package me.elammouri.examdpelammouri.design_patterns;


import me.elammouri.examdpelammouri.aspects.Log;

public class Adaptateur extends AncienImpGenerateCode implements IStratgyGenerateCode {

    @Log
    @Override
    public void genererCode() {
        genererCode();
    }
}
