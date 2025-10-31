public class PdfReportExporter implements ReportExporter {
    @Override
    public void export(Report report) {
        System.out.println("Exporting report as pdf...");
        System.out.println("{ \"title\": \"" + report.getTitle() + "\", \"content\": \"" + report.getContent() + "\" }");
    }
}
