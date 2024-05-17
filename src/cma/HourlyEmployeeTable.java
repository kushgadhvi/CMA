package cma;

public class HourlyEmployeeTable extends CustomTableModel {

    public HourlyEmployeeTable(Object[] data) {
        super(data, new String[]{"Employee ID", "Name", "Phone No"});
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        HourlyEmployee myData = (HourlyEmployee) data[rowIndex];
        return switch (columnIndex) {
            case 0:
                myData.getEmployeeNo();
            case 1:
                myData.getName();
            case 2:
                myData.getPhoneNumber();
            default: 
                 myData.getEmployeeNo();
        };
    }
}
