class InvalidTemperatureException extends Exception { public InvalidTemperatureException(String msg){super(msg);} }

class TemperatureConverter {
    public void convert(double temp, char unit) throws InvalidTemperatureException {
        if ((unit == 'C' && temp < -273.15) || (unit == 'F' && temp < -459.67))
            throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");

        if (unit == 'C')
            System.out.println("Fahrenheit: " + ((temp * 9/5) + 32));
        else
            System.out.println("Celsius: " + ((temp - 32) * 5/9));
    }

    public static void main(String[] args) {
        TemperatureConverter t = new TemperatureConverter();
        try {
            t.convert(-500, 'F');
        } catch (InvalidTemperatureException e) {
            System.out.println(e.getMessage());
        }
    }
}
