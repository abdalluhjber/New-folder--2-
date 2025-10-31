public class Main {
    public static void main(String[] args) {
        Report report = new Report("Monthly Sales", "Sales increased by 15% in October.");
        ReportService service = new ReportService();

        ReportExporter textExporter = new TextReportExporter();
        ReportExporter jsonExporter = new JsonReportExporter();
        ReportExporter PdfReportExporter = new PdfReportExporter();

        service.generateReport(report, textExporter);
        service.generateReport(report, jsonExporter);
        service.generateReport(report, PdfReportExporter);

    }
}
