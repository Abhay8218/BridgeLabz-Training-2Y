class ServiceOverdueException extends Exception { public ServiceOverdueException(String msg){ super(msg);} }
class InvalidMileageException extends Exception { public InvalidMileageException(String msg){ super(msg);} }

class VehicleMaintenance {
    public void checkMaintenance(int mileage, boolean overdue)
            throws ServiceOverdueException, InvalidMileageException {

        if (mileage < 0) throw new InvalidMileageException("Invalid mileage value!");
        if (overdue) throw new ServiceOverdueException("Service is Overdue!");

        System.out.println("Vehicle Maintenance OK!");
    }

    public static void main(String[] args) {
        VehicleMaintenance v = new VehicleMaintenance();
        try {
            v.checkMaintenance(15000, true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
