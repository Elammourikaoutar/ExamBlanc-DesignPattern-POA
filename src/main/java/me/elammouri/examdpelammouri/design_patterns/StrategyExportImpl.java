package me.elammouri.examdpelammouri.design_patterns;

public class StrategyExportImpl implements IStrategyExport {
    @Override
    public void exporter() {
        System.out.println("Exporter le Diagramme de Classe");
    }
}
