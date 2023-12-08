package me.elammouri.examdpelammouri.design_patterns;

import me.elammouri.examdpelammouri.aspects.Log;

public class ExportDiagrammeBinaire implements IStrategyExport {

    @Log
    @Override
    public void exporter() {
        System.out.println("Exporter le Diagramme de Classe");
    }
}
