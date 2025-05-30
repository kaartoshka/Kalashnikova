public class Main {
    public static void main(String[] args) {
        try {
            DataAPI dataAPI = new DataAPI();

            // ������ ���������� ������
            DataModel newData = new DataModel(1, "Sample content", true);
            dataAPI.insertData(newData);

            // ������ ��������� ������ (������ ���� ���� �� ����, ��� ��� read-only)
            DataModel retrievedData = dataAPI.getData(1);
            System.out.println("Retrieved data: " + retrievedData);

            // ������ ���������� ������
            retrievedData.setContent("Updated content");
            retrievedData.setReadOnly(false); // ������ ������ �� ����� ������������
            dataAPI.updateData(retrievedData);

            // ������ ��������� ������
            System.out.println("Report:");
            dataAPI.generateReport().forEach(System.out::println);

            // ������ �������� ������
            dataAPI.deleteData(1);

            dataAPI.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}