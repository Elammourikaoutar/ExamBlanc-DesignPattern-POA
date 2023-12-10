package me.elammouri.examdpelammouri.design_patterns;

import me.elammouri.examdpelammouri.aspects.Log;
import me.elammouri.examdpelammouri.design_patterns.IAncienGenerateCode;

public class AncienImpGenerateCode implements IAncienGenerateCode {
    @Log
    public void genererCode() {
        System.out.println("Ancienne Implmentation Génération du code");
    }
}
