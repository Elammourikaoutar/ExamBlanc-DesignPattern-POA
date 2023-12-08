package me.elammouri.examdpelammouri.design_patterns;

import me.elammouri.examdpelammouri.aspects.Log;

public class ExportDiagrammeSvg implements IStrategyExport {
    @Log
    @Override
    public void exporter() {
        System.out.println("Export diagramme svg");
    }
}
