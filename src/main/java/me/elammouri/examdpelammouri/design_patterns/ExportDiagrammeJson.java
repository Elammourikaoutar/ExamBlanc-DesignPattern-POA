package me.elammouri.examdpelammouri.design_patterns;

import me.elammouri.examdpelammouri.aspects.Log;

public class ExportDiagrammeJson implements IStrategyExport {
    @Log
    @Override
    public void exporter() {
        System.out.println("Export diagramme json");
    }
}
